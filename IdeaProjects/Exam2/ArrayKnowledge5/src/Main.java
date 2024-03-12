import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter a string: ");
        String input = in.nextLine();

        char[] array = stringToArray(input);

        System.out.println("Your array is: ");
        System.out.print("[");
        for (int i = 0; i < input.length(); i++) {
            if (i != array.length - 1) {
                System.out.print("'" + array[i] + "',");
            } else {
                System.out.print("'" + array[i] + "'");
            }
        }
        System.out.println("]");
    }

    public static char[] stringToArray(String input) {
        char[] array = new char[input.length()];

        for (int i = 0; i < input.length(); i++) {
            array[i] = input.charAt(i);
        }

        return array;

    }
}