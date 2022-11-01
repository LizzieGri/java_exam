package exam.task5;

/**
 * Окружность.
 */
public class Circle extends Figure {

    private Point center;

    private float radius;

    public Circle(Point center, float radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    String getDescription() {
        return "C (" + center.getX() + ", " + center.getY() + "), " + radius;
    }
}
