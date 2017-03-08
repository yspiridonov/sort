package ru.yspiridonov.sort.sorts;

import static ru.yspiridonov.sort.utils.Utils.INITIAL_ARRAY;
import static ru.yspiridonov.sort.utils.Utils.SORTED_ARRAY;
import static ru.yspiridonov.sort.utils.Utils.printArray;

/**
 * Created by yspiridonov on 06.03.17.
 */
public class BubbleSort {

    /**
     * Пузырьковая сортировка: гоняем по массиву, и сравниваем два ближайших элемента,
     * если первый элемент больше второго, то выполняем перестановку. Проходы по массиву
     * продолжаем до тех пор пока массив будет неотсортирован
     *
     * Скорость выполнения O(n^2)
     * Память: O(1)
     *
     * @param array
     */
    public static void sort(int[] array) {
        int i = 0;

        printArray(array, INITIAL_ARRAY);

        for (int j = 0; j < array.length - 1; j ++) {
            for (i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int buf = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buf;
                }
            }
        }

        printArray(array, SORTED_ARRAY);
    }
}
