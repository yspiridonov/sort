package ru.yspiridonov.sort.sorts;

/**
 * Created by yspiridonov on 08.03.17.
 */
public class QuickSort {

    /**
     * Быстрая сортировка: выбираем какой-то элемент в массиве, и начинаем искать значение слева от него,
     * которое больше, и значение справа от него, которое меньше, значения найдены, меняем их местами и так далее
     *
     * Время выполнения: O(n logn)
     *
     * Существуют рекомендации, когда элементов в массиве остается от 8 - 16, до целесообразно переходить на другой
     * алгоритм сортировки (что-то вроде Пузырьковой)
     *
     * @param array
     * @param start
     * @param end
     */
    public static void sort(int[] array, int start, int end) {
        if (start >= end) return;

        int i = start;
        int j = end;
        int cur = i - (i - j) / 2;

        while (i < j) {
            while (i < cur && array[i] <= array[cur]) {
                i++;
            }
            while (j > cur && array[j] >= array[cur]) {
                j--;
            }

            if (i < j) {
                int buf = array[i];
                array[i] = array[j];
                array[j] = buf;

                if (i == cur) {
                    cur = j;
                } else if (j == cur) {
                    cur = i;
                }
            }
        }

        sort(array, start, cur);
        sort(array, cur + 1, end);
    }
}
