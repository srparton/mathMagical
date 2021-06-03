import java.util.Arrays;
import java.io.*;

public class deck {
    
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
    }
}
