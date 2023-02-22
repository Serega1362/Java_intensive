package Algoritms;

import java.util.Arrays;

public class Bubbles {
    public static void main(String[] args) {
        int[] array = {17, 3, 8, 11, 7, 5, 25, 4};

        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;

                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
