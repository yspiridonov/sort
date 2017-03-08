package ru.yspiridonov.sort.utils;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by yspiridonov on 06.03.17.
 */
public class Utils {
    public static final String BUBBLE_SORT = "BUBBLE SORT";
    public static final String QUICK_SORT = "QUICK SORT";
    public static final String SELECT_SORT = "SELECT SORT";
    public static final String INITIAL_ARRAY = "Initial array";
    public static final String SORTED_ARRAY = "Sorted array";

    public static void printArray(int[] array, String caption) {
        System.out.println("=== " + caption + " ===");
        System.out.println(Arrays.toString(array));
    }

    public static int[] initArray(int lengthOfArray) {
        int[] array = new int[lengthOfArray];
        for(int i = 0; i < lengthOfArray; i++) {
            array[i] = new Random().nextInt(100);
        }
        return array;
    }
}
