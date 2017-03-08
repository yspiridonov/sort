package ru.yspiridonov.sort;

import ru.yspiridonov.sort.sorts.BubbleSort;
import ru.yspiridonov.sort.sorts.QuickSort;
import ru.yspiridonov.sort.sorts.SelectSort;
import ru.yspiridonov.sort.utils.Utils;

import static ru.yspiridonov.sort.utils.Utils.*;

public class Main {

    public static void main(String[] args) {
        int[] array1 = Utils.initArray(7);
        int[] array2 = Utils.initArray(10);
        System.out.println(BUBBLE_SORT);
        BubbleSort.sort(array1);
        BubbleSort.sort(array2);

        array1 = Utils.initArray(9);
        array2 = Utils.initArray(12);
        System.out.println(SELECT_SORT);
        SelectSort.sort(array1);
        SelectSort.sort(array2);

        array1 = Utils.initArray(17);
        array2 = Utils.initArray(20);
        System.out.println(QUICK_SORT);
        printArray(array1, INITIAL_ARRAY);
        QuickSort.sort(array1, 0, array1.length - 1);
        printArray(array1, SORTED_ARRAY);
        printArray(array2, INITIAL_ARRAY);
        QuickSort.sort(array2, 0, array2.length - 1);
        printArray(array2, SORTED_ARRAY);
    }
}
