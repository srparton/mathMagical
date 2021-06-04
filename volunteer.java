
import java.util.Scanner;

public class volunteer {

      public static String formatCard(String card) {
            String end = "";
            card = card.substring(0, 1).toUpperCase() + card.substring(1).toLowerCase();
            end = card.substring((card.length() - 1)).toUpperCase();
            card = card.substring(0, card.length() - 1) + end;

            return card;
      }

      public static void main(String args[]) {

            // This method will be what asks the user for input
            String card1, card2, card3, card4, card5, card6, card7, hiddenCard1, hiddenCard2, end;
            Scanner drawnCard = new Scanner(System.in);

            System.out.println("Please Draw/Choose 7 Cards");
            card1 = formatCard(drawnCard.nextLine());
            card2 = formatCard(drawnCard.nextLine());
            card3 = formatCard(drawnCard.nextLine());
            card4 = formatCard(drawnCard.nextLine());
            card5 = formatCard(drawnCard.nextLine());
            card6 = formatCard(drawnCard.nextLine());
            card7 = formatCard(drawnCard.nextLine());
            hiddenCard1 = formatCard(drawnCard.nextLine());
            hiddenCard2 = formatCard(drawnCard.nextLine());
            // card1 = formatCard(card1);
            // System.out.println("card 1 = " + card1);
            // card2 = formatCard(drawnCard.nextLine());

            // System.out.println(card1);
            // System.out.print(card2 + ", ");
            

/*
            card3 = drawnCard.nextLine();
            card4 = drawnCard.nextLine();
            card5 = drawnCard.nextLine();
            card6 = drawnCard.nextLine();
            card7 = drawnCard.nextLine();

            System.out.println(
                        "\nNow Choose 2 cards to be the Hidden Cards.\nThese will be what the magician nees to guess\n");

            hiddenCard1 = drawnCard.nextLine();
            hiddenCard2 = drawnCard.nextLine();

            // make this a seperate function so i dont have to call the same thing so many
            // times.
            // Ensure the case of the card is corret
            card1 = card1.substring(0, 1).toUpperCase() + card1.substring(1).toLowerCase();
            end = card1.substring((card1.length() - 1)).toUpperCase();
            card1 = card1.substring(0, card1.length() - 1) + end;

            card2 = card2.substring(0, 1).toUpperCase() + card2.substring(1).toLowerCase();
            end = card2.substring((card2.length() - 1)).toUpperCase();
            card2 = card2.substring(0, card2.length() - 1) + end;

            card3 = card3.substring(0, 1).toUpperCase() + card3.substring(1).toLowerCase();
            end = card3.substring((card3.length() - 1)).toUpperCase();
            card3 = card3.substring(0, card3.length() - 1) + end;

            card4 = card4.substring(0, 1).toUpperCase() + card4.substring(1).toLowerCase();
            end = card4.substring((card4.length() - 1)).toUpperCase();
            card4 = card4.substring(0, card4.length() - 1) + end;

            card5 = card5.substring(0, 1).toUpperCase() + card5.substring(1).toLowerCase();
            end = card5.substring((card5.length() - 1)).toUpperCase();
            card5 = card5.substring(0, card5.length() - 1) + end;

            card6 = card6.substring(0, 1).toUpperCase() + card6.substring(1).toLowerCase();
            end = card6.substring((card6.length() - 1)).toUpperCase();
            card6 = card6.substring(0, card6.length() - 1) + end;

            card7 = card7.substring(0, 1).toUpperCase() + card7.substring(1).toLowerCase();
            end = card7.substring((card7.length() - 1)).toUpperCase();
            card7 = card7.substring(0, card7.length() - 1) + end;

            hiddenCard1 = hiddenCard1.substring(0, 1).toUpperCase() + hiddenCard1.substring(1).toLowerCase();
            end = hiddenCard1.substring((hiddenCard1.length() - 1)).toUpperCase();
            hiddenCard1 = hiddenCard1.substring(0, hiddenCard1.length() - 1) + end;

            hiddenCard2 = hiddenCard2.substring(0, 1).toUpperCase() + hiddenCard2.substring(1).toLowerCase();
            end = hiddenCard2.substring((hiddenCard2.length() - 1)).toUpperCase();
            hiddenCard2 = hiddenCard2.substring(0, hiddenCard2.length() - 1) + end;

            System.out.println("\nRemember, These are you cards:");
*/

            System.out.println(card1 + ", "
            +card2 + ", "+ card3 + ", "+ card4 + ", "
            +card5 + ", "+ card6 + ", "+ card7 + ", " 
            +hiddenCard1 + ", " + hiddenCard2 + "\n");
/*
            String[] order = new String[7];
            order = assistant.assist(card1, card2, card3, card4, card5, card6, card7, hiddenCard1, hiddenCard2);

            System.out.println("ordered card 1 = " + order[1]);
            System.out.println("length of the ordered card = " + order[1].length());

            // magician.magic(order[0], order[1], order[2], order[3], order[4], order[5],
            // order[6]);
            magician.magic(args[0], args[1], args[2], args[3], args[4], args[5], args[6]);
*/
      }
}