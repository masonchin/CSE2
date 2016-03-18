//Mason Chin
//March 12th
//CSE002 hw07
//program will print a triangle of numbers using loops

import java.util.Scanner;           //imports Scanner

public class Triangles{
    public static void main(String [] args){
        
        Scanner myScanner = new Scanner(System.in);     //declares and constructs instance of Scanner
        
        System.out.print("Enter an integer between 5 and 30, inclusively: ");       //prompts user for an integer
        
        boolean check = false;
        int number = 0;
        
        while (!check){                     //while check is false, loop runs
            if (myScanner.hasNextInt()){            //checks if number is an integer
                
                number = myScanner.nextInt();           //stores integer in number
                
                if (number >= 5 && number <= 30){           //check if number is between 5 and 30
                    check = true;                           //sets check as true
                }
                else {                                  //else, prompts user for another number
                    System.out.println("Error.  Must be between 5 and 30.");            
                    System.out.print("Enter an integer between 5 and 30, inclusively: ");
                }
            }
            else {
                System.out.println("Error. Number must be an intger.");
                System.out.print("Enter an integer between 5 and 30, inclusively: ");
                myScanner.next();                       //accepts users next input
            }
        }
        
        int printRow = 1;              //stores value that will be printed
        int printCol = 1;              //stores how many times that value will be printed
            
        System.out.println("For loop: ");
        
        for (int rows = 1; rows <= ((2 * number) - 1); rows++){         //controls how many rows to print
            
            for (int col = 1; col <= printCol; col++){                  //controls how many of the value to print
                System.out.print(printRow);
            }
            if (rows < number){                     //when rows is less than number, the number printed increments and the amount of times it is printed increments
            
                printRow++;
                printCol++;
            }
            else {                                  //when the rows is larger than number, the number printed decrements and the amount of times it is printed decrements
                printRow--;
                printCol--;
            }
            
            System.out.println("");                 //starts new line
            
        }       //end of for loop
        
        System.out.println("");                 //starts new line
        System.out.println("While loop: ");
        
        int rows = 1;                           //stores the row that will be printed
        printRow = 1;                           //stores the number that will printed
        printCol = 1;                           //stores how many times that number will be printed
        
        while (rows <= ((2 * number) - 1)){         //controls how many rows there will be
            
            int col = 1;                            //stores the column that will be printed
            
            while (col <= printCol){                //controls how many times the number will be printed
                System.out.print(printRow);
                col++;
            }
            if (rows < number){                 //when rows is less than number, the number printed increases and the amount of times it is printed increases
                printRow++;
                printCol++;
            }
            else {                      //when the rows is larger than number, the number printed decreases and the amount of times it is printed decreases
                printRow--;
                printCol--;
            }
            
            System.out.println("");         //starts new line
            rows++;                     //increments rows
        }       //end of while loop
        
        
        System.out.println("");                 //starts new line
        System.out.println("Do while loop: ");
        
        rows = 1;                   //stores row that will be printed
        printRow = 1;               //stores the number that will be printed
        printCol = 1;               //stores how many times that number will be printed
        
        do {                        //start of first do while
            int col = 1;
            
            do {
                System.out.print(printRow);
                col++;                          //increments col
            
            } while (col <= printCol);          //controls how many times the number is printed
            
            if (rows < number){                 //when rows is less than number, the number printed increments and the amount of times it is printed increments
                printRow++;
                printCol++;
            }
            else {                      //when the rows is larger than number, the number printed decrements and the amount of times it is printed decrements
                printRow--;
                printCol--;
            }
            
            System.out.println("");         //starts new line
            rows++;                     //increments rows
            
        } while (rows <= ((2 * number) - 1));       //controls how many rows there will be
        
        
    } //end main method
}   //end class