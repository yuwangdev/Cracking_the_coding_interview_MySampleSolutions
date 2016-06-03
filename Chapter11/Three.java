package Chapter11;

/**
 * Created by yuwang on 2016-06-02.
 * search an integer from a sorted array, this array has been rotated for several times on various pivot
 */
public class Three {

    private static int search(int[] test, int target) {

        return search(test, target, 0, test.length - 1);
    }

    private static int search(int[] test, int target, int start, int end) {

        if (start > end || test.length == 0 || test == null) {
            return -1;
        }

        int mid = (start + end) / 2;
        if (test[mid] == target) return mid;

        if (test[start] < test[mid]) {

            if (target >= test[start] && target <= test[mid]) {

                return search(test, target, start, mid - 1);
            } else {
                return search(test, target, mid + 1, end);
            }


        } else if (test[start] > test[mid]) {

            if (target >= test[mid] && target <= test[end]) {
                return search(test, target, mid + 1, end);
            } else {
                return search(test, target, start, mid - 1);
            }


        } else if (test[start] == test[mid]) {

            int tempResult = search(test, target, start, mid - 1);

            if (tempResult >= 0) {
                return tempResult;
            } else {
                tempResult = search(test, target, mid + 1, end);
                if (tempResult >= 0) return tempResult;
            }


        }

        return -1;


    }


    public static void main(String[] argues) {

        int[] test = {4, 5, 6, 7, 8, 9, 9, 2, 3};

        System.out.println(search(test, 2));

    }


}
