package src.ru.gb.sample;

import src.ru.gb.regular.Decoration;
import src.ru.gb.regular.OtherClass;

/**
 * Основной класс приложения. Здесь мы можем описать
 * его основные назначения и способы взамодействия с ним.
 */

public class Main {

    /**
     * Точка входа в прогарамму. С неё всегда всё начинается.
     * @param args стандартные аргументы командной строки.
     */
    public static void main(String[] args) {

        int result = OtherClass.add(2, 4);
        System.out.println(Decoration.decorate(result));
        result = OtherClass.sub(2, 4);  
        System.out.println(Decoration.decorate(result));
        result = OtherClass.mul(2, 4);
        System.out.println(Decoration.decorate(result));
        result = OtherClass.dev(2, 4);
        System.out.println(Decoration.decorate(result));

    }
}
