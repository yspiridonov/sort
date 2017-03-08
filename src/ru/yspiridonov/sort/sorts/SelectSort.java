package ru.yspiridonov.sort.sorts;

import static ru.yspiridonov.sort.utils.Utils.INITIAL_ARRAY;
import static ru.yspiridonov.sort.utils.Utils.SORTED_ARRAY;
import static ru.yspiridonov.sort.utils.Utils.printArray;

/**
 * Created by yspiridonov on 06.03.17.
 */
public class SelectSort {

    public static int getMinIndex(int[] array, int idx) {
        int min = array[idx];
        int minIdx = idx;
        for (int i = idx; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIdx = i;
            }
        }
        return minIdx;
    }

    /**
     * Сортировка выбором (это модификация пузырьковой сортировки)
     * Бегаем по массивы и на каждой итерации ищем минимальный элемент и ставим его в начало массива
     *
     * Время выполнения O(n^2)
     * Память O(1)
     *
     * @param array
     */
    public static void sort(int[] array) {
        printArray(array, INITIAL_ARRAY);
        for (int i = 0; i < array.length; i++) {
            int j = getMinIndex(array, i);
            int buf = array[i];
            array[i] = array[j];
            array[j] = buf;
        }
        printArray(array, SORTED_ARRAY);
    }
}
