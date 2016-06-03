package Chapter1;

/**
 * Created by yuwang on 5/11/16.
 * change to zero if a row or column has zero
 */

public class Seven {

    public static void changeToZero(int[][] matrix) {

        Boolean[] row = new Boolean[matrix.length];
        Boolean[] column = new Boolean[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) row[i] = false;
        for (int i = 0; i < matrix[0].length; i++) column[i] = false;


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                if (matrix[i][j] == 0) {
                    row[i] = true;
                    column[j] = true;

                }
            }
        }


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                if (row[i] || column[j]) matrix[i][j] = 0;
            }
        }

    }


    public static void main(String[] argus) {

        int[][] matrix = {{1, 2, 3, 4}, {5, 0, 7, 8}, {11, 12, 13, 14}, {15, 16, 17, 0}};

        for (int i = 0; i < matrix.length; i++) {

            System.out.println(matrix[i][0] + " " + matrix[i][1] + " " + matrix[i][2] + " " + matrix[i][3]);


        }
        changeToZero(matrix);

        System.out.println("   ");

        for (int i = 0; i < matrix.length; i++) {

            System.out.println(matrix[i][0] + " " + matrix[i][1] + " " + matrix[i][2] + " " + matrix[i][3]);


        }


    }


}
