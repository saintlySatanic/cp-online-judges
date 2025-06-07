import java.util.Scanner;

public class PowerOf2 {
    static boolean isPowerOf2(int n) {
        /*
        Power of 2 has only a single bit set
        */
        boolean setBitVisited = false;

        while(n>0) {
            if ((n & 1) != 0){
                if (setBitVisited) return false;
                setBitVisited = true;
            }
            n = n>>1;
        }

        return true;
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
        System.out.printf("Is %s power of 2 %s \n", n, isPowerOf2(n));
        System.out.printf("Optimzed : Is %s power of 2 %s \n", n, isPowerOf2Optimized(n));
    }
}