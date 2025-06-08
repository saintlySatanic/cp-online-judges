import java.util.Scanner;

public class UniqueNumber2 {
    static int getPositionOfFirstSetBit(int a) {
        int pos = 0;

        while(a>0){
            if ((a&1) == 1) break;
            a>>=1;
            pos++;
        }

        return pos;
    }

    static int[] findUniques(int[] arr) {
        int unique1 = 0, unique2 = 0;

        int xorResult = 0;
        for(int i=0;i<arr.length;i++) {
            xorResult = xorResult^arr[i];
        }
        // XOR result given not 0 tells us at exactly at what bit position does the number differ
        int setBitPos = getPositionOfFirstSetBit(xorResult);

        // separating the arr into two arrays where bits are either set or unset
        int mask = 1<<setBitPos;
        for(int a: arr) {
            if ((a&mask) == 0) unique1^=a;
            else unique2^=a;
        }

        return new int[]{unique1, unique2};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] inputs = new int[n];
        for(int i=0;i<n;i++) inputs[i] = sc.nextInt();

        int[] uniques = findUniques(inputs);
        System.err.printf("Unique number are : %s and %s", uniques[0], uniques[1]);
    }
}