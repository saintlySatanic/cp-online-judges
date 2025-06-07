import java.util.Scanner;

public class CountBits {
    static int countBitsIterative(int n) {
        int count = 0;

        while(n>0) {
            if ((n & 1) == 1) count += 1;
            n = n>>1;
        }

        return count;
    }

    static int removeLastSetBit(int n) {
        return n&(n-1);
    }


    static int countBitsOptimized(int n) {
        // Brinan Kerningham's algorithm
       int count = 0;
       while(n > 0) {
        n = removeLastSetBit(n);
        count++;
       }

       return count;
    }

    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.printf("# Bits in %s is %s\n", n, countBitsOptimized(n));
    }
}