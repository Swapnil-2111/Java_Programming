import java.util.*;

class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;               // Pointer from start
        int n = nums.length;     // Effective array size

        while (i < n) {
            if (nums[i] == val) {
                // Replace current with last valid element
                nums[i] = nums[n - 1];
                n--;  // Reduce size
            } else {
                i++;
            }
        }

        return n;  // New length (valid part of array)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value to remove:");
        int val = sc.nextInt();

        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        int[] nums = new int[size];
        System.out.println("Enter the elements in the array:");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        Solution sol = new Solution();
        int newLen = sol.removeElement(nums, val);

        System.out.println("New array after removing " + val + ":");
        for (int i = 0; i < newLen; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("\nNew length: " + newLen);
    }
}

