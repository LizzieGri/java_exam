package exam.task7;

/**
 * Класс обработки ошибок при ходе.
 */
public class IllegalMoveException extends Exception {

    public final ChessPosition first;
    public final ChessPosition second;

    public IllegalMoveException(ChessPosition first, ChessPosition second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "Конь так не ходит: " + first.getPosition() + " -> " + second.getPosition();
    }
}
