//Mason Chin
//February 19
//CSE002 hw04
//Program will convert RGB decimal values and convert them to hexidecimal

import java.util.Scanner;

public class ToHex {
    public static void main (String [] args) {
        
    //declaring and constructing an instance of Scanner    
        Scanner myScanner = new Scanner(System.in);
        
    //prompts user to input RBG values and accepts user input
        System.out.print("Please enter three RGB integers: ");
        int rValue = myScanner.nextInt();
        int gValue = myScanner.nextInt();
        int bValue = myScanner.nextInt();
    
    //creating variables
        int rHex = 0;               //will store number of times 16 can go into rValue
        int rRemainder = 0;         //will store the remainder of the rValue/16
        
        int gHex = 0;               //will store number of times 16 can go into gValue
        int gRemainder = 0;         //will store the remainder of gValue/16
        
        int bHex = 0;               //will store number of times 16 can go into bValue
        int bRemainder = 0;         //will store the remainder of bValue/16
        
           
        String hex1 = null;         //will store first character of hexidecimal
        String hex2 = null;         //will store second character of hexidecimal
        String hex3 = null;         //will store third character of hexidecimal
        String hex4 = null;         //will store fourth character of hexidecimal
        String hex5 = null;         //will store fifth character of hexidecimal
        String hex6 = null;         //will store sixth character of hexidecimal
        
    //if statement to make sure number inputted is between 0-255, if so the calculation to convert to hexidcemial will proceed
    if ((0 <= rValue && rValue <= 255) && (0 <= gValue && gValue <= 255) && (0 <= bValue && bValue <= 255)) {
        rHex = (rValue/16);
        rRemainder = (rValue % 16);
        
        gHex = (gValue/16);
        gRemainder = (gValue % 16);
        
        bHex = (bValue/16);
        bRemainder = (bValue % 16);
        
    //switch statements assigning decimal values to hexadecimal values, each hexidecimal character has its own switch statement
        switch (rHex){      //assigns first hexidecimal value
            case 0: hex1 = "0";
            break;
            case 1: hex1 = "1";
            break;
            case 2: hex1 = "2";
            break;
            case 3: hex1 = "3";
            break;
            case 4: hex1 = "4";
            break;
            case 5: hex1 = "5";
            break;
            case 6: hex1 = "6";
            break;
            case 7: hex1 = "7";
            break;
            case 8: hex1 = "8";
            break;
            case 9: hex1 = "9";
            break;
            case 10: hex1 = "A";
            break;
            case 11: hex1 = "B";
            break;
            case 12: hex1 = "C";
            break;
            case 13: hex1 = "D";
            break;
            case 14: hex1 = "E";
            break;
            case 15: hex1 = "F";
            break;
        }
        switch (rRemainder){        //assigns second hexidecimal value
            case 0: hex2 = "0";
            break;
            case 1: hex2 = "1";
            break;
            case 2: hex2 = "2";
            break;
            case 3: hex2 = "3";
            break;
            case 4: hex2 = "4";
            break;
            case 5: hex2 = "5";
            break;
            case 6: hex2 = "6";
            break;
            case 7: hex2 = "7";
            break;
            case 8: hex2 = "8";
            break;
            case 9: hex2 = "9";
            break;
            case 10: hex2 = "A";
            break;
            case 11: hex2 = "B";
            break;
            case 12: hex2 = "C";
            break;
            case 13: hex2 = "D";
            break;
            case 14: hex2 = "E";
            break;
            case 15: hex2 = "F";
            break;
        }
        switch (gHex){      //assigns third hexidecimal value
            case 0: hex3 = "0";
            break;
            case 1: hex3 = "1";
            break;
            case 2: hex3 = "2";
            break;
            case 3: hex3 = "3";
            break;
            case 4: hex3 = "4";
            break;
            case 5: hex3 = "5";
            break;
            case 6: hex3 = "6";
            break;
            case 7: hex3 = "7";
            break;
            case 8: hex3 = "8";
            break;
            case 9: hex3 = "9";
            break;
            case 10: hex3 = "A";
            break;
            case 11: hex3 = "B";
            break;
            case 12: hex3 = "C";
            break;
            case 13: hex3 = "D";
            break;
            case 14: hex3 = "E";
            break;
            case 15: hex3 = "F";
            break;
        }
        switch (gRemainder){        //assigns fourth hexidecimal value
            case 0: hex4 = "0";
            break;
            case 1: hex4 = "1";
            break;
            case 2: hex4 = "2";
            break;
            case 3: hex4 = "3";
            break;
            case 4: hex4 = "4";
            break;
            case 5: hex4 = "5";
            break;
            case 6: hex4 = "6";
            break;
            case 7: hex4 = "7";
            break;
            case 8: hex4 = "8";
            break;
            case 9: hex4 = "9";
            break;
            case 10: hex4 = "A";
            break;
            case 11: hex4 = "B";
            break;
            case 12: hex4 = "C";
            break;
            case 13: hex4 = "D";
            break;
            case 14: hex4 = "E";
            break;
            case 15: hex4 = "F";
            break;
        }
        switch (bHex){        //assigns fifth hexidecimal value
            case 0: hex5 = "0";
            break;
            case 1: hex5 = "1";
            break;
            case 2: hex5 = "2";
            break;
            case 3: hex5 = "3";
            break;
            case 4: hex5 = "4";
            break;
            case 5: hex5 = "5";
            break;
            case 6: hex5 = "6";
            break;
            case 7: hex5 = "7";
            break;
            case 8: hex5 = "8";
            break;
            case 9: hex5 = "9";
            break;
            case 10: hex5 = "A";
            break;
            case 11: hex5 = "B";
            break;
            case 12: hex5 = "C";
            break;
            case 13: hex5 = "D";
            break;
            case 14: hex5 = "E";
            break;
            case 15: hex5 = "F";
            break;
        }
        switch (bRemainder){        //assigns sixth hexidecimal value
            case 0: hex6 = "0";
            break;
            case 1: hex6 = "1";
            break;
            case 2: hex6 = "2";
            break;
            case 3: hex6 = "3";
            break;
            case 4: hex6 = "4";
            break;
            case 5: hex6 = "5";
            break;
            case 6: hex6 = "6";
            break;
            case 7: hex6 = "7";
            break;
            case 8: hex6 = "8";
            break;
            case 9: hex6 = "9";
            break;
            case 10: hex6 = "A";
            break;
            case 11: hex6 = "B";
            break;
            case 12: hex6 = "C";
            break;
            case 13: hex6 = "D";
            break;
            case 14: hex6 = "E";
            break;
            case 15: hex6 = "F";
            break;
        }
        
    //prints final hexidecimal final    
        System.out.println("The decimal numbers R:" + rValue + " G:" + gValue + " B:" + bValue + " are represented in hexidecimal as " + 
            hex1+hex2+hex3+hex4+hex5+hex6);
    }
    
    //prints if the inputted numbers are not between 0-255
    else {
        System.out.println("Sorry, your input must be in between 0-255.");
    }
    
    }   //end of main method
}   //end of claass