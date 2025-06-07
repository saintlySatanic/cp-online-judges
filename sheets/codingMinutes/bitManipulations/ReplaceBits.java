import java.util.Scanner;

public class ReplaceBits{
    static void validateInputs(int m, int i, int j) {
        if (i>= j) throw new IllegalArgumentException("Invalid indexes: constraints: i < j");
        
        int bitsOccupied = j-i + 1;
        int maxValue = (1<<bitsOccupied) - 1;
        if (m > maxValue) throw new IllegalArgumentException("Value of N could not in range i to j");
    }

    static int clearIthBit(int m, int i) {
        return (~(1<<i)) & m;
    }

    static int setIthBit(int m, int i) {
        return (1<<i) | m;
    }

    static int setFirstIBits(int i) {
        // first i bits set == 2^i -1 (RHS)
        return (1<<i)-1;
    }

    static int clearBitsInRange(int n, int i, int j) {
        if (i>=j) throw new IllegalArgumentException("Invliad indexs : constraint: i < j");
        /*
        index starts with 0
        Keep in mind we might now know how many bits are used to represent an Integer; this can vary based on language and architecture
        */
       int maskLHS = -1<<(j+1);
       int maskRHS = setFirstIBits(i);
       int mask = maskLHS | maskRHS;

       return n & mask;
    }

    static int replaceBitsBruteForce(int n, int m, int i, int j) {
        validateInputs(m, i, j);

        for(int idx=i; idx<=j; idx++) {
            if ((1 & m) == 0) {
                n = clearIthBit(n, idx);
            } else {
                n = setIthBit(n, idx);
            }
            m = m>>1;
            System.out.println("Value of N : " + n);
        }
        return n;
    }

    static int replaceBitsOptimized(int n, int m, int i, int j) {
       int nWithBitsCleared = clearBitsInRange(n, i, j);
       int mask = m<<i;
       return mask | nWithBitsCleared;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int i = sc.nextInt();
        int j = sc.nextInt();

        System.out.printf("Brute Forced Replaced bits of %s with %s between indexes %s and %s is %s \n", n, m, i, j, replaceBitsBruteForce(n,m,i,j));
        System.out.printf("Optimized Replaced bits of %s with %s between indexes %s and %s is %s \n", n, m, i, j, replaceBitsOptimized(n,m,i,j));
    }
}