import java.util.Scanner;

public class LogicKnowledge3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        int a = in.nextInt();

        System.out.println("Enter the value of b: ");
        int b = in.nextInt();

        System.out.println("Enter the value of c: ");
        int c = in.nextInt();

        System.out.println(greenTicket(a, b, c));
    }

    public static int greenTicket(int a, int b, int c) {
        if (a == b && b == c) {
            return 20;

        } else if (a == b || b == c || a == c) {
            return 10;

        } else {
            return 0;
        }
    }
}