import java.util.Scanner;

public class ScannerEx {
    public void menu() {
        Scanner scanner = new Scanner (System.in);

        while (true) {
            System.out.println ("\nMenu options\n");
            System.out.println ("(1) - Do this");
            System.out.println ("(2) - Quit");

            System.out.print ("Please, enter your selection:\t");
            int selection = scanner.nextInt ( );

            if (selection == 1) {
                System.out.print ("Enter an index:\t");
                int index = scanner.nextInt ( );
                System.out.println ( );

                System.out.print ("Enter a sentence:\t");
                int sentence = scanner.nextInt ( );
                System.out.println ( );

                System.out.println ("\nYour sentence:\t" + sentence);
                System.out.println ("\nYour index:\t" + index);
            } else if (selection == 2) {
                break;
            }
        }
        scanner.close ( );
    }
}

class Run {
    public static void main(String[] args) {
        ScannerEx scannerEx = new ScannerEx ( );
        scannerEx.menu ( );
    }
}
