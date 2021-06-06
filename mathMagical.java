import java.util.Scanner;                       

public class mathMagical {

    public static Scanner si = new Scanner( System.in ); //tie Scanner to keyboard

    public static void main( String [] args ) {

        char choice = ' ';

        do {
            System.out.printf("\033c"); //clear screen
            System.out.printf("\n");
            print_menu();
            choice = get_user_command();

            switch (choice) {
                case 'a' : volunteer.chooseCardsAssistant();
                           break;
                case 'm' : volunteer.chooseCardsMagician();
                           break;
                case 'Q' :
                case 'q' : 
                           break;
                default  : System.out.printf("\t\tInvalid choice . . . try again\n");
                           pressEnterToContinue();
            }
        } while ( (choice != 'Q') && (choice != 'q') && (choice != 'a') && (choice != 'm') /* && (selection >= 0)*/);
    }

    public static void print_menu( ) {
        System.out.printf("\n");
        System.out.printf("\n\nWhat role are you for this show?\n");
        System.out.printf("\t\t a  for Assistant\n");
        System.out.printf("\t\t m  for Magican\n");
        System.out.printf("\t\t Q  to Leave the Magic Show\n");
    }

    public static void pressEnterToContinue() {
        System.out.printf("\t\tPress Enter to continue . . .");
        try {
            System.in.read();
        } catch(Exception e) { }
    }

    public static char get_user_command( ) {
        char command = ' ';

        System.out.printf("\tEnter choice: ");
        try {
            if ( si.hasNext() ) 
                command = si.next( ).charAt(0);
            else
                command = (char) System.in.read();
        }
        catch ( Exception e ) {}
        return command;
    }

    public static double get_double_number( ) {
        double result;

        System.out.printf("\tPlease enter a double number: ");
        result = si.nextDouble();
        return result;
    }


    public static int get_integer_number( ) {
        int result;
        System.out.printf("\tPlease enter an integer number: ");
        result = si.nextInt();
        return result;
    }

    public static char toupper( char aChar ) {
        if ( aChar >= 'a' && aChar <= 'z' ) {
            int temp = (int)aChar ^ 0x20;
            aChar = (char)temp;
        }
        return aChar;
    }

}    
