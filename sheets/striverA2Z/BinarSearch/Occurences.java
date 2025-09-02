import java.util.Scanner;

public class Occurences {
    public static int lowerBound(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        
        int ans = nums.length;
        while(start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] == target) {
                end = mid-1;
                ans = mid;
            } else if (nums[mid] > target) {
                end = mid -1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }

    public static int upperBound(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        
        int ans = nums.length;
        while(start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] == target) {
                start = mid + 1;
                ans = mid;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int[] nums = new int[x];
        for(int i= 0; i<x; i++) nums[i] = sc.nextInt();

        int target = sc.nextInt();
        int lowerBound = lowerBound(nums, target);
        int upperBound = upperBound(nums, target);
        
        System.out.println("Occurences : " + (upperBound - lowerBound + 1));
    }
}