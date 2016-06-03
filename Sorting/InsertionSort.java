package Sorting;

/**
 * Created by yuwang on 5/24/16.
 */
public class InsertionSort {

    public static void sort(int[] array) {

        if (array == null || array.length <= 1) return;

        for (int i = 0; i < array.length - 1; i++) {

            int backup = array[i + 1];

            // method 1

            //int j = i0;

//            for (j = i; j >= 0 && array[j] > backup; j--) {
//
//                array[j + 1] = array[j];
//                System.out.print(j);
//
//            }

            ////


            /// method 2
            int j = i;

            while (j >= 0) {

                if (array[j] > backup) {
                    array[j + 1] = array[j];
                    j--;


                } else {
                    break;
                }


            }


            //  System.out.println();


            array[j + 1] = backup;

            // printArray(array);
            ////


        }


    }


    public static void main(String[] argus) {


        int[] test1 = {6, 5, 4, 5, 6, 2, 4, 6, 1};
        int[] test2 = {2};
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
