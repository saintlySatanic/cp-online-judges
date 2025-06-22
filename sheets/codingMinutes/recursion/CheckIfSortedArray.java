import java.util.Scanner;

public class CheckIfSortedArray {
    static boolean checkIfSorted(int[] x, int n, int pos) {
        // base case: when we have already came till end; or elements are not sorted
        if (pos == n-1) return true;
        if (x[pos] > x[pos+1]) return false;

        return checkIfSorted(x, n, pos + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];

        for(int i=0; i<n; i++) x[i] = sc.nextInt(); 
        System.out.printf("Is array sorted %s \n", checkIfSorted(x, n, 0));
    }
}