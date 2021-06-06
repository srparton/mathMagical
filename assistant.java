public class assistant {
    public static /* String[] */void assist(String c1, String c2, String c3, String c4, String c5, String c6, String c7, String hiddenOne, String hiddenTwo){
/* Print out the c* values and figure out what is being passed in. Card value keeps being 99 :( */
        // String[] /* newDeck */ = cardFunctions.deck();
        // System.out.println("c1 = "+c1);
        int cardOne = cardFunctions.cardValue(c1 /* newDeck */); 
        int cardTwo = cardFunctions.cardValue(c2 /* newDeck */); 
        int cardThree = cardFunctions.cardValue(c3 /* newDeck */); 
        int cardFour = cardFunctions.cardValue(c4 /* newDeck */); 
        int cardFive = cardFunctions.cardValue(c5 /* newDeck */); 
        int cardSix = cardFunctions.cardValue(c6 /* newDeck */); 
        int cardSeven = cardFunctions.cardValue(c7 /* newDeck */); 
        int hidOne = cardFunctions.cardValue(hiddenOne /* newDeck */);
        int hidTwo = cardFunctions.cardValue(hiddenTwo /* newDeck */);
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

        order = cardFunctions.orderFromHidden(hidOne,hidTwo);
        correctOrder = cardFunctions.findCardOrder(order).clone();
        //System.out.println("order form findCardOrder:" +Arrays.toString(correctOrder));

        //Converting into string representation of cards
        for(int j=0; j<base.length; j++){
            for(int i = 0; i<correctOrder.length; i++){
                if(i+1 == correctOrder[j]) {
                    correctOrderStr[j] = cardFunctions.cardNumber(base[i]/* ,newDeck */);
                }
            }
        }
        System.out.println("To be a good assistant you should lay out the cards like so:\n"
                +correctOrderStr[0]+", "+correctOrderStr[1]+", "+correctOrderStr[2]+
                ", "+correctOrderStr[3]+", "+correctOrderStr[4]+", "+correctOrderStr[5]+
                ", "+correctOrderStr[6]+"");

        // return correctOrderStr;
    }
}
