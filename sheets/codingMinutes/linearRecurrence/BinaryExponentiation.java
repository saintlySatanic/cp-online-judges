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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.err.printf("%s exponent with %s is %s \n", a, b, exponentiate(a, b));
    }
}