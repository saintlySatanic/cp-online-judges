import java.util.Scanner;

public class PrintIncreasing {
    static void printIncreasing(int x, int curr) {
        if (curr > x) return;
        System.out.println(curr);
        printIncreasing(x, curr+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        printIncreasing(x, 0);
    }
}