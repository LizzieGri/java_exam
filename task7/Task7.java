package exam.task7;

import java.util.ArrayList;
import java.util.List;

/**
 * Основной метод.
 */
public class Task7 {
    public static void main(String[] args) {
        List<String> moves = new ArrayList<>(List.of("g8", "e7", "e6"));
        //List<String> moves2 = new ArrayList<>(List.of("g8", "e7", "c8"));

        List<ChessPosition> chessPositions = new ArrayList<>();

        for (String s : moves) {
            chessPositions.add(new ChessPosition(s));
        }

        try {
            ChessMove.checkMoves(chessPositions);
            System.out.println("OK");
        } catch (IllegalMoveException e) {
            e.printStackTrace();
        }
    }

}
