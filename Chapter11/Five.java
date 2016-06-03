package Chapter11;

/**
 * Created by yuwang on 2016-06-02.
 * find a stringr from a string[] that has several blank string
 */
public class Five {


    private static int search(String[] array, String target) {

        return search(array, target, 0, array.length - 1);
    }

    private static int search(String[] array, String target, int start, int end) {

        if (array.length == 0 || array == null || start > end) {
            return -1;
        }

        int mid = (start + end) / 2;
        if (target.compareTo(array[mid]) == 0) {
            return mid;
        }


        // move mid to the closest non-empty position
        if (array[mid].isEmpty()) {

            int leftOfMid = mid - 1;
            int rightOfMid = mid + 1;

            while (true) {

                if (leftOfMid < start || rightOfMid > end) {
                    return -1;

                }

                if (leftOfMid >= start && !array[leftOfMid].isEmpty()) {
                    mid = leftOfMid;
                    break;
                }

                if (rightOfMid <= end && !array[rightOfMid].isEmpty()) {
                    mid = rightOfMid;
                    break;
                }

                leftOfMid--;
                rightOfMid++;


            }

        }


        if (target.compareTo(array[mid]) < 0) {
            return search(array, target, start, mid);
        }


        if (target.compareTo(array[mid]) > 0) {
            return search(array, target, mid, end);
        }


        return -1;
    }


    public static void main(String[] argues) {

        String[] test = {"abc", "apple", "banada", "", "", "mac", "ggg", "", "letter", "sfdasfasfs"};

        System.out.println(search(test, "letter"));

    }


}
