// import java.math.BigInteger;
import java.io.*;
// import java.util.Objects;
// import java.util.Scanner;
// import java.util.StringTokenizer;

public class mathMagical{ 
    public static void main(String[] args) throws IOException {

        //assist("Diamond 8","Diamond 7","Heart 7","Heart 6","Diamond 6","Heart A","Heart 8","Heart 2","Club K");
        //magic("Diamond 8","Diamond 6","Heart A","Heart 6","Diamond 7","Heart 7","Heart 8");
        
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
        // magician.magic("Club 7","Diamond 3","Diamond 4","Spade 10","Heart J","Spade 3","Spade 5");
        magician.magic(args[0],args[1],args[2],args[3],args[4],args[5],args[6]);
        //
        //System.out.println("Order from hidden: " + orderFromHidden(13,47));
        //
        //System.out.println("Hidden cards: "+Arrays.toString(hiddenCards(1687)));
    }
}
