import java.util.Scanner;

public class Solution2 {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int i = 0; i < n; i++) {
            actualSum += nums[i];
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: size of the array
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] nums = new int[n];

        // Input: array elements
        System.out.println("Enter " + n + " elements (from 0 to " + n + " with one missing):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Create object and call method
        Solution2 sol = new Solution2();
        int missing = sol.missingNumber(nums);

        // Output: result
        System.out.println("The missing number is: " + missing);
    }
}

