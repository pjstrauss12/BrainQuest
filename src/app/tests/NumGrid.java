package app.tests;

import java.util.ArrayList;

public class NumGrid implements NumGroup {

    // VERY CONFUSING USE OF A STATIC METHOD INSIDE AN INSTANIATED OBJECT
    public static void main(String[] args){
        ArrayList<NumRow> rows = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            rows.add(new NumRow(NumSet.randArrL(10, 10, 99)));
        }
        NumGrid griddy = new NumGrid(rows);
        System.out.println(griddy);
        
        System.out.println("Shuffling...");
        griddy.shuffle();
        System.out.println(griddy);

        System.out.println("Sorting...");
        griddy.sort();
        System.out.println(griddy);
    }

    private ArrayList<NumRow> grid;

    public NumGrid(ArrayList<NumRow> rows){
        grid = rows;
    }

    @Override
    public int sum() {
        int result = 0;
        for(NumRow row : grid) result += row.sum();
        return result;
    }

    @Override
    public void sort() {
        for(NumRow row : grid) row.sort();
    }

    @Override
    public void shuffle() {
        for(NumRow row : grid) row.shuffle();

        for(int row = 0; row < grid.size(); row++){
            for(int col = 0; col < grid.get(row).nums.size(); col++){
                // draw random row...
                int ranRow = (int)(Math.random()*grid.size());
                // ... and column position in that row
                int ranCol = (int)(Math.random()*grid.get(ranRow).nums.size());
                // 3 part swap
                int temp = grid.get(ranRow).nums.get(ranCol);
                grid.get(ranRow).nums.set(ranCol, grid.get(row).nums.get(col));
                grid.get(row).nums.set(col, temp);
            }
        }
    }

    @Override
    public String toString(){
        String result = "\n";
        for(NumRow row : grid) result += row.toString() + "\n";
        return result;
    }
    
}
