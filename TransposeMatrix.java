public class TransposeMatrix {
    public static void main(String[] args) {

        // Original matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int row = matrix.length;          // Total rows = 2
        int col = matrix[0].length;      // Total columns = 3

        // Transpose matrix ka size opposite hoga
        int[][] transpose = new int[col][row];

        // Transpose logic
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                transpose[j][i] = matrix[i][j];

            }
        }

        // Print transpose matrix
        System.out.println("Transpose Matrix:");

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {

                System.out.print(transpose[i][j] + " ");

            }
            System.out.println();
        }
    }
}