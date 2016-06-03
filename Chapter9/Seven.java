package Chapter9;

/**
 * Created by yuwang on 2016-06-02.
 * fill a color into a drawing
 */
public class Seven {

    enum Color {
        Red,
        Black,
        White,
        Blue,
        Green
    }

    private static boolean fillColor(Color[][] matrix, int i, int j, Color targetColor) {
        if (matrix[i][j] == targetColor) {
            return false;
        } else {
            return fillColor(matrix, i, j, targetColor, matrix[i][j]);

        }


    }

    private static Boolean fillColor(Color[][] matrix, int i, int j, Color targetColor, Color color) {

        if (i < 0 || j < 0 || i >= matrix.length || j >= matrix[0].length) return false;

        if (matrix[i][j] == color) {
            matrix[i][j] = targetColor;

            fillColor(matrix, i + 1, j, targetColor, color);
            System.out.println("i+1,j " + i + " " + j);
            fillColor(matrix, i - 1, j + 1, targetColor, color);
            System.out.println("i-1,j " + i + " " + j);
            fillColor(matrix, i, j, targetColor, color);
            System.out.println("i,j+1 " + i + " " + j);
            fillColor(matrix, i, j - 1, targetColor, color);
            System.out.println("i,j-1 " + i + " " + j);


        }

        return true;
    }


    public static void main(String[] argus) {

        Color[][] matrix = new Color[100][100];

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {

                if (i < 20 && j < 20) {
                    matrix[i][j] = Color.Red;
                }

                if (i < 40 && i >= 20 && j < 40 && j >= 20) {
                    matrix[i][j] = Color.Blue;
                }

                if (i < 70 && i >= 40 && j < 70 && j >= 40) {
                    matrix[i][j] = Color.Green;
                }

                if (i >= 70 && j >= 70) {
                    matrix[i][j] = Color.White;
                }


            }
        }


        System.out.println(fillColor(matrix, 4, 5, Color.Black));

    }


}
