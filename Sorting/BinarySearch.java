package Sorting;

/**
 * Created by yuwang on 5/24/16.
 */
public class BinarySearch {

    private static boolean search(int[] sortedArray, int target) {

        if (sortedArray == null || sortedArray.length == 0) return false;

        if (sortedArray.length == 1 && sortedArray[0] == target) return true;

        return search(sortedArray, target, 0, sortedArray.length - 1);
    }

    private static boolean search(int[] sortedArray, int target, int start, int end) {

        if (start > end) return false;

        int mid = start + (end - start) / 2;

        if (sortedArray[mid] == target) return true;

        if (search(sortedArray, target, start, mid - 1) || search(sortedArray, target, mid + 1, end)) return true;

        return false;


    }


    public static void main(String argus[]) {

        int[] test1 = {1, 2, 3, 4, 5, 6, 7, 8, 10};
        int[] test2 = {1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println(search(test1, 2));
        System.out.println(search(test1, 15));
        System.out.println(search(test2, 1));


    }


}
