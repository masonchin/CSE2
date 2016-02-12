//Mason Chin
//February 12
//CSE2 lab03
//Program will calculate tip for a bill and the number of ways the check can be split

import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        
        //declaring and constructing an instance of Scanner
        Scanner myScanner = new Scanner(System.in);
        
        
        //prompts user to enter original cost of the check
        System.out.print("Enter the original cost of the check in the form xx.xx: ");
        
        //accepts user input'
        double checkCost = myScanner.nextDouble();
        
        //prompts user for tip percentage and accepts user input
        System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): ");
        
        double tipPercent = myScanner.nextDouble();
        tipPercent/= 100;   //converts percentage to decimal
        
        //prompts user for number of people
        System.out.print("Enter the number of people who went out to dinner: ");
        int numPeople = myScanner.nextInt();
        
        //outputs the amount each person needs to pay
        double totalCost;
        double costPerPerson;
        int dollars, dimes, pennies;
        
        totalCost = checkCost * (1 + tipPercent);
        costPerPerson = (totalCost/numPeople);
        
        //get the whole number and dropping decimal fraction
        dollars = (int) costPerPerson;
        
        //get dimes and pennies amounts and print
        dimes = (int) (costPerPerson * 10) % 10;
        pennies = (int) (costPerPerson * 100) % 10;
        System.out.println("Each person in the group owes $ " + dollars +
            '.' + dimes + pennies);

        
        
    }   //end of main method
}   //end of class