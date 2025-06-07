import java.util.Scanner;

public class Fundamentals {

    static boolean isIthBitSet(int n, int pos) {
        if (pos < 0) throw new IllegalArgumentException("Invalid position value");

        return (n & (1<<pos)) != 0;
    }
    
    static boolean isOdd(int n) {
        return (n & 1) != 0;
    }

    static int multiplyBy2Power(int n, int pow) {
        // keep in mind the overflow condition, which will be based on the memory architecture / dtype which you choose (32 bit, 64 bit, etc)
        return n<<pow;
    }

    static int divideBy2Power(int n, int pow) {
        // We are storing in integer so floor value of x.y will be x so the answer shall be x
        return n>>pow;
    }

    static int notOperator(int n) {
        /*
        Keep in mind the 2's compliment form for storing negative numbers in memory

        -> Flip all bits and store
        -> When reading as integer check the MSB (if set then considered as a negative number)
        -> IF -ve then use 2's compliment method to calculate the magnitude of the binary
        -> return to caller
        */
        return ~n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos = sc.nextInt();

        System.out.printf("Is %s pos bit set: %s \n", pos, isIthBitSet(n, pos));
        System.out.printf("Is Odd: %s \n", isOdd(n));
        System.out.printf("%s times 2 power %s is %s \n", n, pos, multiplyBy2Power(n, pos));
        System.out.printf("Not of %s is %s \n", 0, notOperator(0));
        System.out.printf("%s divided by 2 power %s is %s \n", n, pos, divideBy2Power(n, pos));
    }
}