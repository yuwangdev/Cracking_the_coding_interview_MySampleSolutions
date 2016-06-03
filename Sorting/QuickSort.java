package Sorting;

/**
 * Created by yuwang on 5/24/16.
 * <p>
 * Quick Sort in place
 */
public class QuickSort {


    public static void sort(int[] array) {

        if (array == null || array.length <= 1) return;

        quickSort(0, array, array.length - 1);


    }

    private static void quickSort(int start, int[] array, int end) {

      /*
      * 1) choose the first element as pivot, and make the i equal to start in order to mark the pivot position i
      * 2) from the second element to the end, for loop
      *    if array[j]<pivotValue, swap between array[j] and array[i+1], and move i to next by i+1
      *    then, make the old pivot position's value = new array[i] (i.e. old array[j] value), and new array[i] equal to old pivotValue
      * 3) recursion on left and right
      * */

        if (start < end) {

            int i = start;
            int pivotValue = array[i];

            for (int j = i + 1; j <= end; j++) {

                if (array[j] < pivotValue) {

                    int temp = array[j];
                    array[j] = array[++i];
                    array[i] = temp;


                }


            }
            // printArray(array);

            array[start] = array[i];
            array[i] = pivotValue;

            printArray(array);

            quickSort(start, array, i - 1);
            quickSort(i + 1, array, end);

        }

    }


    public static void main(String[] argus) {


        int[] test1 = {6, 5, 4, 2, 6, 2, 4, 6, -1};
        int[] test2 = {4};
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
