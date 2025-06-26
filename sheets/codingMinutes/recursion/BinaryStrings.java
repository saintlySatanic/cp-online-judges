import java.util.Scanner;

public class BinaryStrings {
    static int calculateBinaryStringWithNonConsecutiveOnes(int len) {
        if (len==1) return 2;
        if (len ==2) return 3;

        return calculateBinaryStringWithNonConsecutiveOnes(len-1) + calculateBinaryStringWithNonConsecutiveOnes(len-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.printf("The number of ways to %s len string with non consecutive 1s is %s \n", n, calculateBinaryStringWithNonConsecutiveOnes(n));
    }
}