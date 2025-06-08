
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Subsets {
    public static List<Integer> overlayBitAtPos(int[] nums, int n) {
        int pos = 0;
        int len = nums.length;
        List<Integer> res = new ArrayList<Integer>();

        while(n>0) {
            if((n&1) != 0) {
                res.add(nums[pos]);
            }
            pos++;
            n>>=1;
        }
        
        return res;
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        int len = nums.length;
        for(int i=0; i<1<<len; i++) {
            result.add(overlayBitAtPos(nums, i));
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];

        for(int i=0;i<n; i++) {
            nums[i] = sc.nextInt();
        }

        List<List<Integer>> res = subsets(nums);
        for(List<Integer> i: res) System.out.println(i);
    }
}