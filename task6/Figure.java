package exam.task6;

/**
 * Абстрактный класс фигура.
 */
abstract class Figure implements Movable{

    abstract String getDescription();

    abstract boolean getPoint(float x, float y);

}
