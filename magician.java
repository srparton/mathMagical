public class magician {

    public static void magic(String c1, String c2, String c3, String c4, String c5, String c6, String c7) {
    // public static void magician(String c1, String c2, String c3, String c4, String c5, String c6, String c7) {
    
        // System.out.println("First Card = "+c1);
        // System.out.println("Last Card = "+c7);
        String[] newDeck = cardFunctions.deck();
        int cardOne = cardFunctions.cardValue(c1/* , newDeck */); 
        int cardTwo = cardFunctions.cardValue(c2/* , newDeck */); 
        int cardThree = cardFunctions.cardValue(c3/* , newDeck */); 
        int cardFour = cardFunctions.cardValue(c4/* , newDeck */); 
        int cardFive = cardFunctions.cardValue(c5/* , newDeck */); 
        int cardSix = cardFunctions.cardValue(c6/* , newDeck */); 
        int cardSeven = cardFunctions.cardValue(c7/* , newDeck */); 
        int order;
        int[] base = new int[7];
        int[] realCase = new int[7];
        int[] temp = new int[7];
        int min = 99;
        int minIndex = -1;
        String[] answer;
    
        // System.out.println("cardOne = "+cardOne);
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
        order = cardFunctions.findOrder(temp);
        //System.out.println("answer = "+ order);
        answer = cardFunctions.hiddenCards(order);
        // System.out.println("Based off your cards: "+c1+", "+c2+", "+c3+", "+c4+", "+c5+", "+c6+", "+c7);
        // System.out.println();
        System.out.println("Based off your cards, your hidden cards should be: ");
        System.out.print(answer[0]);
        System.out.println(" "+answer[1]);
    
    }
    
}
