//Mason Chin
//February 19
//CSE002 lab04
//Program will random select a card from a deck

public class CardGenerator {
    public static void main(String[] args) {
        
    //generates random numbers between 1 to 52
        int randomNumber = (int) (Math.random() * 53) + 1;
        
    //creating two string variables
        String suit = null;
        String card = null;
    
    //if statements to assign card number to suit name
        if (randomNumber >= 1 && randomNumber <= 13){
            suit = "diamonds";
        }
        else if (randomNumber >= 14 && randomNumber <= 26){
            suit = "clubs";
        }
        else if (randomNumber >= 27 && randomNumber <= 39){
            suit = "hearts";
        }
        else if (randomNumber >= 40 && randomNumber <= 52){
            suit = "spades";
        }
        
    //the remainder of the randomNumber when divided by 13 will be the card identity
        int number = (int) (randomNumber % 13);
        
    //switch statement that assigns identity of card
        switch (number){
            case 1: card = "ace"; 
                    break;
            case 2: card = "2";
                    break;
            case 3: card = "3";
                    break;
            case 4: card = "4"; 
                    break;
            case 5: card = "5";
                    break;
            case 6: card = "6";
                    break;
            case 7: card = "7"; 
                    break;
            case 8: card = "8";
                    break;
            case 9: card = "9";
                    break;
            case 10: card = "10"; 
                    break;
            case 11: card = "jack";
                    break;
            case 12: card = "queen";
                    break;
            case 0: card = "king";
                    break;
        }
    //printing out random card
        System.out.println("You're card is the " + card + " of " + suit);
    }
}
