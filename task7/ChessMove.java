package exam.task7;

import java.util.List;

/**
 * Класс проверки првильности хода.
 */
public class ChessMove {

    public static void checkMoves(List<ChessPosition> positions) throws IllegalMoveException {
        for (int i = 0; i < positions.size() - 1; i++) {
            ChessPosition first = positions.get(i);
            ChessPosition second = positions.get(i + 1);
            if (!(Math.abs(second.getXPosition() - first.getXPosition()) == 1
                    && Math.abs(second.getYPosition() - first.getYPosition()) == 2
                    || Math.abs(second.getXPosition() - first.getXPosition()) == 2
                    && Math.abs(second.getYPosition() - first.getYPosition()) == 1)) {
                throw new IllegalMoveException(first, second);
            }
        }
    }
}
