package exam.task7;

/**
 * Класс парсинга позиции фигуры.
 */
public class ChessPosition {

    private int xPosition;
    private int yPosition;
    private String position;

    public ChessPosition(String position) {
        parse(position);
    }

    public int getXPosition() {
        return xPosition;
    }

    public int getYPosition() {
        return yPosition;
    }

    public String getPosition() {
        return position;
    }

    private void parse(String position) {
        char character = position.charAt(0);
        String allChars = "abcdefgh";

        if (allChars.contains(""+character)) {
            this.xPosition = allChars.indexOf(character) + 1;
        } else {
            try {
                throw new IllegalPositionException(position);
            } catch (IllegalPositionException e) {
                e.printStackTrace();

            }
        }

        char number = position.charAt(1);

        if (Character.isDigit(number) && Character.getNumericValue(number) <= 8) {
            this.yPosition = Character.getNumericValue(number);
        } else {
            try {
                throw new IllegalPositionException(position);
            } catch (IllegalPositionException e) {
                e.printStackTrace();
            }
        }

        this.position = position;
    }
}
