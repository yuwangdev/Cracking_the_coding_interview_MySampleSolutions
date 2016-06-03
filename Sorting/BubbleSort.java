package Sorting;

/**
 * Created by yuwang on 2016-05-24.
 * Bubble sort, in place
 */
public class BubbleSort {


    private static void sort(int[] array) {

        if (array == null || array.length <= 1) return;


        for (int i = 0; i < array.length - 1; i++) {

            for (int j = 0; j < array.length - i - 1; j++) {

                if (array[j] >= array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }
            }

        }

    }


    public static void main(String[] argus) {


        int[] test1 = {6, 5, 4, 2, 6, 2, 4, 6, 1};
        int[] test2 = {0};
        int[] test3 = {1, 2, 3, 4, -100, 55656, 11, 0, -1000};

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
