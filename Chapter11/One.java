package Chapter11;


/**
 * Created by yuwang on 2016-06-02.
 * Two sorted array A and B, A has enough room at the back, sort together A and B
 */
public class One {

    private static int[] sort(int[] a, int[] b, int lengthOfA) {

        int newLength = lengthOfA + b.length;

        int lastAIndex = lengthOfA - 1;
        int lastBIndex = b.length - 1;
        int lastNewIndex = newLength - 1;

        while (lastAIndex >= 0 && lastBIndex >= 0) {

            if (a[lastAIndex] <= b[lastBIndex]) {
                a[lastNewIndex--] = b[lastBIndex--];
            }

            if (a[lastAIndex] > b[lastBIndex]) {
                a[lastNewIndex--] = a[lastAIndex--];
            }

        }

        while (lastBIndex >= 0) {
            a[lastNewIndex--] = b[lastBIndex--];


        }


        return a;
    }


    public static void main(String[] argues) {

        int[] A = {1, 3, 5, 7, 9, 11, 13, 15, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] B = {0, 2, 4, 6, 8, 10, 12, 14};

        int[] result = sort(A, B, 8);


        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");


        }
    }


}
