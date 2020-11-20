package app.tests;

import java.util.Scanner;

public class GridPractice {

    public static int[][] grid;

    public static void main(String[] args){
        System.out.println("How many rows you fellin'?");
        Scanner sUnit = new Scanner(System.in);
        int rows = sUnit.nextInt();
        System.out.println("How many columns?");
        int col = sUnit.nextInt();
        buildGrid(rows, col);
        printGrid();
        changeRow(5, 20);
        changeColumn(2, 30);
        printGrid();
    }

    public static void buildGrid(int r, int c){
        // instantiate grid
        grid = new int[r][c];
        // populate grid
        for(int col = 0; col < grid[0].length; col++){
            // traverse each row (backwards, rows are usually outer)
            for(int row = 0; row < grid.length; row++){
                grid[row][col] = col+1;
            }
        }
    }

    public static void changeColumn(int col, int value){
        for(int r = 0; r < grid.length; r++){
            grid[r][col] = value;
        }
    }

    public static void changeRow(int row, int value){
        for(int c = 0; c < grid[0].length; c++){
            grid[row][c] = value;
        }
    }
    
    public static void printGrid(){
        for(int[] row : grid){
            for(int num : row){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
