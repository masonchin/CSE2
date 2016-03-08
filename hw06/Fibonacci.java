// Mason Chin
//March 4th
//CSE002 hw06
//Program will produce an n amount of fibonacci numbers based on user input

import java.util.Scanner;           //imports Scanner

public class Fibonacci {
    public static void main (String [] args) {
        
    //declaring and constructing an instance of Scanner
    
        Scanner myScanner = new Scanner(System.in);
        
    //prompts user to input first number of sequence
    
        System.out.print("Enter a positve integer (first number in the sequence): ");
        
        int first;          //will store first inputted value
        
        if (myScanner.hasNextInt()) {           //if inputted number is an integer, it will be stored in variable first
            first = myScanner.nextInt();
        }
        else {                                  //if not an integer, first will be set to 0
            myScanner.next();
            first = 0;
        }
        
        while (first <= 0) {                    //while first is greater than or equal to 0, loop will run
        
                System.out.print("Not a valid number.  Enter a positive integer (first number in the sequence): ");     //prompts user for another number
                
            if (myScanner.hasNextInt()) {       //if inputted number is an integer, it will be stored in variable first
                first = myScanner.nextInt();
            }
            else {                              //if not an integer, first is set to 0 and loop will continue
                myScanner.next();
                first = 0;
            }
        }
    
    //prompts user to input second number of sequence
    
        System.out.print("Enter a positive integer (second number in the sequence): ");
        
    
        int second;         //will store second inputted value
        
        if (myScanner.hasNextInt()) {           //if integer, inputted number will be store in variable second
            second = myScanner.nextInt();       
        }
        else {                                  //if not an integer, second is set to 0
            myScanner.next();
            second = 0;
        }
        
        while (second <= 0) {                   //while second is less than or equal to 0, loop will run
            
                System.out.print("Not a valid number.  Enter a positive integer (second number in the sequence): ");    //prompts user for another number
                
            if (myScanner.hasNextInt()) {       //if an integer, inputted number will be stored in variable second
                second = myScanner.nextInt();   
            }
            else {                              //if not an integer, second will be set to 0 and loop will continue
                myScanner.next();
                second = 0;
            }
        }
    
    //prompts user to input length of fibonacci sequence
        
        System.out.print("Enter a positive integer (this will be how many numbers long the fibonacci sequence will be): ");
        
        int n;                              //will store third inputted value
        
        if (myScanner.hasNextInt()) {       //if an integer, inputted number is stored in n
            n = myScanner.nextInt();
        }
        else {                              //if not an integer, n is set to 0
            myScanner.next();
            n = 0;
        }
        
        while (n <= 0) {                    //while n is less than or equal to 0, loop will run
            
                System.out.print("Not a valid number.  Enter a positive integer (this will be how many numbers long the fibonacci sequence will be): ");
                
            if (myScanner.hasNextInt()) {   //if integer, inputted number will stored in n
                n = myScanner.nextInt();
            }
            else {                          //if not an integer. n will be set to 0 and loop will continue
                myScanner.next();
                n = 0;
            }
        }
        
        
        int count = 2;          //variable will serve as a counter, there are already 2 inputted numbers
        int total = 0;          //variable will serve as a total to add subsequent numbers
        
    //prints the first and second numbers of the fibonacci sequence
    
        System.out.print("The numbers are: " + first + ", " + second + ", ");
     
    //while statement will add up fibonacci numbers for as long as the count is n is greater than or equal to count
    
        while (n > count) {
            
            count++;                                    //increments count
            
            total = first + second;                     //adds up first variable and second variable
            
            System.out.print(total + ", ");             //prints the sum
            
            first = second;                             //stores the value of current second into variable first
            second = total;                             //stores the value of current total into variable second
            
        }
    }
}