
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

      int i = 1;
      System.out.println("card "+i+" = "+card1); 
      i++;

      System.out.println("card "+i+" = "+card2); 
      i++;

      System.out.println("card "+i+" = "+card3); 
      i++;

      System.out.println("card "+i+" = "+card4); 
      i++;

      System.out.println("card "+i+" = "+card5); 
      i = 1;

      System.out.println("Hidden card "+i+" = "+hiddenCard1); 
      i++;

      System.out.println("Hidden card "+i+" = "+hiddenCard2); 
   }
}