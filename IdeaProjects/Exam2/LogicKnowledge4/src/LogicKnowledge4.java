import java.util.Scanner;

public class LogicKnowledge4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number of small chocolate bars: ");
        int small = in.nextInt();

        System.out.println("Enter number of large chocolate bars: ");
        int large = in.nextInt();

        System.out.println("Enter goal weight of chocolate bars: ");
        int goal = in.nextInt();

        System.out.println("You need " + makesChocolate(small, large, goal) + " small bars!");
    }

    public static int makesChocolate(int small, int large, int goal) {
        int pounds = small + (large * 5);

        if (pounds >= goal) {

            int largeNeeds = Math.min(large, goal / 5);
            int remainder = goal - (largeNeeds * 5);
            int smallNeeds = Math.min(remainder, small);
            return smallNeeds;

        } else {
            return -1;
        }
    }
}