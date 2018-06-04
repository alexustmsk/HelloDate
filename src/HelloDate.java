import java.util.*;

/**Первая программа-пример книги.
 * Выводит строку и текущее число, а также свойства.
 * @author Александр Устюжанин
 * @version 1.0
 */
public class HelloDate {
    /** Точка входа в класс и приложение
     * @param args Массив строковых аргументов
     * @throws Exception Исключения не выдаются
     */
    public static void main(String[] args) {
        System.out.print("Привет, сегодня: ");
        System.out.println(new Date());


        //:object/ShowProperties
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(
                System.getProperty("java.library.path"));
    }
}