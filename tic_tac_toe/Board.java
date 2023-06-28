package tic_tac_toe;

public class Board {
    int[][] matrix = new int[3][3];

    public void printMatrix() {
        for (int[] row : matrix) {
            for (int i : row) {
                if (i == 0)
                    System.out.print("_");
                else if (i == 1)
                    System.out.print("X");
                else
                    System.out.print("O");
            }
            System.out.println();
        }
    }

    public boolean updateMatrix(int row, int column, boolean player1InTurn) {
        matrix[row][column] = (player1InTurn) ? 1 : 2;

        // check row and column
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == matrix[i][1] && matrix[i][0] == matrix[i][2] && matrix[i][0] != 0)
                return true;
            if (matrix[0][i] == matrix[1][i] && matrix[0][i] == matrix[2][i] && matrix[0][i] != 0)
                return true;
        }

        // check
        if(matrix[0][0] == matrix[1][1] && matrix[0][0] == matrix[2][2] && matrix[0][0] != 0)
            return true;
        if(matrix[0][2] == matrix[1][1] && matrix[0][2] == matrix[2][0] && matrix[0][2] != 0)
            return true;
        return false;
    }
}
