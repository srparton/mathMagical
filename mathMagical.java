import java.util.Arrays;
// import java.math.BigInteger;
import java.io.*;
// import java.util.Objects;
// import java.util.Scanner;
// import java.util.StringTokenizer;

public class mathMagical {

    //"creates" a deck of cards and stores cards in a string array. allows for 
    //finding cards by their int representation
    public static String[] deck() {
        String[] deck = new String[54];
        int i;
        int count;

        // Club
        count = 1;
        for (i = 0; i <= 12; i++) {
            if(count == 1) deck[i] = "Club A";
            if(count == 2) deck[i] = "Club 2";
            if(count == 3) deck[i] = "Club 3";
            if(count == 4) deck[i] = "Club 4";
            if(count == 5) deck[i] = "Club 5";
            if(count == 6) deck[i] = "Club 6";
            if(count == 7) deck[i] = "Club 7";
            if(count == 8) deck[i] = "Club 8";
            if(count == 9) deck[i] = "Club 9";
            if(count == 10) deck[i] = "Club 10";
            if(count == 11) deck[i] = "Club J";
            if(count == 12) deck[i] = "Club Q";
            if(count == 13) deck[i] = "Club K";
            count++;
        }
        //Diamond
        count = 1;
        for (int x = 13; x <= 26; x++) {
            if(count == 1) deck[i] = "Diamond A";
            if(count == 2) deck[x] = "Diamond 2";
            if(count == 3) deck[x] = "Diamond 3";
            if(count == 4) deck[x] = "Diamond 4";
            if(count == 5) deck[x] = "Diamond 5";
            if(count == 6) deck[x] = "Diamond 6";
            if(count == 7) deck[x] = "Diamond 7";
            if(count == 8) deck[x] = "Diamond 8";
            if(count == 9) deck[x] = "Diamond 9";
            if(count == 10) deck[x] = "Diamond 10";
            if(count == 11) deck[x] = "Diamond J";
            if(count == 12) deck[x] = "Diamond Q";
            if(count == 13) deck[x] = "Diamond K";
            count++;
            i = x;
        }
        count = 1;
        //Hearts
        for (int y = 26; y <= 39; y++) {
            if(count == 1) deck[i] = "Heart A";
            if(count == 2) deck[y] = "Heart 2";
            if(count == 3) deck[y] = "Heart 3";
            if(count == 4) deck[y] = "Heart 4";
            if(count == 5) deck[y] = "Heart 5";
            if(count == 6) deck[y] = "Heart 6";
            if(count == 7) deck[y] = "Heart 7";
            if(count == 8) deck[y] = "Heart 8";
            if(count == 9) deck[y] = "Heart 9";
            if(count == 10) deck[y] = "Heart 10";
            if(count == 11) deck[y] = "Heart J";
            if(count == 12) deck[y] = "Heart Q";
            if(count == 13) deck[y] = "Heart K";
            count++;
            i = y;
        }
        count = 1;
        //Spade
        for (int z = 39; z <= 52; z++) {
            if(count == 1) deck[i] = "Spade A";
            if(count == 2) deck[z] = "Spade 2";
            if(count == 3) deck[z] = "Spade 3";
            if(count == 4) deck[z] = "Spade 4";
            if(count == 5) deck[z] = "Spade 5";
            if(count == 6) deck[z] = "Spade 6";
            if(count == 7) deck[z] = "Spade 7";
            if(count == 8) deck[z] = "Spade 8";
            if(count == 9) deck[z] = "Spade 9";
            if(count == 10) deck[z] = "Spade 10";
            if(count == 11) deck[z] = "Spade J";
            if(count == 12) deck[z] = "Spade Q";
            if(count == 13) deck[z] = "Spade K";
            // deck[i] = "Spade " + ((char)count);
            count++;
            i=z;
        }

        // JOKERS
        deck[i] = "Small Joker";
        deck[++i] = "Big Joker";
        //System.out.println(Arrays.toString(deck));
        return deck;

        // System.out.println("Solution # " +count+ ": "+Arrays.toString(deck));
        // System.out.println(deck[cardNum-1]);

    }

    //This will return the int representation of the card.
    public static int cardValue(String card, String[] myDeck) {
        boolean myCard = false;
        int myCardValue = 99;
        int i = 0;
        //System.out.println("CardValue Running");
        while(!myCard && i<54){
            if(myDeck[i] == card){
                myCardValue = i+1; 
                myCard = true;
            } 
            i++;
        }
        return myCardValue; 
    }

    public static String cardNumber(int card, String[] myDeck){
        return myDeck[card-1];
    }

    //this is used in methods findOrder && findCardOrder to filter out any array 
    //solution that has repeat values. ie only arrays with one instance of num 1-7
    //will be allowed.
    public static boolean checkArray(int[] xx) {
        int testVal;
        boolean isDiscrete = true;

        for (testVal = 0; testVal < xx.length - 1; testVal++) {
            for (int i = 1; i < xx.length; i++) {
                if (xx[testVal] == xx[i] && testVal != i) {
                    return isDiscrete = false;
                }
            }
        }
        return isDiscrete;
    }


    //Checks to see if each element in array is equal
    public static boolean isEqual(int[] xx, int[] yy) {
        boolean isEqualTo = true;
        int i = 0;
        if(xx.length != yy.length) isEqualTo = false;

        while(isEqualTo && i < xx.length){
            if(xx[i] != yy[i]) isEqualTo = false;
            i++;
        }
        return isEqualTo;
    }

    // pass in a array of ints from 1-7 and it will return the order number of that array. 
    static int findOrder(int[] shift) {
        int count = 0;
        int[] storage = new int[7];
        // int[] answer = new int[7];
        int x1, x2, x3, x4, x5, x6, x7;

        // x1
        for (x1 = 1; x1 <= 7; x1++) {
            storage[0] = x1;

            // x2 level
            for (x2 = 1; x2 <= 7; x2++) {
                storage[1] = x2;

                // x3 level
                for (x3 = 1; x3 <= 7; x3++) {
                    storage[2] = x3;

                    // x4 level
                    for (x4 = 1; x4 <= 7; x4++) {
                        storage[3] = x4;

                        // x5 level
                        for (x5 = 1; x5 <= 7; x5++) {
                            storage[4] = x5;

                            // x6 level
                            for (x6 = 1; x6 <= 7; x6++) {
                                storage[5] = x6;

                                // x7 level
                                for (x7 = 1; x7 <= 7; x7++) {
                                    storage[6] = x7;
                                    if (checkArray(storage)) {
                                        count++;
                                        if(isEqual(storage, shift)) {
                                            //System.out.println("Solution # " + count + ": " 
                                            //        + Arrays.toString(storage));
                                            return count;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        // System.out.println("answer -> "+answer);
         //System.out.println("count -> "+count);
        // System.out.println("amtSolutions -> "+(7*6*5*4*3*2*1));
        // }
        return count;
    }


    //This method will find and return an array if ints (1-7) representing the card
    //  correct card order based off the order #. Order# will be passed in as argument
    static int[] findCardOrder(int order) {
        int count = 0;
        int[] storage = new int[7];
        int[] answer = new int[7];
        int x1, x2, x3, x4, x5, x6, x7;

        // x1
        for (x1 = 1; x1 <= 7; x1++) {
            storage[0] = x1;

            // x2 level
            for (x2 = 1; x2 <= 7; x2++) {
                storage[1] = x2;

                // x3 level
                for (x3 = 1; x3 <= 7; x3++) {
                    storage[2] = x3;

                    // x4 level
                    for (x4 = 1; x4 <= 7; x4++) {
                        storage[3] = x4;

                        // x5 level
                        for (x5 = 1; x5 <= 7; x5++) {
                            storage[4] = x5;

                            // x6 level
                            for (x6 = 1; x6 <= 7; x6++) {
                                storage[5] = x6;

                                // x7 level
                                for (x7 = 1; x7 <= 7; x7++) {
                                    storage[6] = x7;
                                    if (checkArray(storage)) {
                                        count++;
                                        if (count == order) {
                                            answer = storage.clone();
                                            //System.out.println("Solution # " + count + ": " 
                                            //        + Arrays.toString(answer));
                                        }
                                    }
                                }
                            } 
                        }
                    }
                }
            }
        }
        // System.out.println("answer -> "+answer);
         //System.out.println("count -> "+count);
        // System.out.println("amtSolutions -> "+(7*6*5*4*3*2*1));
        // }
        return answer;
    }

    //***ALTER THIS METHOD FOR boseE set up
    public static boolean checkArrayAdd(int[] xx, int value) {
        //xx is the array from boseE getting passed in
        boolean isDiscrete = false;
        int testVal = 0;

        for (int i = 0; i < xx.length; i++) {
            testVal += xx[i];
        }
        //add and alter x value parameter ie: x1>=1 so xx[0]>=1 || x2>=2 so xx[1] >= 2
        if(xx[0] >= 1 && xx[1] >= 2 && xx[2] >= 3 && testVal == value) isDiscrete = true;
        //if (testVal == value) isDiscrete = true;
        return isDiscrete;
    }

    //This method is for the Bose-einstine test
    static /*int[]*/void boseE(int order) {
        int count = 0;
        //CHANGE arraySize BELOW TO n value
        int arraySize = 3;
        int[] storage = new int[arraySize];
        int[] answer = new int[arraySize];
        int x1, x2, x3;//, x4, x5, x6, x7, x8;
        //comment out loops to number of terms (n)

        // x1
        for (x1 = 1; x1 <= order; x1++) {
            storage[0] = x1;

            // x2 level
            for (x2 = 1; x2 <= order; x2++) {
                storage[1] = x2;

                // x3 level
                for (x3 = 1; x3 <= order; x3++) {
                    storage[2] = x3;
/* ***MOVE ME***
                    // x4 level
                    for (x4 = 1; x4 <= order; x4++) {
                        storage[3] = x4;

                        // x5 level
                        for (x5 = 1; x5 <= order; x5++) {
                            storage[4] = x5;

                            // x6 level
                            for (x6 = 1; x6 <= order; x6++) {
                                storage[5] = x6;
                                
                                // x7 level
                                for (x6 = 1; x6 <= order; x6++) {
                                    storage[5] = x6;

                                    // x8 level
                                    for (x7 = 1; x7 <= order; x7++) {
                                        storage[6] = x7;
                                ***MOVE ME*** */
                                        //***DONT COMMENT OUT THIS IF STATMENT*** 
                                        if (checkArrayAdd(storage,order)) {
                                            count++;
                                            answer = storage.clone();
                                            System.out.println("Solution # " + count + ": " 
                                                    + Arrays.toString(answer));
                                        }// if end
                        /* ***MOVE ME***
                                    }//x8 end
                                } // x7 end
                            }// x6 end
                        }// x5 end
                    }// x4 end
             ***MOVE ME***       */
                }// x3 end
            }// x2 end
        }// x1 end

        System.out.println("count -> "+count);
    }

    public static /*String[]*/void assistant(String c1, String c2, String c3, String c4, String c5, String c6, String c7, String hiddenOne, String hiddenTwo){

        String[] newDeck = deck().clone();
        int cardOne = cardValue(c1, newDeck); 
        int cardTwo = cardValue(c2, newDeck); 
        int cardThree = cardValue(c3, newDeck); 
        int cardFour = cardValue(c4, newDeck); 
        int cardFive = cardValue(c5, newDeck); 
        int cardSix = cardValue(c6, newDeck); 
        int cardSeven = cardValue(c7, newDeck); 
        int hidOne = cardValue(hiddenOne, newDeck);
        int hidTwo = cardValue(hiddenTwo, newDeck);
        int order;
        int min = 99;
        int minIndex = -1;
        int[] base = new int[7];
        int[] correctOrder = new int[7];
        int[] temp = new int[7];
        // String[] baseStr = new String[7];
        String[] correctOrderStr = new String[7];

        temp[0] = cardOne;
        temp[1] = cardTwo;
        temp[2] = cardThree;
        temp[3] = cardFour;
        temp[4] = cardFive;
        temp[5] = cardSix;
        temp[6] = cardSeven;

        for(int j=0; j<temp.length; j++){
            for(int i = 0; i<temp.length; i++){
                if(temp[i] < min) {
                    min = temp[i]; 
                    minIndex = i;
                }
            }
            temp[minIndex] = 99;
            base[j] = min;
            min = 99;
        }

        //System.out.println("base:     " + Arrays.toString(base));
        //System.out.println("realCase: " + Arrays.toString(realCase));

        order = orderFromHidden(hidOne,hidTwo);
        correctOrder = findCardOrder(order).clone();
        //System.out.println("order form findCardOrder:" +Arrays.toString(correctOrder));

        //Converting into string representation of cards
        for(int j=0; j<base.length; j++){
            for(int i = 0; i<correctOrder.length; i++){
                if(i+1 == correctOrder[j]) {
                    correctOrderStr[j] = cardNumber(base[i],newDeck);
                }
            }
        }
        System.out.println("Correct Sequence: "+correctOrderStr[0]+", "+correctOrderStr[1]+", "+correctOrderStr[2]+
                ", "+correctOrderStr[3]+", "+correctOrderStr[4]+", "+correctOrderStr[5]+
                ", "+correctOrderStr[6]+"");
    }

    public static int orderFromHidden(int cardOne, int cardTwo) {
        int orderNum = ((cardOne-1)*54)+cardTwo;
        return orderNum;
    }

    public static String[] hiddenCards(int orderValue){
        String[] hiddenCards= new String[2];
        int cardTwo = (orderValue%54);
        int cardOne = ((orderValue-cardTwo)/54)+1;

        hiddenCards[0] = cardNumber(cardOne, deck());
        hiddenCards[1] = cardNumber(cardTwo, deck());

        return hiddenCards;
    }

    public static void magician(String c1, String c2, String c3, String c4, String c5, String c6, String c7) {

        String[] newDeck = deck().clone();
        int cardOne = cardValue(c1, newDeck); 
        int cardTwo = cardValue(c2, newDeck); 
        int cardThree = cardValue(c3, newDeck); 
        int cardFour = cardValue(c4, newDeck); 
        int cardFive = cardValue(c5, newDeck); 
        int cardSix = cardValue(c6, newDeck); 
        int cardSeven = cardValue(c7, newDeck); 
        int order;
        int[] base = new int[7];
        int[] realCase = new int[7];
        int[] temp = new int[7];
        int min = 99;
        int minIndex = -1;
        String[] answer;

        realCase[0] = temp[0] = cardOne;
        realCase[1] = temp[1] = cardTwo;
        realCase[2] = temp[2] = cardThree;
        realCase[3] = temp[3] = cardFour;
        realCase[4] = temp[4] = cardFive;
        realCase[5] = temp[5] = cardSix;
        realCase[6] = temp[6] = cardSeven;
        //System.out.println("temp:     " + Arrays.toString(temp));

        for(int j=0; j<temp.length; j++){
            for(int i = 0; i<temp.length; i++){
                if(temp[i] < min) {
                    min = temp[i]; 
                    minIndex = i;
                }
            }
            temp[minIndex] = 99;
            base[j] = min;
            min = 99;
        }

        //System.out.println("base:     " + Arrays.toString(base));
        //System.out.println("realCase: " + Arrays.toString(realCase));

        //for loop to convert the realCase array into 1,2,3...7 so it can be passed
        //      into my findOrder method. 
        int tempVal = 0;
        for(int i=0; i<base.length; i++){
            tempVal = base[i];
            for(int j = 0; j<temp.length; j++){
                if(tempVal == realCase[j] ) {
                    temp[j] = i+1;
                }
            }
        }
        //System.out.println("temp:     " + Arrays.toString(temp));

        //now pass temp array into findOrder method
        order = findOrder(temp);
        //System.out.println("answer = "+ order);
        answer = hiddenCards(order);
        System.out.println("Based off your cards: "+c1+", "+c2+", "+c3+", "+c4+", "+c5+", "+c6+", "+c7);
        System.out.println();
        System.out.println("Your hidden cards should be: ");
        System.out.print(answer[0]);
        System.out.println(" "+answer[1]);

    }

    public static void main(String[] args) throws IOException {

        //assistant("Diamond 8","Diamond 7","Heart 7","Heart 6","Diamond 6","Heart A","Heart 8","Heart 2","Club K");
        //magician("Diamond 8","Diamond 6","Heart A","Heart 6","Diamond 7","Heart 7","Heart 8");
        
        //System.out.println(cardValue("Club K",deck()));
        //System.out.println(cardValue("Diamond A",deck()));
    
        //System.out.println(findOrder(test));

        //findCardOrder(772);
        //System.out.println(cardValue("Spade 3",deck()));
        //magician("Diamond 2","Heart 4","Spade K","Small Joker","Heart J","Diamond 10","Club 7");
        //magician("Diamond 8","Diamond 6","Heart A","Heart 6","Diamond 7","Heart 7","Heart 8");
        //findCardOrder(772);
        
        //examples
        //int test[] = {3,4,1,5,2,6,7};
        //boseE(12);
        //
        //System.out.println("card value = " +cardValue("Spade A", deck()));
        //
        //System.out.println("Card = "+cardNumber(13,deck()));
        //
        //System.out.println("Order # " +findOrder(test));
        //
        //findCardOrder(1686);
        //findCardOrder(1687);
        //
        //***HIDDEN AT END FOR ASSISTANT***
        //assistant("Spade 5","Diamond 4","Club 7","Heart J","Spade 10","Diamond 3","Spade 3","Club A","Diamond 6");
        //
        magician("Club 7","Diamond 3","Diamond 4","Spade 10","Heart J","Spade 3","Spade 5");
        //
        //System.out.println("Order from hidden: " + orderFromHidden(13,47));
        //
        //System.out.println("Hidden cards: "+Arrays.toString(hiddenCards(1687)));
    }
}
