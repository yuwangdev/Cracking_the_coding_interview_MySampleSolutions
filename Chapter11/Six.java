package Chapter11;

/**
 * Created by yuwang on 2016-06-02.
 * Search an integer from a matrox, row and column are all upwards sorted
 */
public class Six {

    private static boolean search(int[][] matrix, int target) {

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;

        int firstRow = 0;
        int lastColumn = matrix.length - 1;

        while (firstRow < matrix.length && lastColumn >= 0) {

            if (matrix[firstRow][lastColumn] == target) {
                return true;
            }

            if (matrix[firstRow][lastColumn] > target) {
                lastColumn--;
            }

            if (matrix[firstRow][lastColumn] < target) {
                firstRow++;
            }


        }


        return false;
    }


    public static void main(String[] argues) {

        int[][] matrix = {{15, 20, 40, 85}, {20, 35, 80, 95}, {30, 55, 95, 105}, {40, 80, 100, 120}};

        System.out.println(search(matrix, 95));
        System.out.println(search(matrix, 15));
        System.out.println(search(matrix, 85));
        System.out.println(search(matrix, 55));
        System.out.println(search(matrix, 45));

    }


}
