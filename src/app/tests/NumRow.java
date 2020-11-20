package app.tests;

import java.util.ArrayList;

public class NumRow implements NumGroup {
    public ArrayList<Integer> nums;

    public NumRow(ArrayList<Integer> nums){
        this.nums = nums;
    }

    @Override
    public int sum() {
        int result = 0;
        for(int i = 0; i < nums.size(); i++){
            result += nums.get(i);
        }
        return result;
    }

    @Override
    public void sort() {
        //outer loop
        for(int o = 0; o < nums.size() - 1; o++){
            int smallestIndex = o;
            // inner loop: find next smallest number to replace
            for(int i = o+1; i < nums.size(); i++){
                if(nums.get(i) < nums.get(smallestIndex)) smallestIndex = i;
            }
            int temp = nums.get(smallestIndex);
            nums.set(smallestIndex, nums.get(o));
            nums.set(o, temp);
        }
    }

    @Override
    public void shuffle() {
        for(int i = 1; i < nums.size(); i++){
            // draw random number from o -> i (inclusive)
            int randNum = (int)(Math.random()*(i+1));
            // 3 part swap
            int temp = nums.get(randNum);
            nums.set(randNum, nums.get(i));
            nums.set(i, temp);
        }
    }

    @Override
    public String toString(){
        return nums.toString();
    }
}
