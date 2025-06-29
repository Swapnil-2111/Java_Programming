import java.util.Scanner;

class Solution2 {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        // Phase 1: Find a candidate for majority
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                candidate = nums[i]; // Set current number as candidate
            }

            if (nums[i] == candidate) {
                count++; // Increase count if same as candidate
            } else {
                count--; // Decrease count if different
            }
        }

        // Phase 2: Verify if the candidate is actually a majority
        count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == candidate) {
                count++;
            }
        }

        if (count > nums.length / 2) {
            return candidate;
        } else {
            return -1; // No majority element
        }
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
        int majority = sol.majorityElement(nums);

        if (majority != -1) {
            System.out.println("The majority element is: " + majority);
        } else {
            System.out.println("No majority element exists in the array.");
        }

        sc.close();
    }
}
