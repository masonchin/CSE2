//Mason Chin
//March 5th
//CSE002 hw06
//Program will calculate factorials

import java.util.Scanner;

public class RunFactorial {
    public static void main (String [] args){
        
    //declaring and constructing an instance of Scanner
    
        Scanner myScanner = new Scanner(System.in);
    
    //prompts user to enter a number between 9 and 16
    
        System.out.print("Enter an integer between 9 and 16: ");
    
        int number;             //will store first input
    
        if (myScanner.hasNextInt()) {           //if input is an integer, input will be stored in variable first
            number = myScanner.nextInt();
        }
        else {                                  //if not an integer, variable number is set to 0
            myScanner.next();
            number = 0;
        }
        
    //program will not continue until variable number is between 9 and 16 and is an integer
        while (number < 9 || number > 16){
         
            System.out.print("Not a valid number.  Enter an integer between 9 and 16: ");
         
            if (myScanner.hasNextInt()){                //if input is an integer, input will be stored in number
                number = myScanner.nextInt();
            }
            else {                                      //if not an integer, variable is st to 0 and will contiue through loop
                myScanner.next();
                number = 0;
            }
        
        }

        int count = 1;          //variable will serve as a counter
        int factorial= 1;       //variable will store final calculation
    
    //while the count is less than or equal to inputted number, count will be incremented and will be multiplied by variable factorial
        while (number >= count) {
         
            factorial *= count;
        
            count++;
        }
    
    //prints final calculation
    
        System.out.println(number + "!= " + factorial);
    
    } //end of main method
    
}  //end of class