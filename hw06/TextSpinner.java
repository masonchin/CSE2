//Mason Chin
//March 5th
//CSE002 hw06
//Program will simulate a spinner in infinite loop

public class TextSpinner {
    public static void main (String [] args) {
        
    //sets number to 0
        int number = 0;
        
    //since number will always be set to 0, the loop will run indefinitely
        while (number == 0) {
            System.out.print("/");              //prints /
            System.out.print("\b");             //deletes last character
            System.out.print("-");              //prints -
            System.out.print("\b");             //deletes last character
            System.out.print("\\");             //prints \
            System.out.print("\b");             //deletes last character
            System.out.print("|");              //prints |
            System.out.print("\b");             //deletes last character
        }
    }
}