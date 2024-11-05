import java.io.IOException;

/**
 * <b>Сложение двух чисел </b>
 * Класс Number реализует приложение, которое
 * складывает два заданных цулых числа и выводит
 * результат на экран.
 *
 * <b>Примечание:</b>
 * @author  Alexandr Mulyugin
 * @version 1.0
 * @since 2024-11-10
 */
public class Number {

    /**
     * Метод используется для создания двух целых чисел. Это
     * простейшая форма метод класса, просто чтобы
     * показать использование различных тегов javadoc.
     * @param numberFirst - первый параметр метода sum
     * @param numberSecond - второй параметр метода sum
     * @return int - тип возвращаемого значения суммы numberFirst и numberSecond.
     */

    public int sum(int numberFirst, int numberSecond){ return numberFirst + numberSecond; }

    /**
     * Это основной метод, использованный метод sum.
     * @param args Не используется.
     * @throws IOException При ошибке ввода
     * @see IOException
     */
    public static void main(String[] args) throws IOException {
        Number number = new Number();
        int sum = number.sum(10, 20);
        System.out.println("Суммой 10 и 20 является :" + sum);

    }
}
