import java.util.Scanner;

public class ConvertBinary {
    static int decimalToBinary(int n) {
        int binary = 0, positionValue = 1;

        while(n>0) {
            // LSB is set
            if ((n & 1) == 1){
                binary = binary + positionValue;
            }
            n>>=1;
            positionValue*=10;
        }

        return binary;
    }

    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.printf("Binary of %s is %s\n", n, decimalToBinary(n));
    }
}