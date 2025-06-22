import java.util.Scanner;

public class Fibonacci {
    static int fibonacci(int x) {
        if (x<0) throw new IllegalArgumentException("Negative value for Fibonacci");
        if (x==0) return 0;
        if (x==1) return 1;
        return fibonacci(x-1) + fibonacci(x-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.printf("%s th Fibonacci is %s \n", x, fibonacci(x));
    }
}