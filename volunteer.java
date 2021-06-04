
import java.util.Scanner;

public class volunteer {
   public static void main(String args[]) {

      
      //This method will be what asks the user for input 
      String card1, card2, card3, card4, card5, hiddenCard1, hiddenCard2, end;
      Scanner drawnCard = new Scanner(System.in);

      System.out.println("Please Draw/Choose 5 Cards");
      card1 = drawnCard.nextLine();
      // System.out.println("card 1 = " + card1); 
      card2 = drawnCard.nextLine();
      card3 = drawnCard.nextLine();
      card4 = drawnCard.nextLine();
      card5 = drawnCard.nextLine();
      

      System.out.println("\nNow Choose 2 cards to be the Hidden Cards.\nThese will be what the magician nees to guess\n");

      hiddenCard1 = drawnCard.nextLine();
      hiddenCard2 = drawnCard.nextLine();
      

      //Ensure the case of the card is corret
      card1 = card1.substring(0,1).toUpperCase() + card1.substring(1).toLowerCase();
      end = card1.substring((card1.length() - 1)).toUpperCase();
      card1 = card1.substring(0,card1.length()-1) + end;
      
      card2 = card2.substring(0,1).toUpperCase() + card2.substring(1).toLowerCase();
      end = card2.substring((card2.length() - 1)).toUpperCase();
      card2 = card2.substring(0,card2.length()-1) + end;

      card3 = card3.substring(0,1).toUpperCase() + card3.substring(1).toLowerCase();
      end = card3.substring((card3.length() - 1)).toUpperCase();
      card3 = card3.substring(0,card3.length()-1) + end;

      card4 = card4.substring(0,1).toUpperCase() + card4.substring(1).toLowerCase();
      end = card4.substring((card4.length() - 1)).toUpperCase();
      card4 = card4.substring(0,card4.length()-1) + end;

      card5 = card5.substring(0,1).toUpperCase() + card5.substring(1).toLowerCase();
      end = card5.substring((card5.length() - 1)).toUpperCase();
      card5 = card5.substring(0,card5.length()-1) + end;

      hiddenCard1 = hiddenCard1.substring(0,1).toUpperCase() + hiddenCard1.substring(1).toLowerCase();
      end = hiddenCard1.substring((hiddenCard1.length() - 1)).toUpperCase();
      hiddenCard1 = hiddenCard1.substring(0,hiddenCard1.length()-1) + end;

      hiddenCard2 = hiddenCard2.substring(0,1).toUpperCase() + hiddenCard2.substring(1).toLowerCase();
      end = hiddenCard2.substring((hiddenCard2.length() - 1)).toUpperCase();
      hiddenCard2 = hiddenCard2.substring(0,hiddenCard2.length()-1) + end;


      System.out.println("Remember, These are you cards:");
      System.out.print(card1+", "); 

      System.out.print(card2+", "); 

      System.out.print(card3+", "); 

      System.out.print(card4+", "); 

      System.out.print(card5+", "); 

      System.out.print(hiddenCard1+", "); 

      System.out.print(hiddenCard2+"\n"); 
      
      
   }
}