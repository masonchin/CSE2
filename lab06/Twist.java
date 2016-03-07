//Mason Chin
//March 4th
//CSE002 lab06
//Program will print out a twist on the screen

import java.util.Scanner;

public class Twist {
    public static void main(String [] args) {
        
    //declaring and constructin an instance of Scanner
    
        Scanner myScanner = new Scanner(System.in);
    
    //prompts user to imput a positive integer called "length"
    
        System.out.print("Enter a positive integer: ");
    
        int length;          //will store first inputted value
            
            if (myScanner.hasNextInt()) {           //if inputted number is an integer, it will be stored in variable length
                length = myScanner.nextInt();
            }
            else {                                  //if not an integer, first will be set to 0
                myScanner.next();
                length = 0;
            }
            
            while (length <= 0) {                    //while length is less than or equal to 0, loop will run
        
                    System.out.print("Not a valid number.  Enter a positive integer (first number in the sequence): ");     //prompts user for another number
                
                if (myScanner.hasNextInt()) {       //if inputted number is an integer, it will be stored in variable length
                    length = myScanner.nextInt();
                }
                else {                              //if not an integer, first is set to 0 and loop will continue
                    myScanner.next();
                    length = 0;
                }
            }
        
    //declaring and initializing variables used for loop
            
        int count = 1;
        int n = length/3;
        int twist = length % 3;

    //while statement will increment the length of the twist based on user input
            
        while (length >= (count * 3)) {
        
            while (n >= count) {
                count++;
                System.out.print("\\ " + "/");
            }
            
            if (twist == 1 || twist == 2) {
                System.out.print("\\");
            }
            
            System.out.println("");
            
            if (twist == 2) {
                System.out.print(" X ");
            }
            
            count = 1;
            while (n >= count) {
                count++;
                System.out.print("");
                System.out.print(" X ");
            }
            System.out.println("");
            
            
            count = 1;
            while (n >= count) {
                count++;
                System.out.print("/ " + "\\");
            }
            
            if (twist == 1 || twist == 2) {
                System.out.print("/");
            }
            
        }
    } // end of main method
    
}   //end of class