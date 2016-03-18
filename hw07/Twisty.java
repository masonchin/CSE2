//Mason Chin
//March 12th
//CSE002 hw07
//program will print a twisty pattenr using loops

import java.util.Scanner;           //imports Scanner

public class Twisty {
    public static void main (String [] args) {
        
        int length = 0;            //will store first input
        int width = 0;              //will store second input

        
        Scanner myScanner = new Scanner(System.in);     //constructs and declares instance of Scanner
        
        System.out.print("Enter a desired length: "); //prompts user for length of twist
        
        boolean check = false;
        
        while (!check){
            if (myScanner.hasNextInt()){                //checks if input is an integer
            
                length = myScanner.nextInt();
                
               if (length <= 80) {                      //checks if input is less than 80
                   if (length > 0) {                    //checks if input is positive
                        
                        check = true;
                   }
                   else {
                       System.out.println("Error. Needs to be positive.");
                       System.out.print("Input the length: ");
                   }
               }
               else {
                   System.out.println("Error. Needs to be less than 80. ");
                   System.out.print("Input the length: ");
               }
            }
            else {
                System.out.println("Error. Need an integer. ");
                System.out.print("Input the length: ");
                myScanner.next();                   //accepts users next input
            }
        }
        
        System.out.print("Enter a desired width: ");        //prompts user to input width
        
        check = false;
        
        while (!check){
            if (myScanner.hasNextInt()){                //checks if input is an integer
            
                width = myScanner.nextInt();
                
                if (width < length) {                      //checks if width is less than length
                    if (width > 0) {                    //checks if input is positive
                        
                        check = true;
                    }
                    else {
                       System.out.println("Error. Needs to be positive.");
                       System.out.print("Input the width: ");
                    }
                }
                else {
                    System.out.println("Error. Needs to be less than length. ");
                    System.out.print("Input the width: ");
                }
            }
            else {
                System.out.println("Error. Need an integer. ");
                System.out.print("Input the width: ");
                myScanner.next();                   //accepts users next input
            }
        }
        
        int lengthSegment = width*2;                            //stores how long each segment will be, one segment is a V with its opposing upside down V
        int numSegment = length/lengthSegment;                  //stores how many segments there will be
        int curCol2 = width + 1;                                //serves as the pointer to the column when the / or \ is printed; its offset by the width + 1

            for (int curRow = 1; width >= curRow; curRow++){                //controls how many rows there will be
                
                for (int curCol = 1; length >= curCol; curCol++){           //controls when the # is will be printed in the row
                    if (curCol - (lengthSegment * 0) == curRow ||               //if the current column minus the segment number is equal to the current row, # will print. This recurring equation controls the down diagnol of the # pattern
                        curCol == (lengthSegment * 0) - (curRow - 1) ||         //if the current column is equal to the segment number minus the current row minus one, # will print. This recurring equation controls the up diagnol of the # pattern
                        curCol - (lengthSegment * 1) == curRow ||               //the equations increment up to 20 in order to accomodate enough segments if the largest possible legnth (80) and the smallest possible legnth is inputted
                        curCol == (lengthSegment * 1) - (curRow - 1) ||
                        curCol - (lengthSegment * 2) == curRow || 
                        curCol == (lengthSegment * 2) - (curRow - 1) || 
                        curCol - (lengthSegment * 3) == curRow ||
                        curCol == (lengthSegment * 3) - (curRow - 1) || 
                        curCol - (lengthSegment * 4) == curRow ||
                        curCol == (lengthSegment * 4) - (curRow - 1) ||
                        curCol - (lengthSegment * 5) == curRow ||
                        curCol == (lengthSegment * 5) - (curRow - 1) ||                     
                        curCol - (lengthSegment * 6) == curRow ||
                        curCol == (lengthSegment * 6) - (curRow - 1) ||    
                        curCol - (lengthSegment * 7) == curRow ||
                        curCol == (lengthSegment * 7) - (curRow - 1) ||
                        curCol - (lengthSegment * 8) == curRow ||
                        curCol == (lengthSegment * 8) - (curRow - 1) ||
                        curCol - (lengthSegment * 9) == curRow ||
                        curCol == (lengthSegment * 9) - (curRow - 1) ||
                        curCol - (lengthSegment * 10) == curRow ||
                        curCol == (lengthSegment * 10) - (curRow - 1) ||
                        curCol - (lengthSegment * 11) == curRow ||
                        curCol == (lengthSegment * 11) - (curRow - 1) ||
                        curCol - (lengthSegment * 12) == curRow ||
                        curCol == (lengthSegment * 12) - (curRow - 1) ||
                        curCol - (lengthSegment * 13) == curRow ||
                        curCol == (lengthSegment * 13) - (curRow - 1) ||
                        curCol - (lengthSegment * 14) == curRow ||
                        curCol == (lengthSegment * 14) - (curRow - 1) ||
                        curCol - (lengthSegment * 15) == curRow ||
                        curCol == (lengthSegment * 15) - (curRow - 1) ||
                        curCol - (lengthSegment * 16) == curRow ||
                        curCol == (lengthSegment * 16) - (curRow - 1) ||
                        curCol - (lengthSegment * 17) == curRow ||
                        curCol == (lengthSegment * 17) - (curRow - 1) ||
                        curCol - (lengthSegment * 18) == curRow ||
                        curCol == (lengthSegment * 18) - (curRow - 1) ||       
                        curCol - (lengthSegment * 19) == curRow ||
                        curCol == (lengthSegment * 19) - (curRow - 1) || 
                        curCol - (lengthSegment * 20) == curRow ||
                        curCol == (lengthSegment * 20) - (curRow - 1)) {
                        System.out.print("#");
                        curCol2++;                                                      //increment the curCol2 to keep pace with curCol
                    } 
                    else if (curCol2 == (lengthSegment * 0) - (curRow - 1) ||           //controls when the / is will be printed in the row 
                        curCol2 == (lengthSegment * 1) - (curRow - 1) ||                //if curCol2 is equal to the segment number minus the current row minus one, # will print. This recurring equation controls the up diagnol of the / pattern
                        curCol2 == (lengthSegment * 2) - (curRow - 1) ||                //the equations increment up to 20 in order to accomodate enough segments if the largest possible legnth (80) and the smallest possible legnth is inputted
                        curCol2 == (lengthSegment * 3) - (curRow - 1) || 
                        curCol2 == (lengthSegment * 4) - (curRow - 1) ||
                        curCol2 == (lengthSegment * 5) - (curRow - 1) ||                     
                        curCol2 == (lengthSegment * 6) - (curRow - 1) ||    
                        curCol2 == (lengthSegment * 7) - (curRow - 1) ||
                        curCol2 == (lengthSegment * 8) - (curRow - 1) ||
                        curCol2 == (lengthSegment * 9) - (curRow - 1) ||
                        curCol2 == (lengthSegment * 10) - (curRow - 1) ||
                        curCol2 == (lengthSegment * 11) - (curRow - 1) ||
                        curCol2 == (lengthSegment * 12) - (curRow - 1) ||
                        curCol2 == (lengthSegment * 13) - (curRow - 1) ||
                        curCol2 == (lengthSegment * 14) - (curRow - 1) ||   
                        curCol2 == (lengthSegment * 15) - (curRow - 1) ||     
                        curCol2 == (lengthSegment * 16) - (curRow - 1) ||   
                        curCol2 == (lengthSegment * 17) - (curRow - 1) ||                               
                        curCol2 == (lengthSegment * 18) - (curRow - 1) ||                               
                        curCol2 == (lengthSegment * 19) - (curRow - 1) ||                               
                        curCol2 == (lengthSegment * 20) - (curRow - 1)) {
                            System.out.print("/");
                            curCol2++;                                          //increment the curCol2 to keep pace with curCol
                    }
                    else if (curCol2 - (lengthSegment * 1) == curRow ||         //controls when the \ is will be printed in the row 
                        curCol2 - (lengthSegment * 2) == curRow ||              //if curCol2 minus the length of the segment is equal to the current row, \ will print. This recurring equation controls the down diagnol of the \ pattern
                        curCol2 - (lengthSegment * 3) == curRow ||              //the equations increment up to 20 in order to accomodate enough segments if the largest possible legnth (80) and the smallest possible legnth is inputted
                        curCol2 - (lengthSegment * 4) == curRow ||   
                        curCol2 - (lengthSegment * 5) == curRow ||
                        curCol2 - (lengthSegment * 6) == curRow ||
                        curCol2 - (lengthSegment * 7) == curRow ||
                        curCol2 - (lengthSegment * 8) == curRow ||
                        curCol2 - (lengthSegment * 9) == curRow ||
                        curCol2 - (lengthSegment * 10) == curRow ||
                        curCol2 - (lengthSegment * 11) == curRow ||
                        curCol2 - (lengthSegment * 12) == curRow ||
                        curCol2 - (lengthSegment * 13) == curRow ||                                    
                        curCol2 - (lengthSegment * 14) == curRow ||     
                        curCol2 - (lengthSegment * 15) == curRow ||     
                        curCol2 - (lengthSegment * 16) == curRow ||   
                        curCol2 - (lengthSegment * 17) == curRow ||                                
                        curCol2 - (lengthSegment * 18) == curRow ||                                   
                        curCol2 - (lengthSegment * 19) == curRow ||                                   
                        curCol2 - (lengthSegment * 20) == curRow) {
                            System.out.print("\\");
                            curCol2++;                                          //increment the curCol2 to keep pace with curCol
                    } 
                    else {
                        System.out.print(" ");                                  //if #, / or \ is not printed then print a blacnk space 
                        curCol2++;
                    }
                        

                } //End for curCol
                System.out.println("");                                         //End of row so print a new line
                curCol2 = width + 1;                                            //reset the column pointer for print / or \ on the new line

            } //End for curRow

        
    }       //end of main method
}           //end of class
