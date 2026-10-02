public class SpiralMatrix {

    public static void spiralMatrix(int mat[][]) {

        int sr = 0; // start row
        int sc = 0; // start column
        int er = mat.length - 1; // end row
        int ec = mat[0].length - 1; // end column

        while (sr <= er && sc <= ec) {

            // top row
            for (int i = sc; i <= ec; i++) {
                System.out.print(mat[sr][i] + " ");
            }
            sr++;

            // right column
            for (int i = sr; i <= er; i++) {
                System.out.print(mat[i][ec] + " ");
            }
            ec--;

            // bottom row
            if (sr <= er) {
                for (int i = ec; i >= sc; i--) {
                    System.out.print(mat[er][i] + " ");
                }
                er--;
            }

            // left column
            if (sc <= ec) {
                for (int i = er; i >= sr; i--) {
                    System.out.print(mat[i][sc] + " ");
                }
                sc++;
            }
        }
    }

    public static void main(String[] args) {

        int mat[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        spiralMatrix(mat);
    }
}