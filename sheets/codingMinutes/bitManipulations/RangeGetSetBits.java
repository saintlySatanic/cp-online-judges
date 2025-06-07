import java.util.Scanner;

public class RangeGetSetBits{
    static int clearRangeOfBits(int n, int i, int j) {
        /*
        mask should be such that the range of bits from i till j should have 0's and rest all as 1's
        
        Conditions:
        i<j
        */
       if (i>=j) throw new IllegalArgumentException("Invalid positions specified");
       int mask = (-1<<)&(-1>>)
    }

    static int setRangeOfBits(int n, int i, int j) {
        /*
        mask should be such that the range of bits from i till j should have 1's and rest all as 0's
        
        Conditions:
        i<j
        */
       if (i>=j) throw new IllegalArgumentException("Invalid positions specified");
       int mask = (-1<<)&(-1>>)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        int j = sc.nextInt();
    }
}