package exam.task6;

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

    @Override
    boolean getPoint(float x, float y) {
        return (Math.sqrt(Math.pow((double) (x - center.getX()), 2) + Math.pow((double) (y - center.getY()), 2)))
                <= radius;
    }

    @Override
    public void move(float dx, float dy) {
        center.setX(center.getX() + dx);
        center.setY(center.getY() + dy);
    }
}
