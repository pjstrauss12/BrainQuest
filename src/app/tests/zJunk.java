package app.tests;
import java.util.ArrayList;

/**
 * Just a scratch file to practice Java
 */
public class zJunk {
    
    public static void main(String[] args){
    
        String[] names2 = {"Julia", "Jon", "Max", "Aidan", "Brynn", "Mollie", 
        "Elisa", "Harry", "Kai", "Parker", "Ryan"};
        
        // the problem with arrays is that they are immutable
        // so let's buils a fancy new ArrayList
        ArrayList<String> nameList = new ArrayList<>();

        // traversing the String array's indexes using standard for loop
        for(int i = 0; i < names2.length; i++){
            nameList.add(names2[i]);
        }

        // Print the names with Jon still in the list
        System.out.println(nameList);

        // seek and destroy
        for(int i = 0; i < nameList.size(); i++){
            if(nameList.get(i).equals("Jon")){
                nameList.remove(i);
            }
        }
        
        // print names without jon in the list
        System.out.println(nameList);
    }

}
