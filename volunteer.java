import java.util.Scanner;


public class volunteer {

      public static String addCard(String cardNum) {
           
            Scanner newCard = new Scanner(System.in);
            String card;
            card = formatCard(newCard.nextLine());
            while (!realCard(card)) {
                  System.out.println("Card Invalid Please try again\n");
                  if(cardNum.equals("Hidden Card 1")|| cardNum.equals("Hidden Card 2")) System.out.print(cardNum + " = ");
                  else System.out.print("Card " +cardNum+" = ");
                  card = formatCard(newCard.nextLine());
            }
            // newCard.close();
            return card;
      }

      public static String[] checkInput(String c1,String c2,String c3,String c4,String c5,String c6,String c7,String c8,String c9) {
            String[] theChoosen = new String[9];           
            theChoosen[0] = c1;
            theChoosen[1] = c2;
            theChoosen[2] = c3;
            theChoosen[3] = c4;
            theChoosen[4] = c5;
            theChoosen[5] = c6;
            theChoosen[6] = c7;
            theChoosen[7] = c8;
            theChoosen[8] = c9;
 
            String input;
            Scanner inquire = new Scanner(System.in);
            System.out.println("\nHere is your chosen cards:");
            System.out.println("Card 1 = "+c1
            + "\nCard 2 = "+c2
            + "\nCard 3 = "+c3
            + "\nCard 4 = "+c4
            + "\nCard 5 = "+c5
            + "\nCard 6 = "+c6
            + "\nCard 7 = "+c7
            + "\nCard 8 (Hidden 1) = "+c8
            + "\nCard 9 (Hidden 2) = "+c9);
            System.out.println("\nDoes everything look correct (Y/N)");
            input = inquire.nextLine().toLowerCase();

            // while (!input.equals("y") || !input.equals("n")){
            while ((!input.matches("[yn]"))){
                  System.out.print("A simple y or n will do ");
                  input = inquire.nextLine().toLowerCase();
                  System.out.println("input = "+input);
            }

            if (input.equals("y")){
                  inquire.close();
                  return theChoosen;
            }
                  
            if(input.equals("n")){
                  System.out.println("Ok, which card do you want to change: 1 2 3 4 5 6 7 8 9");
                  System.out.print("Card Number: ");
                  input = inquire.nextLine();
                  int idiot = 0;
                  while(!input.matches("[1-9]")){
                        if(idiot==3) {
                              System.out.println("*** Idiot Alert Triggered ***");
                              idiot = 0;
                        }
                        System.out.println("Thats not a valid entry. Try again\n");
                        System.out.print("Which card do you want to change:");
                        input = inquire.nextLine();
                        idiot++;
                        // System.out.println("idiot = "+idiot);
                  }
                  if (input.equals("1")) theChoosen[0]= addCard("1");
                  if (input.equals("2")) theChoosen[1]= addCard("2");
                  if (input.equals("3")) theChoosen[2]= addCard("3");
                  if (input.equals("4")) theChoosen[3]= addCard("4");
                  if (input.equals("5")) theChoosen[4]= addCard("5");
                  if (input.equals("6")) theChoosen[5]= addCard("6");
                  if (input.equals("7")) theChoosen[6]= addCard("7");
                  if (input.equals("8")) theChoosen[7]= addCard("8");
                  if (input.equals("9")) theChoosen[8]= addCard("9");
            }           
            
            System.out.print("Do any other changes need to be made? (Y/N) ");     
            input = inquire.nextLine();
            while ((!input.matches("[yn]"))){
                  System.out.print("My patience is wearing thin");
                  input = inquire.nextLine().toLowerCase();
                  System.out.println("input = "+input);
            }
            if (input.equals("y")){
                  theChoosen = checkInput(theChoosen[0],theChoosen[1],theChoosen[2],theChoosen[3],theChoosen[4],theChoosen[5],theChoosen[6],theChoosen[7],theChoosen[8]);
            }

            inquire.close();
            return theChoosen;
      }
      
      public static String[] checkInput(String c1,String c2,String c3,String c4,String c5,String c6,String c7) {
            String[] theChoosen = new String[7];           
            theChoosen[0] = c1;
            theChoosen[1] = c2;
            theChoosen[2] = c3;
            theChoosen[3] = c4;
            theChoosen[4] = c5;
            theChoosen[5] = c6;
            theChoosen[6] = c7;
 
            String input;
            Scanner inquire = new Scanner(System.in);
            System.out.println("Here is your chosen cards:");
            System.out.println("Card 1 = "+c1
            + "\nCard 2 = "+c2
            + "\nCard 3 = "+c3
            + "\nCard 4 = "+c4
            + "\nCard 5 = "+c5
            + "\nCard 6 = "+c6
            + "\nCard 7 = "+c7);
            System.out.println("Does everything look correct (Y/N)");
            input = inquire.nextLine().toLowerCase();

            // while (!input.equals("y") || !input.equals("n")){
            while ((!input.matches("[yn]"))){
                  System.out.print("A simple y or n will do ");
                  input = inquire.nextLine().toLowerCase();
                  System.out.println("input = "+input);
            }

            if (input.equals("y")){
                  inquire.close();
                  return theChoosen;
            }
                  
            if(input.equals("n")){
                  System.out.println("Ok, which card do you want to change: 1 2 3 4 5 6 7 ");
                  System.out.print("Card Number: ");
                  input = inquire.nextLine();
                  int idiot = 0;
                  while(!input.matches("[1-9]")){
                        if(idiot==3) {
                              System.out.println("*** Idiot Alert Triggered ***");
                              idiot = 0;
                        }
                        System.out.println("Thats not a valid entry. Try again\n");
                        System.out.print("Which card do you want to change:");
                        input = inquire.nextLine();
                        idiot++;
                        // System.out.println("idiot = "+idiot);
                  }
                  if (input.equals("1")) theChoosen[0]= addCard("1");
                  if (input.equals("2")) theChoosen[1]= addCard("2");
                  if (input.equals("3")) theChoosen[2]= addCard("3");
                  if (input.equals("4")) theChoosen[3]= addCard("4");
                  if (input.equals("5")) theChoosen[4]= addCard("5");
                  if (input.equals("6")) theChoosen[5]= addCard("6");
                  if (input.equals("7")) theChoosen[6]= addCard("7");
            }           
            
            System.out.print("Do any other changes need to be made? (Y/N) ");     
            input = inquire.nextLine();
            while ((!input.matches("[yn]"))){
                  System.out.print("My patience is wearing thin");
                  input = inquire.nextLine().toLowerCase();
                  System.out.println("input = "+input);
            }
            if (input.equals("y")){
                  checkInput(theChoosen[0],theChoosen[1],theChoosen[2],theChoosen[3],theChoosen[4],theChoosen[5],theChoosen[6]);
                  // checkInput(c1, c2, c3, c4, c5, c6, c7);
            }

            inquire.close();
            return theChoosen;


      }
      public static String formatCard(String card) {
            // check for empty value. Issue will be stopped fully by realCard
            //    this will just skip over the formatting process to avoid error.
            if (card.equals("")) return card;
            
            // System.out.println("card value in formatCard = "+card);
            String whole[] = card.split(" ");
            if(whole.length <= 1 ) return card;
            String suite = whole[0];
            String value = whole[1];

            suite = suite.substring(0, 1).toUpperCase() + suite.substring(1).toLowerCase();
            value = value.substring(0, 1).toUpperCase() + value.substring(1).toLowerCase();
             card = suite + " " + value;
            
            // System.out.println("card value after formatting = "+card);
            return card;
      }

      public static boolean realCard(String card) {
            boolean isRealCard = false;
            //Check if card value is null. If so return false. 
            if (card.equals("")) return isRealCard;
            if (card.equals("Small Joker")|| card.equals("Big Joker")) {
                  return isRealCard = true;
            }
            else{
                  String whole[] = card.split(" ");
                  if(whole.length <= 1 ) return isRealCard;
                  String suite = whole[0];
                  String value = whole[1];

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
            card1 = addCard("1");

            System.out.print("Card 2 = ");
            card2 = addCard("2");

            System.out.print("Card 3 = ");
            card3 = addCard("3");

            System.out.print("Card 4 = ");
            card4 = addCard("4");

            System.out.print("Card 5 = ");
            card5 = addCard("5");

            System.out.print("Card 6 = ");
            card6 = addCard("6");

            System.out.print("Card 7 = ");
            card7 = addCard("7");

            System.out.println("\nBased off these cards: ");
            System.out.println(card1 + ", " + card2 + ", " + card3 + ", " + card4 + ", " + card5 + ", " + card6 + ", "
                        + card7 + "\n");

            String[] picked = checkInput(card1, card2, card3, card4, card5, card6, card7);

            magician.magic(picked[0], picked[1], picked[2], picked[3], picked[4], picked[5], picked[6]);
            // magician.magic(card1, card2, card3, card4, card5, card6, card7);

            /*
             * magician[0] = card1; magician[1] = card2; magician[2] = card3; magician[3] =
             * card4; magician[4] = card5; magician[5] = card6; magician[6] = card7;
             * 
             * return magician;
             */
            drawnCard.close();
      }

      public static void /* String[] */ chooseCardsAssistant() {
            /* String[] assistant = new String[9]; */

            // This method will be what asks the user for input
            String card1, card2, card3, card4, card5, card6, card7, hiddenCard1, hiddenCard2;
            Scanner drawnCard = new Scanner(System.in);

            System.out.printf("\033c"); // clear screen
            System.out.println("Please Draw/Choose 7 Cards\n");
            System.out.print("Card 1 = ");
            card1 = addCard("1");

            System.out.print("Card 2 = ");
            card2 = addCard("2");

            System.out.print("Card 3 = ");
            card3 = addCard("3");

            System.out.print("Card 4 = ");
            card4 = addCard("4");

            System.out.print("Card 5 = ");
            card5 = addCard("5");

            System.out.print("Card 6 = ");
            card6 = addCard("6");

            System.out.print("Card 7 = ");
            card7 = addCard("7");

            System.out.println(
                        "\nNow Choose 2 cards to be the Hidden Cards.\nThese will be what the magician needs to guess\n");
            System.out.print("Hidden Card 1 = ");
            hiddenCard1 = addCard("Hidden Card 1");

            System.out.print("Hidden Card 2 = ");
            hiddenCard2 = addCard("Hidden Card 2");

            String[] picked = checkInput(card1, card2, card3, card4, card5, card6, card7, hiddenCard1, hiddenCard2);
            // System.out.println("Passing in picked");
            assistant.assist(picked[0], picked[1], picked[2], picked[3], picked[4], picked[5], picked[6], picked[7], picked[8]);
            // assistant.assist(card1, card2, card3, card4, card5, card6, card7, hiddenCard1, hiddenCard2);

            /*
             * assistant[0] = card1; assistant[1] = card2; assistant[2] = card3;
             * assistant[3] = card4; assistant[4] = card5; assistant[5] = card6;
             * assistant[6] = card7; assistant[7] = hiddenCard1; assistant[8] = hiddenCard2;
             * 
             * 
             * return assistant;
             */
            drawnCard.close();
      }
}