//Mason Chin
//February 13th
//CSE002 hw03
//This program will allow a user to input a number in meters and will convert and print it into inches.

//Scanner class must first be imported
import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        
        //declaring and constructing an instance of Scanner
            Scanner myScanner = new Scanner(System.in);
            
        //prompting user to input measurement in meters
            System.out.print("Enter a measurement in meters: ");
            
        //accepts user input
            double numMeters = myScanner.nextDouble();
            
        //assigning variables with values and declaring variables
            double numInches = 39.3701;
            
            double numConverted;    //this will store the converted number in inches
    
        //calculating the conversion and truncating it to the fourth decimal place
            numConverted = (numMeters * numInches) * 10000;
            
            int converted1 = (int) numConverted;
            double converted2 = ((double) converted1)/10000;
            
            
        //printing the value in inches
            System.out.println(numMeters + " meters is " + converted2 + " inches.");
            
        
        
    }   //end of main method
}   //end of class