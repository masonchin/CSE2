//Mason Chin
//February 13th
//CSE002 hw03
//This program will allow a user to enter the dimensions of a pyramid and will calculate and print the volume inside the pyramid.

//Scanner clas must first be imported
import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        
        //declaring and contructing an instance of Scanner
            Scanner myScanner = new Scanner(System.in);
                     
        //promts user to imput legnth of the pyramid
            System.out.print("The square side of the pyramid is (input legnth): ");
            double numLegnth = myScanner.nextDouble();  //accepts user input
            
        //prompts user to input height of the pyramid
            System.out.print("The heigt of the pyramid is (input height): ");
            double numHeight = myScanner.nextDouble();  //accepts user input
            
        //calculating the volume of the pyramid, Volume=(legnth*width*height)/3
        
            double numVolume = ((numLegnth * numLegnth) * numHeight)/3;
            
        //print out the volume of the pyramid with user input
            System.out.println("The volume inside the pyramid is: " + numVolume);
            
            
    }   //end of main method
}   //end of class