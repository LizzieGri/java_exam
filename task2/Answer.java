package exam.Task2;

/**
 * Класс подсчета ответа.
 */
public class Answer {

    /**
     * Форматироване в человеческий вид.
     *
     * @param byteSize входной размер в байтах
     * @param pow степень возведения
     * @return число в человекочитаемом виде
     */
    public double getAnswer(double byteSize, int pow) {
        return byteSize / Math.pow(1024, pow);
    }
}
