package kyu5;

public class TicTacToeChecker {

    public static void main(String[] args) {

        int[][] board = {{2, 0, 0},
        {0, 0, 1},
        {0, 2, 0}};

        System.out.println(isSolved(board));

    }


    // We'll receive a board, and we'll need to return whether the X or O won or is unfinished.

    public static int isSolved(int[][] board) {

        //Check the rows
        for(int i = 0; i < 3; i++) {
            if(board[i][0] != 0 && board[i][0] == board[i][1] && board[i][0] == board[i][2]) {
                return board[i][0];
            }
        }

        //Check the columns
        for(int i = 0; i < 3; i++) {
            if(board[0][i] != 0 && board[0][i] == board[1][i] && board[0][i] == board[2][i]) {
                return board[0][i];
            }
        }

        // Check the diagonals
        if(board[0][0] != 0 && board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
            return board[0][0];
        }
        if(board[0][2] != 0 && board[0][2] == board[1][1] && board[0][2] == board[2][0]) {
            return board[0][2];
        }

        // Check whether is unfinished
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(board[i][j] == 0)
                    return -1;
            }
        }

        // If all conditions above weren't met, it's a draw
        return 0;
    }

}
