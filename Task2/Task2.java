package exam.Task2;

import java.util.Scanner;

/**
 * Основной метод.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Answer answer = new Answer();

        System.out.print("Введите число в байтах: ");
        double byteSize = scanner.nextInt();

        if (byteSize <= 1024) {
            if (byteSize == 1024) {
                System.out.println("1.0 КВ");
            }
            System.out.println(String.format("%.1f", byteSize) + " В");
        } else if (byteSize > 1024 && byteSize <= Math.pow(1024, 2)) {
            System.out.println((String.format("%.1f", answer.getAnswer(byteSize, 1))) + " KB");
        } else if (byteSize > Math.pow(1024, 2) && byteSize <= Math.pow(1024, 3)) {
            System.out.println(String.format("%.1f", answer.getAnswer(byteSize, 2)) + " MB");
        } else if (byteSize > Math.pow(1024, 3) && byteSize <= Math.pow(1024, 4)) {
            System.out.println(String.format("%.1f", answer.getAnswer(byteSize, 3)) + " GB");
        } else {
            System.out.println(String.format("%.1f", answer.getAnswer(byteSize, 4)) + " TB");
        }
    }
}
