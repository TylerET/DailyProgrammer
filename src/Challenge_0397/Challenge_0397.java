/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Challenge_0397;

/**
 *
 * @author Computron
 */
public class Challenge_0397 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        numCompare("I", "I");
        numCompare("I", "II");
        numCompare("II", "I");
        numCompare("V", "IIII");
        numCompare("MDCLXV", "MDCLXVI");
        numCompare("MM", "MDCCCCLXXXXVIIII"); 
        
        
    }
    
    public static boolean numCompare(String x, String y){
        int xAccum = 0;
        int yAccum = 0;
        
        for (char letter : x.toCharArray()){
            xAccum += getValue(letter);
        }
        
        for (char letter : y.toCharArray()){
            yAccum += getValue(letter);
        }
        System.out.println((xAccum < yAccum));
    return (xAccum < yAccum);
    }
    
    public static int getValue(char numeral){
        int value;
        
        switch(numeral){
            case 'M': 
                value = 1000;
                break;
            case 'D':
                value =500;
                break;
            case 'C':
                value =100;
                break;
            case 'L':
                value =50;
                break;
            case 'X':
                value =10;
                break;
            case 'V':
                value =5;
                break;               
            case 'I':
            value =1;
            break;
            default:
                value = 0;
                break;      
        }

        return value;}  
}
