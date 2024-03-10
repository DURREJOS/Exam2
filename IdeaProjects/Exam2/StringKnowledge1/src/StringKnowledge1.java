import java.util.Scanner;

public class StringKnowledge1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first string!!");
        String a = in.nextLine();

        System.out.println("Enter the second string!!");
        String b = in.nextLine();

        System.out.println(endOther(a, b));
    }

    public static boolean endOther(String a, String b) {
        String lowerA = a.toLowerCase();
        String lowerB = b.toLowerCase();

        return lowerA.endsWith(lowerB) || lowerB.endsWith(lowerA);
    }
}