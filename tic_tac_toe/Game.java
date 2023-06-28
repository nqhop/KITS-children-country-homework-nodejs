package tic_tac_toe;

import java.util.Scanner;

public class Game {
    private Player player1;
    private Player player2;
    private Board board = new Board();
    boolean player1InTurn;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void go() {
        while (true) {

            board.printMatrix();
            Scanner myObj = new Scanner(System.in);
            if (player1InTurn)
                System.out.println(player1.getName());
            else
                System.out.println(player2.getName());
            System.out.print("select your row: ");
            int row = Integer.valueOf(myObj.nextLine()) - 1;

            System.out.print("select your column: ");
            int column = Integer.valueOf(myObj.nextLine()) - 1;

            if (board.updateMatrix(row, column, player1InTurn)) {
                System.out.println((player1InTurn) ? player1.getName() : player2.getName() + " win");
                return;
            }
            player1InTurn = !player1InTurn;
        }

    }

}
