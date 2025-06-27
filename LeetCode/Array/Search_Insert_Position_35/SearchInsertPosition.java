import java.util.*;

class Solution {
    static boolean done = false;

    public int searchInsert(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length - 1);
    }

    private int binarySearch(int[] nums, int target, int start, int end) {
        if (!done) {
            System.out.println("Only Printed ONCE!!");
            done = true;
        }

        if (start > end) return start;

        int mid = start + (end - start) / 2;

        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] > target) {
            return binarySearch(nums, target, start, mid - 1);
        } else {
            return binarySearch(nums, target, mid + 1, end);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target;

        System.out.println("Enter the target number:");
        target = sc.nextInt();

        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        int[] nums = new int[size];
        System.out.println("Enter the elements in the array:");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        Solution sol = new Solution();
        int index = sol.searchInsert(nums, target);

        System.out.println("Insert position: " + index);
    }
}

