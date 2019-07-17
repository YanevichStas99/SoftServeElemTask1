package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Task 1");
        ChessBoard chessBoard = new ChessBoard();
        chessBoard.setInfo();
        String board =chessBoard.getBoard();
        System.out.println(board);
    }
}
