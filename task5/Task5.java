package exam.task5;

/**
 * Основной метод.
 */
public class Task5 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(new Point(100, 100), new Point(150, 200));

        Annotation annotationRec = new Annotation("Car", rectangle);

        System.out.println(annotationRec.toString());

    }
}
