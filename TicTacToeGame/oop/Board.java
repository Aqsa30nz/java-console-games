public class Board {
    private char[][] board;

    public Board() {
        board = new char[3][3];
        resetBoard();
    }

    public void resetBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    public void printBoard() {
        System.out.println();
        int pos = 1;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ')
                    System.out.print(" " + pos + " ");
                else
                    System.out.print(" " + board[i][j] + " ");

                if (j < 2) System.out.print("|");
                pos++;
            }
            System.out.println();
            if (i < 2) System.out.println("---|---|---");
        }
        System.out.println();
    }

    public boolean placeMove(int position, char symbol) {
        int row = (position - 1) / 3;
        int col = (position - 1) % 3;

        if (board[row][col] == ' ') {
            board[row][col] = symbol;
            return true;
        }
        return false;
    }

    public boolean checkWin(char symbol) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == symbol &&
                board[i][1] == symbol &&
                board[i][2] == symbol) return true;

            if (board[0][i] == symbol &&
                board[1][i] == symbol &&
                board[2][i] == symbol) return true;
        }

        if (board[0][0] == symbol &&
            board[1][1] == symbol &&
            board[2][2] == symbol) return true;

        if (board[0][2] == symbol &&
            board[1][1] == symbol &&
            board[2][0] == symbol) return true;

        return false;
    }

    public boolean isFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') return false;
            }
        }
        return true;
    }
}