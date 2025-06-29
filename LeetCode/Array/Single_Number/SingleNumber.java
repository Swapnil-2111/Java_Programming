import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int singleNumber(int[] nums) {
        int[] sorted = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sorted);

        for (int i = 0; i < sorted.length; i++) {
            if (sorted.length == 1) return sorted[0];

            // First element
            if (i == 0 && sorted[i] != sorted[i + 1]) return sorted[i];

            // Last element
            if (i == sorted.length - 1 && sorted[i] != sorted[i - 1]) return sorted[i];

            // Middle elements
            if (i > 0 && i < sorted.length - 1 &&
                sorted[i] != sorted[i - 1] && sorted[i] != sorted[i + 1]) {
                return sorted[i];
            }
        }

        // Should not happen if input is valid (one element appears once, others twice)
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the array elements (with only one unique number):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution sol = new Solution();
        int result = sol.singleNumber(nums);
        System.out.println("The single number is: " + result);
    }
}

