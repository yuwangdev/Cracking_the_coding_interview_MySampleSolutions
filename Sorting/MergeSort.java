package Sorting;

/**
 * Created by yuwang on 5/24/16.
 * its PROBLEMATIC!!!
 */
public class MergeSort {


    public static void sort(int[] array) {

        if (array == null || array.length <= 1) return;

        int[] temp = new int[array.length];

        mergeSort(array, temp, 0, array.length - 1);


    }

    private static void mergeSort(int[] array, int[] temp, int start, int end) {

        if (start < end-1) {

            int start1 = start;
            int mid = start + (end - start) / 2;
            int end1 = mid - 1;
            int start2 = mid;
            int end2 = end;

            int k = start;

            System.out.print("start=" + start + " end=" + end+ " mid="+mid);
            System.out.println();

            // divide
            mergeSort(array, temp, start1, end1);
            mergeSort(array, temp, start2, end2);

            // conquer
            while (start1 <= end1 && start2 <= end2) {

                temp[k++] = array[start1] <= array[start2] ? array[start1++] : array[start2++];

            }

            // put other remained element into the temp
            while (start1 <= end1) {
                temp[k++] = array[start1++];
            }

            while (start2 <= end2) {
                temp[k++] = array[start2++];
            }

            //convert all the temp back to the array, for the in-place purpose
            for (k = start; k <= end; k++) {
                array[k] = temp[k];
            }


        }
    }


    public static void main(String[] argus) {


        int[] test1 = {6, 5, 4, 2, 6, 2, 4, 6};
        int[] test2 = {5};
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
