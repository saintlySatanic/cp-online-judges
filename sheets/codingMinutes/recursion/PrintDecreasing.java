import java.util.Scanner;

public class PrintDecreasing{
    static void printDecreasing(int x, int curr) {
        if (curr == 0) return;
        System.out.println(curr);
        printDecreasing(x, curr-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        printDecreasing(x, x);
    }
}