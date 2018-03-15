package com.zuosh.bt;

/**
 * Created by zuoshuai on 2018/3/1.
 */
public class TestSort {
    public static void main(String[] args) {
        //insert
        int[] array = {1, 3, 2, 2, 6, 8, 1, 2, 11, 2};
        //bubble
//        sortUseBubble(array);
        //insert
        for (int i = 1; i < array.length - 1; i++) {
            int curr = array[i];
            if (array[i] < array[i - 1]) {
                for (int j = i - 1; j >= 0; j--) {
                    if (array[j] <= curr) {
                        int tmp = array[j+1];
                        array[j+1] = array[i];
                        array[i] = tmp;
                        break;
                    }
                }
            }
            printArray(array);
        }
//        printArray(array);

    }

    private static void sortUseBubble(int[] array) {
        for (int i = 0; i < array.length; i++) {
            //
            for (int j = 0; j < array.length - i - 1; j++) {
                //
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
            printArray(array);
        }
    }

    private static void printArray(int[] array) {
        for (int k : array) {
            System.out.print(k + " ");
        }
        System.out.println();
    }
}
