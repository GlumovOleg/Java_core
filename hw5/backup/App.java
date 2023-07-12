package hw5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class App {

    public static void main(String[] args) throws IOException {
        File sourceDir = new File("C:\\GeekBrains\\javacore\\home_work\\hw5");
        File destDir = new File("C:\\GeekBrains\\javacore\\home_work\\hw5\\backup");

        copyDirectory(sourceDir, destDir);
    }

    private static void copyDirectory(File sourceDir, File destDir) throws IOException {
        if (!destDir.exists()) {
            destDir.mkdir();
        }

        for (String f : sourceDir.list()) {
            File source = new File(sourceDir, f);
            File destination = new File(destDir, f);

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


    // public static void main(String[] args) {
    //      File sourceDir = new File("/tmp/from");
    //     File destDir = new File("/tmp/to");

    //     CopyDirectory(sourceDir, destDir);

    // }
}
