import java.util.Scanner;

public class Factorial {
    static int factorial(int x) {
        if (x==0) return 1;
        return x * factorial(x-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.printf("Factorial of %s is %s \n", x, factorial(x));
    }
}