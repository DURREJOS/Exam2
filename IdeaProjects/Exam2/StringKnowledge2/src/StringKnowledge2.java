import java.util.Scanner;

public class StringKnowledge2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter string to test: ");
        String input = in.nextLine();

        System.out.println(findRepeats(input));
    }

    public static boolean findRepeats(String toTest) {
        for (int i = 0; i < toTest.length() - 1; i++) {
            for (int j = i + 2; j <= toTest.length(); j++) {
                String sub1 = toTest.substring(i, j);

                if (toTest.indexOf(sub1, i + 1) != -1) {
                    return true;
                }
            }
        }
        return false;
    }
}