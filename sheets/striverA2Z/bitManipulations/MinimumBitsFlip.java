
import java.util.Scanner;

public class MinimumBitsFlip {
    public static int minBitFlips(int start, int goal) {
        int count=0;
        while(start!=0 | goal!=0) {
            if ((start&1) != (goal&1)) count++;
            start>>=1; goal>>=1;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int goal = sc.nextInt();

        int res = minBitFlips(start, goal);
        System.out.println("RES : " + res);
    }
}