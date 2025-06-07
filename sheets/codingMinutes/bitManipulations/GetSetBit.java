import java.util.Scanner;

public class GetSetBit {
    static int getItBit(int n, int i) {
        return (n&(1<<i)) !=0 ? 1:0;
    }

    static int setIthBit(int n, int i) {
        return n | (1<<i);
    }

    static int clearIthBit(int n, int i) {
        /*
        You need to create a mask where all bits are set except bit at i
        */
       int mask = ~(1<<i);
        return n & mask;
    }

    static int setFirstIBits(int i) {
        // first i bits set == 2^i -1 (RHS)
        return (1<<i)-1;
    }

    static int updateIthBit(int n, int i, int value){
        /*
        Update n at position i based on the input value(0,1)
        */
       int nWithClearedIthBit = clearIthBit(n, i);
       int mask = (value<<i);
       // if value is 0 should not matter, if 1 then 1 will be present in the exact position where we want it to be

       return nWithClearedIthBit | mask;
    }

    static int clearLastIBits(int n, int i){
        return (n>>i)<<i; // Solution 1

        // int mask = -1<<i;
        // return n & mask;
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = sc.nextInt();
        int j = sc.nextInt();
        System.out.printf("Bits cleared between range %s and %s for %s is %s\n", i, j, n, clearBitsInRange(n, i, j));
    }
}