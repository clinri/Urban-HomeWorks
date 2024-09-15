import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Необходимо написать программу, которая дописывает файл.
 * Программа предлагает записать данные фразой "Вводите данные для записи".
 * После того как введены данные в консоль (необходимо использовать класс Scanner для ввода данных в консоль),
 * программа предлагает дополнить информацию фразой «Введите что-нибудь еще» и данные можно дописать.
 * Вся работа по заполнению файла ведется в бесконечном цикле.
 * Если пользователь введет 0, программа завершается строкой «Файл создан»
 */

class AppendFileWriter {
    private final File file;

    public AppendFileWriter(String filePath) {
        file = new File(filePath);
    }

    public void start() {
        System.out.println("Вводите данные для записи (введите '0' для выхода):");
        try (
                FileWriter fileWriter = new FileWriter(file, true);
                Scanner scanner = new Scanner(System.in)
        ) {
            while (true) {
                String textForAppend = scanner.nextLine();
                if (textForAppend.equals("0")) {
                    break;
                }
                fileWriter.write(textForAppend + System.lineSeparator());
                System.out.println("Введите что-нибудь еще (введите '0' для выхода):");
            }
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
        System.out.println("Файл создан");
    }
}
