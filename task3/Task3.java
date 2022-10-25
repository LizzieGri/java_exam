package exam.task3;

import java.util.*;

/**
 * Основной метод.
 */
public class Task3 {
    public static void main(String[] args) {

        //List<Integer> integers = new ArrayList<>(Arrays.asList(6, 28, 1, 17));
        //List<Integer> integers = new ArrayList<>(Arrays.asList(6, 28, 17, 1));
        //List<Integer> integers = new ArrayList<>(Arrays.asList(1, 17, 6, 28));
        //List<Integer> integers = new ArrayList<>(Arrays.asList(28, 6, 17, 1));
        //List<Integer> integers = new ArrayList<>(Arrays.asList(28, 5, 11, 1, 44, 17, 8));
        List<Integer> integers = new ArrayList<>(Arrays.asList(10, 1, 3, 5, 6, 7));

        //наибольшее в массиве integers
        int max = Collections.max(integers);

        //наименьшее в массиве integers
        int min = Collections.min(integers);

        //переставляем min в начало, max - в конец массива integers
        Collections.swap(integers, 0, integers.indexOf(min));
        Collections.swap(integers, integers.size() - 1, integers.indexOf(max));

        System.out.print(integers);

    }
}

