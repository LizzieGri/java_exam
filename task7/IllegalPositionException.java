package exam.task7;

/**
 * Класс обработки ошибок в позиции фигуры.
 */
public class IllegalPositionException extends Exception {

    public final String position;

    public IllegalPositionException(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Позиция неверна !: " + position;
    }
}
