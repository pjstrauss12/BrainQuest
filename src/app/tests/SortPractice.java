package app.tests;

public class SortPractice {
    public static void main(String[] args){
        int[] nums = NumSet.randArray(50, 0, 4000);
        NumSet.printPretty(nums);
        selectionSort(nums);
        NumSet.printPretty(nums);
    }

    public static void selectionSort(int[] nums){
        // outer loop
        for(int o = 0; o < nums.length - 1; o++){
            int smallestIndex = o;
            // inner loop: lets look for the next smallest number
            for(int i = o+1; i < nums.length; i++){
                // compare and look for the smallest value
                if(nums[i] < nums[smallestIndex]){
                    smallestIndex = i;
                }
            }
            // 3 part swap
            int temp = nums[o];
            nums[o] = nums[smallestIndex];
            nums[smallestIndex] = temp;
        }
    }

}
