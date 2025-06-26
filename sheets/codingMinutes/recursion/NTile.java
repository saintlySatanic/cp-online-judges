import java.util.Scanner;

public class NTile {
    static int calculateAllPossibleTileMovements(int cols) {
        // tile placed vertically
        int placements = cols;

        // tile placed horizontally
        if (cols>=4) placements += (4*(cols-3));

        return placements;
    }

    static int calculatePossibleWaysToFillBoard(int cols) {
        if (cols<=3) return 1;
        return calculatePossibleWaysToFillBoard(cols-1) + calculatePossibleWaysToFillBoard(cols-4);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // System.out.printf("The number of placements for 4*%s board with 4*1 tile is %s \n", n, calculateAllPossibleTileMovements(n));
        System.out.printf("The number of ways to fill board of 4*%s board with 4*1 tile is %s \n", n, calculatePossibleWaysToFillBoard(n));
    }
}