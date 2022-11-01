package exam.task5;

/**
 * Прямоугольник.
 */
public class Rectangle extends Figure {

    private Point lowerLeftCorner;

    private Point upperRightCorner;

    public Rectangle(Point lowerLeftCorner, Point upperRightCorner) {
        this.lowerLeftCorner = lowerLeftCorner;
        this.upperRightCorner = upperRightCorner;
    }

    @Override
    String getDescription() {
        return "R (" + lowerLeftCorner.getX() + ", " + lowerLeftCorner.getY() + "), "
                + "(" + upperRightCorner.getX() + ", " + upperRightCorner.getY() + ")";
    }
}
