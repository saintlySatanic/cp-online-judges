import java.util.Scanner;

public class BinarySearch {
    public static int search(int[] nums, int target) {
        /*
         * return index istead of element
         */
        int ans = -1; int len = nums.length;

        int start = 0;
        int end = len-1;

        while(end >= start) {
            int mid = (start + end) / 2;
            System.out.println("Mid index is : " + mid);
            
            if (nums[mid] < target) start = mid + 1;
            else if (nums[mid] > target) end = mid - 1;
            else {
                // for larget nums;; ans = nums[mid] will be hit only once; so keep target check in else
                ans = mid;
                break;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int[] nums = new int[x];
        for (int i = 0; i < x; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        sc.close();

        int ans = search(nums, target);
        System.out.println("Answer is present in index : " + ans);
    }
}