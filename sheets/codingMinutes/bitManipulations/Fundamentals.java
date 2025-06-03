import java.util.Scanner;

public class Fundamentals {

    static boolean isIthBitSet(int n, int pos) {
        if (pos < 0) throw new IllegalArgumentException("Invalid position value");

        return (n & (1<<pos)) != 0 ? true: false;
    }
    
    static boolean isOdd(int n) {
        return (n & 1) == 0 ? false: true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos = sc.nextInt();

        System.out.printf("Is %s pos bit set: %s \n", pos, isIthBitSet(n, pos));
        System.out.printf("Is Odd: %s ", isOdd(n));
    }
}