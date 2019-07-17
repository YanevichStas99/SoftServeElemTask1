package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ChessBoard {
    private int length;
    private int width;

    public ChessBoard() {
    }

    public void setInfo() {
        Scanner scanner = new Scanner(System.in);
        boolean cheaker = false;
        while (!cheaker) {
            try {
                System.out.println("Enter length:");
                this.length = scanner.nextInt();
                System.out.println("Enter width:");
                this.width = scanner.nextInt();
                cheaker = true;
            } catch (InputMismatchException e) {
                System.out.println("Error! Length and width should be integer.");
                scanner.next();
            }
        }
    }

    public String getBoard() {
        String board = "";
        for (int i = 0; i < length; i++) {
            String line = "";
            for (int j = 0; j < width; j++) {
                if (i % 2 != 0) {
                    if (j % 2 != 0) {
                        line = line + "*";
                    } else {
                        line = line + " ";
                    }
                } else {
                    if (j % 2 != 0) {
                        line = line + " ";
                    } else {
                        line = line + "*";
                    }
                }
            }
            if (i + 1 == length) {
                board = board + line;
            } else {
                board = board + line + "\r\n";
            }
        }
        return board;
    }
}
