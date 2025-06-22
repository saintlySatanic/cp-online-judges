import java.util.Scanner;

public class PowerOf {
    // updating the recurrence: a^n = {
    // (a^(n/2))^2 if n is even
    // (a*a^(n/2))^2 if n is odd
    //}
    static int powerOf(int x, int pow) {
        if (pow == 0) return 1;
        if (pow == 1) return x;

        int subSol = powerOf(x, pow/2) * powerOf(x, pow/2);
        if (pow%2!=0) subSol = x * subSol;

        return subSol;
    }

    static int powerOfDP(int x, int pow, int[] powerValues) {
        if (powerValues[pow] != 0) return powerValues[pow];

        int subSol = powerOfDP(x, pow/2, powerValues) * powerOfDP(x, pow/2, powerValues);
        if (pow%2!=0) subSol = x * subSol;
        powerValues[pow] = subSol;

        return subSol;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        int[] powerValues = new int[n+1];
        powerValues[0] = 1;
        powerValues[1] = x;
        
        System.out.printf("Power of %s to %s is %s \n",x, n, powerOfDP(x, n, powerValues));
    }
}