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

    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.printf("Is %s power of 2 %s \n", n, isPowerOf2(n));
    }
}