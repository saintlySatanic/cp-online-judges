import java.util.Scanner;

public class HammingDistance {
    static int countHammingDistance(int n, int m) {
        int hDistance = 0;

        while(m>0 &&n>0) {
            if ((m & 1) != (n & 1)) hDistance++;
            m>>=1; n>>=1;
        }

        return hDistance;
    }

    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.printf("Hamming distance between %s and %s is %s\n", n, m, countHammingDistance(n, m));
    }
}