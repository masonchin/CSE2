//Mason Chin
//February 6th
//CSE 002 hw02
//This program will compute the cost of a purchase including sales tax

public class Arithmetic {
    public static void main(String[] args) {
        
            int numPants = 3;            //number of pairs of pants
            double pantsPrice = 34.98;   //cost per pair of pants
            int numShirts = 2;           //number of sweatshirts
            double shirtPrice = 24.99;   //cost per sweatshirt
            int numBelts = 1;            //number of betls
            double beltPrice = 33.99;    //price of beltPrice
            double paSalesTax = 0.06;    //tax rate
            
            double oneHundred = 100;     //used to truncate decimal to two decimal places
        //declaring variables for each value
            double totalCostOfPants, totalCostOfShirts, totalCostOfBelts;
            double totalTaxPants, totalTaxShirts, totalTaxBelts;
            double totalBeforeTax, totalSalesTax, totalAfterTax;
            
        
        //computing the total prices
            totalCostOfPants = (numPants*pantsPrice)*oneHundred;             //total cost of pants
            totalCostOfShirts = (numShirts*shirtPrice)*oneHundred;           //total cost of shirts
            totalCostOfBelts = (numBelts*beltPrice)*oneHundred;              //total cost of belts
            totalTaxPants = (numPants*(pantsPrice*paSalesTax))*oneHundred;   //total sales tax on pants purchased
            totalTaxShirts = (numShirts*(shirtPrice*paSalesTax))*oneHundred;  //total sales tax on shirts purchased
            totalTaxBelts = (numBelts*(beltPrice*paSalesTax))*oneHundred;    //total sales tax on belts purchased
            totalBeforeTax = (totalCostOfPants+totalCostOfShirts+totalCostOfBelts);
            totalSalesTax = (totalTaxPants+totalTaxShirts+totalTaxBelts);
            totalAfterTax = (totalBeforeTax+totalSalesTax);
            
            int x = (int) totalTaxPants;    //casting double as int
            int y = (int) totalTaxShirts;   //casting double as int
            int z = (int) totalTaxBelts;    //casting double as int
            int w = (int) totalSalesTax;    //casting double as int
            int v = (int) totalAfterTax;     //casting double as int 
            
            
        //printing out total prices
            System.out.println("Total cost of pants is" + "$"+(totalCostOfPants/oneHundred));
            System.out.println("Total cost of shirts is" + "$"+(totalCostOfShirts/oneHundred));
            System.out.println("Total cost of belts is" + "$"+(totalCostOfBelts/oneHundred));
            System.out.println("Total sales tax on pants is" + "$"+ (x/oneHundred));
            System.out.println("Total sales tax on shirts is" + "$"+(y/oneHundred));
            System.out.println("Total sales tax on belts is" + "$"+(z/oneHundred));
            System.out.println("Total cost before sales tax is" + "$"+(totalBeforeTax/oneHundred));
            System.out.println("Total cost of sales tax is" + "$"+(w/oneHundred));
            System.out.println("Total cost after sales tax is" + "$"+(v/oneHundred));
            
            //in order to truncate decimal to 2 decimal places, value was multiplied by 100, converted to an int, and then divided by 100
        
    }
}