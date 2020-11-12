package app.tests;

import java.util.ArrayList;

public class NumSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        ROUND 1 tests
        */
        
        // Create a random int array of a given length, low and high end of range
        int[] randArray = randArray(15, 0, 100);
        
        // Create a random Integer ArrayList of given length, low and high range
        ArrayList<Integer> randArrL = randArrL(8, 5, 50);
        
        // How many similar elements are in a given array and ArrayList
        System.out.print("There are this many similar elements: ");
        System.out.println(compareNums(randArray, randArrL));
        
        // printPretty takes an int array and prints it out nicely
        printPretty(randArray);
        // printPretty takes an Integer ArrayList and prints it out nicely
        printPretty(randArrL);
        
        /*
        ROUND 2 tests
        */
        
        // shuffle randomizes an int array (then calls printPretty)
        shuffle(randArray);
        
        // shuffle randomizes an Integer ArrayList (then calls printPretty)
        shuffle(randArrL);
        
        // divide all numbers by two
        divByTwo(randArray);
        divByTwo(randArrL);
        
        //sumArray
        sumArray(randArray);
        sumArray(randArrL);
        
    }
    /*
    ROUND 1 code
    */
    
    // randArray method
    public static int[] randArray(int length, int min, int max){
        int[] result = new int[length];
        
        // loop "length" number of times
        for(int i = 0; i < result.length; i++){
            int numb = (int)(Math.random()*(max - min) + min);
            result[i] = numb;
        }
        return result;
    }
    // randArrL method
    public static ArrayList<Integer> randArrL(int length, int min, int max){
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < length; i++){
            int numb = (int)(Math.random()*(max - min) + min);
            result.add(numb);
        }
        return result;
    }
    
    // compareNums method
    public static int compareNums(int[] randArray, ArrayList<Integer> randArrL){
        int count = 0;
        for(int i = 0; i < randArray.length; i++){
            for(int j = 0; j < randArrL.size(); j++){
                if(randArray[i] == randArrL.get(j)) count++;
            }
        }
        return count;
    }
    
    // printPretty methods (overloaded)
    public static int[] printPretty(int[] randArray){
        System.out.print("Printed Array: ");
        for(int i = 0; i < randArray.length; i++){
            System.out.print(randArray[i] + " ");
        }
        System.out.println();
        return randArray;
    }

    public static ArrayList<Integer> printPretty(ArrayList<Integer> randArrL){
        System.out.print("Printed ArrayList: ");
        for(int i = 0; i < randArrL.size(); i++){
            System.out.print(randArrL.get(i) + " ");
        }
        System.out.println();
        return randArrL;
    }
    /*
    ROUND 2 code
    */
    
    // shuffle array method
    public static void shuffle(int[] randArray){
        System.out.println();
        for(int i = 0; i < randArray.length; i++){
            int randomNumber = (int)(Math.random()*i+1);
            int temp = randArray[randomNumber];
            randArray[randomNumber] = randArray[i];
            randArray[i] = temp;
        }
        System.out.print("This is a shuffled version of the randArray: ");
        System.out.println();
        printPretty(randArray);
    }
    
    // shuffle ArrayList method
    public static void shuffle(ArrayList<Integer> randArrL){
        System.out.println();
        for(int i = 0; i < randArrL.size(); i++){
            int rand = (int)(Math.random()*(i+1));
            int temp = randArrL.get(rand);
            randArrL.set(rand, randArrL.get(i));
            randArrL.set(i, temp);
        }
        System.out.print("This is a shuffled version of the randArrL: ");
        System.out.println();
        printPretty(randArrL);
    }
    
    // divByTwo method (array)
    public static void divByTwo(int[] randArray){
        System.out.println();
        for(int i = 0; i < randArray.length; i++){
            int num = (randArray[i] / 2);
            randArray[i] = num;
        }
        System.out.println("This is each int array value divided by 2");
        printPretty(randArray);
    }
    // divByTwo method (ArrayList)
    public static void divByTwo(ArrayList<Integer> randArrL){
        System.out.println();
        for(int i = 0; i < randArrL.size(); i++){
            int num = (randArrL.get(i) / 2);
            randArrL.set(i, num);
        }
        System.out.println("This is each ArrayList value divided by 2");
        printPretty(randArrL);
    }
    
    // sumArray method (array)
    public static int sumArray(int[] randArray){
        System.out.println();
        int result = 0;
        for(int addition : randArray){
            result = result + addition;
        }
        System.out.println("The sum of all the numbers in the array is: " + result);
        return result;
    }
    // sumArray method (ArrayList)
    public static int sumArray(ArrayList<Integer> randArrL){
        int result = 0;
        for(int addition : randArrL){
            result += addition;
        }
        System.out.println("The sum of all the numbers in the ArrayList is: " + result);
        return result;
    }
}
