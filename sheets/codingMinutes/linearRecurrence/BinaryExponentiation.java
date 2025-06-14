import java.util.Scanner;

public class BinaryExponentiation {
    static int exponentiate(int a, int b) {
        int res = 1;
        while(b > 0) {
            if ((b&1) != 0) res*=a; // this multiplication is happening only log(b) times
            a = a*a;
            b>>=1;
        }

        return res;
    }

    static int moduloExponentiate(int a, int b, int mod) {
        int res = 1;
        
        // looping will be done for 0(log(b)) times
        while(b > 0) {
            if ((b&1) != 0) res*=a;
            res%=mod;
            a = a*a; a%=mod;
            b>>=1;
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.err.printf("%s exponent with %s is %s \n", a, b, exponentiate(a, b));
    }
}