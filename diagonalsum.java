public class diagonalsum {
    public static int diagonalSum(int mat[][]) {
        int sum = 0;

        for (int i = 0; i < mat.length; i++) {
            // primary diagonal
            sum += mat[i][i];

            // secondary diagonal
            if (i != mat.length - 1 - i) {
                sum += mat[i][mat.length - 1 - i];  //
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int mat[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

    }
}
