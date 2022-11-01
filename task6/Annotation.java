package exam.task6;

/**
 * Класс предоставления данных разметки
 */
public class Annotation {

    private String description;

    private Figure figure;

    public Annotation(String description, Figure figure) {
        this.description = description;
        this.figure = figure;
    }

    public String getDescription() {
        return description;
    }

    public Figure getFigure() {
        return figure;
    }

    @Override
    public String toString() {
        return figure.getDescription() + ": " + description;
    }

    Annotation findByPoint(float x, float y) {
        if (getFigure().getPoint(x, y)) {
            return this;
        } else {
            return null;
        }
    }

    Annotation findByLabel(String label) {
        if (getDescription().contains(label)) {
            return this;
        } else {
            return null;
        }
    }
}
