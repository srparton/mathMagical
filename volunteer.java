
import java.util.Scanner;

public class volunteer {
   public static void main(String args[]) {

      
      //This method will be what asks the user for input 
      String card1, card2, card3, card4, card5, hiddenCard1, hiddenCard2;
      Scanner drawnCard = new Scanner(System.in);

      System.out.println("Please Draw/Choose 5 Cards");
      card1 = drawnCard.nextLine();
      card2 = drawnCard.nextLine();
      card3 = drawnCard.nextLine();
      card4 = drawnCard.nextLine();
      card5 = drawnCard.nextLine();

      System.out.println("\nNow Choose 2 cards to be the Hidden Cards.\nThese will be what the magician nees to guess\n");

      hiddenCard1 = drawnCard.nextLine();
      hiddenCard2 = drawnCard.nextLine();

      System.out.println("Remember, These are you cards:");
      System.out.print(card1+", "); 

      System.out.print(card2+", "); 

      System.out.print(card3+", "); 

      System.out.print(card4+", "); 

      System.out.print(card5+", "); 

      System.out.print(hiddenCard1+", "); 

<<<<<<< Updated upstream
      System.out.println("Hidden card "+i+" = "+hiddenCard2); 
=======
      System.out.print(hiddenCard2+"\n"); 
      
>>>>>>> Stashed changes
   }
}