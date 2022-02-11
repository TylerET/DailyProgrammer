/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Challenge0399;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Computron
 */
public class Challenge_0399 {
    
    
    /**
     * Assign every lowercase letter a value, from 1 for a to 26 for z. 
     * Given a string of lowercase letters, find the sum of the values of the letters in the string
     * lettersum("") => 0
     * lettersum("a") => 1
     * lettersum("z") => 26
     * lettersum("cab") => 6
     * lettersum("microspectrophotometries") => 317
     
     * BONUS
     * Use the enable1 word list for the optional bonus challenges.
     * microspectrophotometries is the only word with a letter sum of 317. Find the only word with a letter sum of 319.
      
     * How many words have an odd letter sum?
      
     *There are 1921 words with a letter sum of 100, making it the second most common letter sum. What letter sum is most common, and how many words have it?

     * zyzzyva and biodegradabilities have the same letter sum as each other (151), and their lengths differ by 11 letters. Find the other pair of words with the same letter sum whose lengths differ by 11 letters.

     * cytotoxicity and unreservedness have the same letter sum as each other (188), and they have no letters in common. Find a pair of words that have no letters in common, and that have the same letter sum, which is larger than 188. (There are two such pairs, and one word appears in both pairs.)

     * The list of word { geographically, eavesdropper, woodworker, oxymorons } contains 4 words. Each word in the list has both a different number of letters, and a different letter sum. The list is sorted both in descending order of word length, and ascending order of letter sum. What's the longest such list you can find?
     * 
     */

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> listOfStrings = new ArrayList<String>();
        Scanner sc = new Scanner(new FileReader("C:\\Users\\Computron\\Documents\\NetBeansProjects\\DailyProgrammer\\src\\DailyProgrammer\\challenge0399.txt"))
                .useDelimiter("\r\n");
        String str;
        while (sc.hasNext()){
            str = sc.next();
            
            listOfStrings.add(str);
        }
        
        String[] stringArray = listOfStrings.toArray(new String[0]);



        letterSum("a");
        letterSum("z");
        letterSum("cab");
        letterSum("excellent");
        letterSum("microspectrophotometries");
        
        findSum(100, stringArray);

                
        

        


        

        
        
        
        
    }
    
    public static int letterSum(String str){
        int letterSum = 0;
        int valueAdjust = 96;
        
        for(int i = 0; i < str.length(); i++){
//            System.out.println((str.charAt(i) - valueAdjust));
            letterSum += (str.charAt(i) - valueAdjust);    
        }
//        System.out.println(str + " = " + letterSum);
        return letterSum;
    }
    
    public static void findSum(int sum, String[] array){
        ArrayList<String> sumArray = new ArrayList();

        for(int i = 0; i < array.length; i++){
            
//            System.out.println(i + " = " + array[i]);
//            System.out.print(letterSum(array[i]));
            if(letterSum(array[i]) == sum){
                sumArray.add(array[i]);
                
            }
        }
       
       for(String word : sumArray){
            System.out.println(word);
       }
    }
    
}
