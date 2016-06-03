package Chapter9;

/**
 * Created by yuwang on 6/1/16.
 * find a magic indexing position from a sorted array
 */
public class Three {

    private static int findMagicIndexing_Unique(int[] array) {

        return findMagicIndexing_Unique(array, 0, array.length - 1);

    }

    private static int findMagicIndexing_Unique(int[] array, int start, int end) {
        // a slight revision on BST

        if (array.length == 0 || array == null) return -1;

        if (start > end) return -1;

        int mid = (start + end) / 2;

        if (array[mid] == mid) {
            return mid;
        } else {

            if (array[mid] > mid) {
                return findMagicIndexing_Unique(array, start, mid - 1);
            }

            if (array[mid] < mid) {
                return findMagicIndexing_Unique(array, mid + 1, end);
            }

        }
        return -1;
    }


    private static int findMagicIndexing_Dup(int[] array) {

        return findMagicIndexing_Dup(array, 0, array.length - 1);

    }

    private static int findMagicIndexing_Dup(int[] array, int start, int end) {

        if (array.length == 0 || array == null) return -1;
        if (start > end) return -1;

        int mid = (start + end) / 2;

        if (array[mid] == mid) {
            return mid;
        }

        int leftBoundary = Math.min(mid - 1, array[mid]);
        int result = findMagicIndexing_Dup(array, start, leftBoundary);

        if (result > 0) return result;

        int rightBoundary = Math.max(mid + 1, array[mid]);
        result = findMagicIndexing_Dup(array, rightBoundary, end);

        if (result > 0) return result;


        return -1;
    }


    public static void main(String[] argues) {

        int[] test1 = {-4, 1, 5, 6, 7, 8, 10, 12};  // unique array
        int[] test2 = {-4, 1, 3, 5, 5, 8, 10, 10};  // duplicate array

        System.out.println(findMagicIndexing_Unique(test1));
        System.out.println(findMagicIndexing_Dup(test2));


    }

}
