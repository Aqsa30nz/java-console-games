import java.util.Scanner;

public class Game {
    private Board board;
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private Scanner sc;

    public Game() {
        board = new Board();
        player1 = new Player('X');
        player2 = new Player('O');
        currentPlayer = player1;
        sc = new Scanner(System.in);
    }

    public void start() {
        boolean playAgain = true;

        System.out.println("🎮 Tic Tac Toe Game");

        while (playAgain) {
            board.resetBoard();
            currentPlayer = player1;
            boolean gameRunning = true;

            while (gameRunning) {
                board.printBoard();
                playerMove();

                if (board.checkWin(currentPlayer.getSymbol())) {
                    board.printBoard();
                    System.out.println("Player " + currentPlayer.getSymbol() + " wins! 🎉");
                    gameRunning = false;
                } else if (board.isFull()) {
                    board.printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            }

            System.out.print("Play again? (y/n): ");
            char choice = sc.next().toLowerCase().charAt(0);
            if (choice != 'y') {
                playAgain = false;
                System.out.println("Thanks for playing! 👋");
            }
        }
    }

    private void playerMove() {
        int position;

        while (true) {
            System.out.println("Player " + currentPlayer.getSymbol() + ", enter position (1-9):");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Enter a number.");
                sc.next();
                continue;
            }

            position = sc.nextInt();

            if (position < 1 || position > 9) {
                System.out.println("Invalid position! Choose 1-9.");
                continue;
            }

            if (board.placeMove(position, currentPlayer.getSymbol())) {
                break;
            } else {
                System.out.println("Position already taken.");
            }
        }
    }

    private void switchPlayer() {
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }
}
