import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("PLease give a number to start with:");
        int start = in.nextInt();

        System.out.println("Please give an ending number:");
        int end = in.nextInt();

        System.out.println("Please give me the step number:");
        int step = in.nextInt();

        int[] bounds = generateArrayWithBounds(start, end, step);

        if (bounds.length > 0) {
            System.out.print("Sequence is ");
            for (int num : bounds) {
                System.out.print(num + " ");
            }
            System.out.println();
        } else {
            System.out.println("Enter any positive number other than zero.");
        }
    }

    public static int[] generateArrayWithBounds(int start, int end, int step) {
        int size = (end - start + step - 1) / step;

        if (size <= 0) {
            return new int[0];
        }
        int[] array = new int[size];
        int index = 0;

        for (int i = start; i < end; i += step) {
            array[index++] = i;
        }
        return array;
    }
}