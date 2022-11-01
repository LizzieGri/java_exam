package exam.task6;

/**
 * Основной метод.
 */
public class Task6 {
    public static void main(String[] args) {
        Circle circle = new Circle(new Point(100, 100), 50);
        System.out.println(circle.getDescription());
        circle.move(100,100);
        System.out.println(circle.getDescription());
    }
}
