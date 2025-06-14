import java.util.Scanner;

public class BinaryMultiplication {
    static int multiply(int a, int b) {
        int res = 0;
        while(b > 0) {
            if ((b&1) != 0) res+=a; // this multiplication is happening only log(b) times
            a = a+a;
            b>>=1;
        }

        return res;
    }

    static int moduloMultiply(int a, int b, int mod) {
        int res = 0;
        
        // looping will be done for 0(log(b)) times
        while(b > 0) {
            if ((b&1) != 0) res+=a;
            res%=mod;
            a = a+a; a%=mod;
            b>>=1;
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.err.printf("%s multiplied with %s is %s \n", a, b, multiply(a, b));
    }
}