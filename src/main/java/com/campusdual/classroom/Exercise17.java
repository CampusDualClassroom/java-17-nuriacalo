package com.campusdual.classroom;

import java.sql.Array;

public class Exercise17 {
    public static int[] createEmptyIntArray(int positions) {
        int[] intArray = new int[positions];
        return intArray;
    }

    public static String[] createInitializedStringArray() {
        String[] stringArray = new String[]{"1", "2", "3"};
        return stringArray;
    }

    public static void populateArray(int[] array, int index, int value) {
        array[index] = value;
    }

    public static int arrayLength(int[] array) {
        return array.length;
    }

    public static void showValue(int[] array, int index) {
        if (array != null && index >= 0 && index < array.length) {
            System.out.println("The value of Index " + index + ": " + array[index]);
        } else {
            System.out.println("The index is not in the array.");
        }
    }

    public static void main(String[] args) {
        int[] intArray = createEmptyIntArray(3);
        String[] stringArray = createInitializedStringArray();
        populateArray(intArray, 0, 10);
        populateArray(intArray, 1, 9);
        populateArray(intArray, 2, 8);
        showValue(intArray, 0);
        System.out.println(arrayLength(intArray));
    }
}
