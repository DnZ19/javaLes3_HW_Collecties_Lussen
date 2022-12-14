import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Integer[] numeric = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        String[] alphabetic = {"een", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "nul"};

        //object

        Translator banaan = new Translator(alphabetic, numeric);

        boolean play = true;
        String ongeldig = "ongeldige input";

        Scanner scanner = new Scanner(System.in);


        while (play) {
            System.out.println("Type 'x' om te stoppen. Type 'v' om te vertalen");
            String input = scanner.nextLine().toLowerCase();

            if (input.equals("x")) {
                play = false;
            } else if (input.equals("v")) {
                System.out.println("type a number between 0-9");
                int number = scanner.nextInt();
                scanner.nextLine();
                if (number < 10) {
                    String result = banaan.translate(number);
                    System.out.println("De vertaling van: " + number + " is " + result);
                } else {
                    System.out.println(ongeldig);
                }
            } else {
                System.out.println(ongeldig);
            }

        }

    }
}