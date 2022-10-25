package exam.Task1;

/**
 * Получение длины стороны треугольника.
 */
public class SideLength {

    /**
     * Вычисление стороны треугольнка по координатам точек.
     *
     * @param xPoint1 координата x первой точки
     * @param yPoint1 координата y первой точки
     * @param xPoint2 координата x второй точки
     * @param yPoint2 координата y второй точки
     * @return длина стороны
     */
    public double getSideLength(double xPoint1, double yPoint1, double xPoint2, double yPoint2) {
        return Math.sqrt((xPoint1 - xPoint2) * (xPoint1 - xPoint2) + (yPoint1 - yPoint2) * (yPoint1 - yPoint2));
    }
}
