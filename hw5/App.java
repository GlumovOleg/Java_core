package hw5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {
        File sourceDir = new File("C:\\GeekBrains\\javacore\\home_work\\hw5");
        File destinationDir = new File("C:\\GeekBrains\\javacore\\home_work\\hw5\\backup");

        copyDirectory(sourceDir, destinationDir);
    }

    private static void copyDirectory(File sourceDir, File destinationDir) throws IOException {
        if (!destinationDir.exists()) {
            destinationDir.mkdir();
        }

        for (String f : sourceDir.list()) {
            File source = new File(sourceDir, f);
            File destination = new File(destinationDir, f);

            if (source.isDirectory()) {
                copyDirectory(source, destination);
            } else {
                copyFile(source, destination);
            }
        }
    }

    private static void copyFile(File sourceFile, File destinationFile) throws IOException {
        FileInputStream input = new FileInputStream(sourceFile);
        FileOutputStream output = new FileOutputStream(destinationFile);

        byte[] buf = new byte[1024];
        int bytesRead;

        while ((bytesRead = input.read(buf)) > 0) {
            output.write(buf, 0, bytesRead);
        }

        input.close();
        output.close();
    }
    }
}
