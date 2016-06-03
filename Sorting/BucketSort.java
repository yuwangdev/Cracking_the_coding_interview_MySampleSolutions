package Sorting;

/**
 * Created by yuwang on 5/25/16.
 * Bucket sort: applicable to sorting an unisigned int array
 */
public class BucketSort {


    private static void sort(int[] array) {

        if (array == null || array.length <= 1) return;

        final int MAX_VALUE = 100000;

        int[] temp = new int[MAX_VALUE];

        sort(array, temp, MAX_VALUE);


    }

    private static void sort(int[] array, int[] temp, int max) {


        for (int i = 0; i < array.length; i++) {
            temp[array[i]]++;
        }


        for (int i = 0, j = 0; i < max; i++) {

            while (--temp[i] >= 0) {

                array[j++] = i;
            }


        }


    }


    public static void main(String[] argus) {


        int[] test1 = {6, 5, 4, 2, 6, 2, 4, 6};
        int[] test2 = {-1};
        int[] test3 = {1, 2, 3, 4, 100, 55656, 11, 0, 1000};

        sort(test1);
        sort(test2);
        sort(test3);

        printArray(test1);
        printArray(test2);
        printArray(test3);


    }


    private static void printArray(int[] array) {

        for (int i = 0; i <= array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();


    }
}
