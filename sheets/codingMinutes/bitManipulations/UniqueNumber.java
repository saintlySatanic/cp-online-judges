import java.util.Scanner;

public class UniqueNumber {
    static int findUniques(int[] arr) {
        int unique = 0;
        for(int i=0;i<arr.length;i++) {
            unique = unique^arr[i];
        }

        return unique;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] inputs = new int[n];
        for(int i=0;i<n;i++) inputs[i] = sc.nextInt();

        System.err.printf("Unique number is : %s", findUniques(inputs));
    }
}