
import java.util.Scanner;

public class volunteer {

      public static String formatCard(String card) {
            String end = "";
            card = card.substring(0, 1).toUpperCase() + card.substring(1).toLowerCase();
            end = card.substring((card.length() - 1)).toUpperCase();
            card = card.substring(0, card.length() - 1) + end;

            return card;
      }

      public static boolean realCard(String card) {
            boolean isRealCard = false;
            if (card.equals("Joker") || card.equals("joker")) {
                  isRealCard = true;
            }
            else{
                  String whole[] = card.split(" ");
                  String suite = whole[0];
                  String value = whole[1];
                  // suite = card.substring(0,(card.length()-2));
                  // value = card.substring(card.length()-1);
                  // System.out.println("        suite = "+suite);
                  // System.out.println("        value = "+value);
                  // System.out.println("        values length = "+value.length());
                  if ((suite.equals("Club")||suite.equals("Spade")||
                      suite.equals("Heart") || suite.equals("Diamond")) && 
                      (value.matches("[2-9]|1[0]")/* || value.equals("10")  */|| value.matches("[JQKA]"))){
                        isRealCard = true;
                  }
            }
            return isRealCard;
      }

      public static void/* String[] */ chooseCardsMagician() {
            /* String[] magician = new String[7]; */

            // This method will be what asks the user for input
            String card1, card2, card3, card4, card5, card6, card7;
            Scanner drawnCard = new Scanner(System.in);

            System.out.printf("\033c"); // clear screen
            System.out.println("Oh great magician, what cards to you see going from left to right?");
            System.out.println("Type in the cards one at a time beginning with the first card:\n");
            System.out.print("Card 1 = ");
            card1 = formatCard(drawnCard.nextLine());
            while (!realCard(card1)) {
                  System.out.println("Card Invalid Please try again\n");
                  System.out.print("Card 1 = ");
                  card1 = formatCard(drawnCard.nextLine());
            }

            System.out.print("Card 2 = ");
            card2 = formatCard(drawnCard.nextLine());
            while (!realCard(card2)) {
                  System.out.println("Card Invalid Please try again\n");
                  System.out.print("Card 2 = ");
                  card2 = formatCard(drawnCard.nextLine());
            }

            System.out.print("Card 3 = ");
            card3 = formatCard(drawnCard.nextLine());
            while (!realCard(card3)) {
                  System.out.println("Card Invalid Please try again\n");
                  System.out.print("Card 3 = ");
                  card3 = formatCard(drawnCard.nextLine());
            }

            System.out.print("Card 4 = ");
            card4 = formatCard(drawnCard.nextLine());
            while (!realCard(card4)) {
                  System.out.println("Card Invalid Please try again\n");
                  System.out.print("Card 4 = ");
                  card4 = formatCard(drawnCard.nextLine());
            }

            System.out.print("Card 5 = ");
            card5 = formatCard(drawnCard.nextLine());
            while (!realCard(card5)) {
                  System.out.println("Card Invalid Please try again\n");
                  System.out.print("Card 5 = ");
                  card5 = formatCard(drawnCard.nextLine());
            }

            System.out.print("Card 6 = ");
            card6 = formatCard(drawnCard.nextLine());
            while (!realCard(card6)) {
                  System.out.println("Card Invalid Please try again\n");
                  System.out.print("Card 6 = ");
                  card6 = formatCard(drawnCard.nextLine());
            }

            System.out.print("Card 7 = ");
            card7 = formatCard(drawnCard.nextLine());
            while (!realCard(card7)) {
                  System.out.println("Card Invalid Please try again\n");
                  System.out.print("Card 7 = ");
                  card7 = formatCard(drawnCard.nextLine());
            }

            System.out.println("\nBased off these cards: ");
            System.out.println(card1 + ", " + card2 + ", " + card3 + ", " + card4 + ", " + card5 + ", " + card6 + ", "
                        + card7 + "\n");

            magician.magic(card1, card2, card3, card4, card5, card6, card7);

            /*
             * magician[0] = card1; magician[1] = card2; magician[2] = card3; magician[3] =
             * card4; magician[4] = card5; magician[5] = card6; magician[6] = card7;
             * 
             * return magician;
             */
      }

      public static void /* String[] */ chooseCardsAssistant() {
            /* String[] assistant = new String[9]; */

            // This method will be what asks the user for input
            String card1, card2, card3, card4, card5, card6, card7, hiddenCard1, hiddenCard2;
            Scanner drawnCard = new Scanner(System.in);

            System.out.printf("\033c"); // clear screen
            System.out.println("Please Draw/Choose 7 Cards\n");
            System.out.print("Card 1 = ");
            card1 = formatCard(drawnCard.nextLine());
            while (!realCard(card1)) {
                  System.out.println("Card Invalid Please try again\n");
                  System.out.print("Card 1 = ");
                  card1 = formatCard(drawnCard.nextLine());
            }

            System.out.print("Card 2 = ");
            card2 = formatCard(drawnCard.nextLine());
            while (!realCard(card2)) {
                  System.out.println("Card Invalid Please try again\n");
                  System.out.print("Card 2 = ");
                  card2 = formatCard(drawnCard.nextLine());
            }

            System.out.print("Card 3 = ");
            card3 = formatCard(drawnCard.nextLine());
            while (!realCard(card3)) {
                  System.out.println("Card Invalid Please try again\n");
                  System.out.print("Card 3 = ");
                  card3 = formatCard(drawnCard.nextLine());
            }

            System.out.print("Card 4 = ");
            card4 = formatCard(drawnCard.nextLine());
            while (!realCard(card4)) {
                  System.out.println("Card Invalid Please try again\n");
                  System.out.print("Card 4 = ");
                  card4 = formatCard(drawnCard.nextLine());
            }

            System.out.print("Card 5 = ");
            card5 = formatCard(drawnCard.nextLine());
            while (!realCard(card5)) {
                  System.out.println("Card Invalid Please try again\n");
                  System.out.print("Card 5 = ");
                  card5 = formatCard(drawnCard.nextLine());
            }

            System.out.print("Card 6 = ");
            card6 = formatCard(drawnCard.nextLine());
            while (!realCard(card6)) {
                  System.out.println("Card Invalid Please try again\n");
                  System.out.print("Card 6 = ");
                  card6 = formatCard(drawnCard.nextLine());
            }

            System.out.print("Card 7 = ");
            card7 = formatCard(drawnCard.nextLine());
            while (!realCard(card7)) {
                  System.out.println("Card Invalid Please try again\n");
                  System.out.print("Card 7 = ");
                  card7 = formatCard(drawnCard.nextLine());
            }

            System.out.println(
                        "\nNow Choose 2 cards to be the Hidden Cards.\nThese will be what the magician needs to guess\n");
            System.out.print("Hidden Card 1 = ");
            hiddenCard1 = formatCard(drawnCard.nextLine());
            while (!realCard(hiddenCard1)) {
                  System.out.println("Card Invalid Please try again\n");
                  System.out.print("Hidden Card 1 = ");
                  hiddenCard1 = formatCard(drawnCard.nextLine());
            }

            System.out.print("Hidden Card 2 = ");
            hiddenCard2 = formatCard(drawnCard.nextLine());
            while (!realCard(hiddenCard2)) {
                  System.out.println("Card Invalid Please try again\n");
                  System.out.print("Hidden Card 2 = ");
                  hiddenCard2 = formatCard(drawnCard.nextLine());
            }

            /*
             * System.out.println("\nRemember, These are you cards:");
             * System.out.println(card1 + ", " +card2 + ", "+ card3 + ", "+ card4 + ", "
             * +card5 + ", "+ card6 + ", "+ card7 + ", " +"*"+hiddenCard1 + ", "
             * +"*"+hiddenCard2 + "\n");
             */

            assistant.assist(card1, card2, card3, card4, card5, card6, card7, hiddenCard1, hiddenCard2);

            /*
             * assistant[0] = card1; assistant[1] = card2; assistant[2] = card3;
             * assistant[3] = card4; assistant[4] = card5; assistant[5] = card6;
             * assistant[6] = card7; assistant[7] = hiddenCard1; assistant[8] = hiddenCard2;
             * 
             * 
             * return assistant;
             */

      }
}