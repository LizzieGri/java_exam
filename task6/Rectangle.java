package exam.task6;


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

    @Override
    boolean getPoint(float x, float y) {
        return (x <= lowerLeftCorner.getX() && x >= upperRightCorner.getX())
                && (y >= lowerLeftCorner.getY() && y <= upperRightCorner.getY());
    }

    @Override
    public void move(float dx, float dy) {
        lowerLeftCorner.setX(lowerLeftCorner.getX() + dx);
        lowerLeftCorner.setY(lowerLeftCorner.getY() + dy);
        upperRightCorner.setX(upperRightCorner.getX() + dx);
        upperRightCorner.setY(lowerLeftCorner.getY() + dy);
    }
}
