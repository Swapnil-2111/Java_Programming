import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int j = 0;
        int[] store = new int[nums.length];
        store[0] = nums[0];
        int distinct = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                store[++j] = nums[i];
                distinct++;
            }
        }

        // Optional: Copy back to nums[]
        for (int i = 0; i < distinct; i++) {
            nums[i] = store[i];
        }

        return distinct;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] nums = new int[size];

        System.out.println("Enter the elements in sorted (non-decreasing) order:");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        Solution sol = new Solution();
        int count = sol.removeDuplicates(nums);

        System.out.println("There are " + count + " unique elements:");
        for (int i = 0; i < count; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

