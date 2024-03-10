import java.util.Scanner;

public class LogicKnowledge4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter small chocolate bars: ");
        int small = in.nextInt();

        System.out.println("Enter large chocolate bars: ");
        int large = in.nextInt();

        System.out.println("Enter goal weight of chocolate bars: ");
        int goal = in.nextInt();

        System.out.println("You need " + makesChocolate(small, large, goal) + " small bars!");
    }

    public static int makesChocolate(int small, int large, int goal) {
        int largeBars = Math.min(large, goal / 5);
        int remainder = goal - (largeBars * 5);

        if (small >= remainder) {
            return remainder;
        } else {
            return -1;
        }
    }
}