import java.util.Scanner;

public class FriendsPairing {
    static int calculatePairsOrSingleFriends(int n) {
        if (n<=1) return 1;
        if (n==2) return 2;
        return calculatePairsOrSingleFriends(n-1) + (n-1)*calculatePairsOrSingleFriends(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.printf("The number of ways to pair %s friends is %s \n", n, calculatePairsOrSingleFriends(n));
    }
}