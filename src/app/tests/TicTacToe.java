package app.tests;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args){
        // Build the board
        char[] dashes0 = {'1', '2', '3'};
        char[] dashes1 = {'4', '5', '6'};
        char[] dashes2 = {'7', '8', '9'};

        char[][] board = {dashes0, dashes1, dashes2};

        Scanner scannyMcScantron = new Scanner(System.in);
    
        while(getWinner(board) == '-' && checkEmpty(board)){
            printBoard(board);
            System.out.println("\nWhich spot would you like?");
            int pos = scannyMcScantron.nextInt();
            int row = (pos - 1) / 3;
            int column = (pos + 2) % 3;
            board[row][column] = 'X';
            // switch(pos){
            //     case 1:
            //         board[0][0] = 'X';
            //         break;
            //     case 2:
            //         board[0][1] = 'X';
            //         break;
            //     case 3:
            //         board[0][2] = 'X';
            //         break;
            //     case 4:
            //         board[1][0] = 'X';
            //         break;
            //     case 5:
            //         board[1][1] = 'X';
            //         break;
            //     case 6:
            //         board[1][2] = 'X';
            //         break;
            //     case 7:
            //         board[2][0] = 'X';
            //         break;
            //     case 8:
            //         board[2][1] = 'X';
            //         break;
            //     case 9:
            //         board[2][2] = 'X';
            //         break;
            // }
            fillRandomSpot(board);
        }
        announceEndCondition(board);
        
    } // closes main

    /**
     * Uses the getWinner method to translate the char to a 
     * print statement about who won / tie
     * @param board
     */
    public static void announceEndCondition(char[][]board){
        if(getWinner(board) == 'X'){
            System.out.println("\nX wins!");
        } else if(getWinner(board) == 'O'){
            System.out.println("\nO wins!");
        } else{
            System.out.println("\nNo one wins!");
        }
    }

    public static boolean checkEmpty(char[][] board){
        // loop through the 2D char and return true if you find something
        // other than 'X' or 'O'
        for(char[] row : board){
            for(char position : row){
                if(position != 'X' && position != 'O'){
                    return true;
                }
            }
        }
        return false;
    }

    public static char getWinner(char[][] board){
        // check for horizontal wins
        for(int r = 0; r <= 2; r++){
            if(board[r][0] == board[r][1] && board[r][1] == board[r][2]){
                return board[r][0];
            }
        }
        // check for vertical wins
        for(int v = 0; v <= 2; v++){
            if(board[0][v] == board[1][v] && board[1][v] == board[2][v]){
                return board[0][v];
            }
        }
        // check for diagonal wins
        if(board[0][0] == board[1][1] && board[1][1] == board[2][2])
            return board[0][0];
        else if(board[0][2] == board[1][1] && board[1][1] == board[2][0])
            return board[0][2];
        else return '-';
    }

    public static void fillRandomSpot(char[][] board){
        // Computer is the 'O', pick a random spot to fill in
        // pick two random numbers 0 -> 2 and loop until
        // you picked a spot that isn't 'O' or 'X'
        while(getWinner(board) == '-' && checkEmpty(board)){
            int ran1 = (int)(Math.random() * 3);
            int ran2 = (int)(Math.random() * 3);
            if(board[ran1][ran2] != 'X' && board[ran1][ran2] != 'O'){
                board[ran1][ran2] = 'O';
                break;
            }
        }
    }

    public static void printBoard(char[][] board){
        for(char[] row : board){
            System.out.println();
            for(char pos : row){
                System.out.print(" " + pos + " ");
                
            }
        }
    }
}
