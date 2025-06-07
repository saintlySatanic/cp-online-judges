import java.util.Scanner;

public class PowerOf4 {
    static boolean isPowerOf4(int n) {
        /*
        Power of 4 has to be a power of 2
        To distinguish bit position at Odd places only we need a mask
        */
        if (isPowerOf2Optimized(n)) {
            int mask = 0x55555555; // Hexadecimal for 01010101010101010101010101010101
            if ((mask&n) ==n) return true;
        }

        return false;
    }

    static boolean isPowerOf2Optimized(int n) {
        /*
        If N is a power of 2 then N-1 bits will all be set
        */
       return (n&(n-1)) == 0;
    }

    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.printf("Is %s power of 4 %s \n", n, isPowerOf4(n));
    }
}