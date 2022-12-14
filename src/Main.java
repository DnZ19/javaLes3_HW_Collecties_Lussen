import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Integer[] numeric = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        String[] alphabetic = {"een", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "nul"};

        //object: gets the output of Translator class in a variable (can name this to everything, like banaan)
        //takes the input of alp and num

        Translator banaan = new Translator(alphabetic, numeric);

        //for the while loop and scanner
        boolean play = true;
        String notValid = "not a valid entry";
        Scanner scanner = new Scanner(System.in);


        while (play) {
            System.out.println("Type 'x' to quit.\nType 'v' for a translation. \nAnswer: ");
            String input = scanner.nextLine().toLowerCase();

            if (input.equals("x")) {
                play = false;
            } else if (input.equals("v")) {
                System.out.print("type a number between 0 and 9: ");
                int number = scanner.nextInt();
                scanner.nextLine();

                if (number < 10) {
                    String result = banaan.translate(number);
                    System.out.println("The translation of : " + number + " is " + result);
                } else {
                    System.out.println(notValid);
                }
            } else {
                System.out.println(notValid);
            }

        }

    }
}