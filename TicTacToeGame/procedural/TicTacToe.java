import java.util.*;

public class TicTacToe 
{

    static char board[][]  = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };

    static char currentPlayer = 'X';

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        boolean playAgain = true;

        System.out.println("🎮 Tic Tac Toe Game");

        while (playAgain)
        {
            boolean gameRunning = true;
            resetBoard();

            while (gameRunning) 
            {
                printBoard();
                playerMove(sc);

                if (checkWin()) 
                {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins! 🎉");
                    gameRunning = false;
                } 
                
                else if (isBoardFull()) 
                {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } 
                
                else
                {
                    switchPlayer();
                }
            }

            // Play again logic
            System.out.print("Do you want to play again? (y/n): ");
            char choice = sc.next().toLowerCase().charAt(0);

            if (choice != 'y') 
            {
                playAgain = false;
                System.out.println("Thanks for playing! 👋");
            }
        }

        sc.close();
    }

    // 🔄 Reset board
    public static void resetBoard()
    {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                board[i][j] = ' ';
            }
        }
        currentPlayer = 'X';
    }

    // Print board
    public static void printBoard() 
    {
        System.out.println();

        int pos = 1;

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
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

    // Player move
    public static void playerMove(Scanner sc) 
    {
        int position;

        while (true) 
        {
            System.out.println("Player " + currentPlayer + ", enter position (1-9):");

            if (!sc.hasNextInt())
            {
                System.out.println("Invalid input! Enter a number.");
                sc.next(); // clear invalid input
                continue;
            }

            position = sc.nextInt();

            if (position < 1 || position > 9) 
            {
                System.out.println("Invalid position! Choose from 1 to 9.");
                continue;
            }

            int row = (position - 1) / 3;
            int col = (position - 1) % 3;

            if (board[row][col] == ' ') 
            {
                board[row][col] = currentPlayer;
                break;
            } 
            else 
            {
                System.out.println("Position already taken, try again.");
            }
        }
    }

    // Check win
    public static boolean checkWin()
    {
        for (int i = 0; i < 3; i++)
        {
            if (board[i][0] == currentPlayer &&
                board[i][1] == currentPlayer &&
                board[i][2] == currentPlayer) return true;

            if (board[0][i] == currentPlayer &&
                board[1][i] == currentPlayer &&
                board[2][i] == currentPlayer) return true;
        }

        if (board[0][0] == currentPlayer &&
            board[1][1] == currentPlayer &&
            board[2][2] == currentPlayer) return true;

        if (board[0][2] == currentPlayer &&
            board[1][1] == currentPlayer &&
            board[2][0] == currentPlayer) return true;

        return false;
    }

    // Check draw
    public static boolean isBoardFull()
    {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                if (board[i][j] == ' ') return false;
            }
        }
        return true;
    }

    // Switch player
    public static void switchPlayer()
    {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }
}