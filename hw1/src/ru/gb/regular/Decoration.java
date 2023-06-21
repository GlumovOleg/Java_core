package hw1.src.ru.gb.regular;

/**
 * Декоратор.
 * Он декорирует, то есть, накладывает на результат декорации.
 * Внешний вид важен, поэтому этот класс существует.
 */

public class Decoration {

        /**
     * Функция декорирования числа для вывода в консоль
     * в виде строки с преамбулой "Вот ваше число"
     * @param a число требующее декорации.
     * @return Отформатированная строка.
     */

    public static String decorate(int a) {
        return String.format("Here is your number %d", a);
    }

}
