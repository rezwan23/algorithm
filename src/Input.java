import java.util.Scanner;

public class Input {
    int num, i, j;
    Scanner input = new Scanner(System.in);

    public int[] sortInput() {
        System.out.println("Enter the number of integers:");
        num = input.nextInt();

        int arr[] = new int[num];

        System.out.println("Enter " + num + " integers: ");

        for (i = 0; i < num; i++) {
            arr[i] = input.nextInt();
        }

        return arr;
    }
}
