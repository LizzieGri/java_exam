package exam.task5;

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
}
