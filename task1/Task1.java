package exam.Task1;

import java.util.Scanner;

/**
 * Основной метод.
 */
public class Task1 {
    public static void main(String[] args) {
        SideLength sideLength = new SideLength();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите координату х вершины №1: ");
        double x1 = scanner.nextInt();
        System.out.print("Введите координату y вершины №1: ");
        double y1 = scanner.nextInt();
        System.out.print("Введите координату x вершины №2: ");
        double x2 = scanner.nextInt();
        System.out.print("Введите координату y вершины №2: ");
        double y2 = scanner.nextInt();
        System.out.print("Введите координату x вершины №3: ");
        double x3 = scanner.nextInt();
        System.out.print("Введите координату y вершины №3: ");
        double y3 = scanner.nextInt();

        double a = sideLength.getSideLength(x1, y1, x2, y2);
        double b = sideLength.getSideLength(x1, y1, x3, y3);
        double c = sideLength.getSideLength(x2, y2, x3, y3);

        if (a + b <= c || a + c <= b || b + c <= a)
            System.out.println("Треугольника не существует");
        else {
            double p = (a + b + c) / 2.0;
            double square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.println("Площадь: " + String.format("%.1f", square));
        }

    }

}
