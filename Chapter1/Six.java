package Chapter1;

/**
 * Created by yuwang on 5/10/16.
 * rotate N*N matrix in place by 90 degree
 * namely: change between column and row
 */
public class Six {

    public static void rotate(int[][] matrix, int n) {

        if (matrix == null) return;

        for (int layer = 0; layer < matrix.length / 2; layer++) {

            int first = layer;
            int last = n - layer - 1;

            for (int i = first; i < last; i++) {

                int offset = i - first;
                int tempOnTop = matrix[layer][i];
                // if i here is replaced by offset, there would be many offsets that have the same value, since it is the differential value
                matrix[layer][i] = matrix[last - offset][layer];
                matrix[last - offset][layer] = matrix[last][last - offset];
                matrix[last][last - offset] = matrix[i][last];
                matrix[i][last] = tempOnTop;


            }


        }


    }


    public static void main(String[] argus) {

        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {11, 12, 13, 14}, {15, 16, 17, 18}};

        for (int i = 0; i < matrix.length; i++) {

            System.out.println(matrix[i][0] + " " + matrix[i][1] + " " + matrix[i][2] + " " + matrix[i][3]);


        }
        rotate(matrix, 4);
        System.out.println("   ");

        for (int i = 0; i < matrix.length; i++) {

            System.out.println(matrix[i][0] + " " + matrix[i][1] + " " + matrix[i][2] + " " + matrix[i][3]);


        }


    }


}
