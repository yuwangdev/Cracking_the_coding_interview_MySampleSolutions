package Sorting;

/**
 * Created by yuwang on 5/24/16.
 * Selection sorting, in place
 */
public class SelectionSort {

    private static void sort(int[] array) {

        if (array == null || array.length <= 1) return;

        for (int i = 0; i <= array.length - 1; i++) {

            int minPosition = i;  // init a minPosition

            for (int j = i + 1; j <= array.length - 1; j++) {

                if (array[j] <= array[minPosition])
                    minPosition = j;   // find out where the min position is at this moment


            }

            int temp = array[i];
            array[i] = array[minPosition];
            array[minPosition] = temp;


        }

    }


    public static void main(String[] argus) {


        int[] test1 = {6, 5, 4, 2, 6, 2, 4, 6, 1};
        int[] test2 = {1};
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
