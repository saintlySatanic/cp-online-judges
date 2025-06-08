import java.util.Scanner;

public class UniqueNumber3N {
    static boolean isBitSet(int[] arr, int pos) {
        int count=0;
        
        int mask = 1<<pos;
        for(int a: arr) {
            if ((a&mask) != 0) count++;
        }

        return count%3 != 0;
    }

    static int findUnique(int[] arr) {
        int unique = 0;
        for(int i=0; i<Integer.BYTES * 8; i++) {
            int mask = 1<<i;
            if (isBitSet(arr, i)) unique|=mask;
        }

        return unique;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] inputs = new int[n];
        for(int i=0;i<n;i++) inputs[i] = sc.nextInt();

        System.err.printf("Unique number is : %s", findUnique(inputs));
    }
}