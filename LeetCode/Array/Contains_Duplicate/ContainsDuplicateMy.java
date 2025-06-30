import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums); // Sort the array first
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true; // Found a duplicate
            }
        }
        return false; // No duplicates found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution sol = new Solution();
        boolean hasDuplicate = sol.containsDuplicate(nums);

        if (hasDuplicate) {
            System.out.println("The array contains duplicates.");
        } else {
            System.out.println("All elements are unique.");
        }

        sc.close();
    }
}
