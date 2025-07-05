import java.util.Scanner;

public class ReverseArray {
    static int[] reverse(int[] nums, int start, int end) {
        if (start >= end) return nums;
        int temp = nums[start]; nums[start] = nums[end]; nums[end] = temp;
        return reverse(nums, start+1, end-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];
        for(int i=0; i<n; i++) nums[i] = sc.nextInt();

        int[] res = reverse(nums, 0, n-1);
        for(int i=0; i<n; i++) System.out.println(res[i]);

    }    
}