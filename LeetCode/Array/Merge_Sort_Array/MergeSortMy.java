import java.util.*;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0, x = 0;
        int size = m + n;
        int[] temp = new int[size];

        // Merge both arrays
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                temp[x++] = nums1[i++];
            } else {
                temp[x++] = nums2[j++];
            }
        }

        // Copy remaining elements
        while (i < m) {
            temp[x++] = nums1[i++];
        }

        while (j < n) {
            temp[x++] = nums2[j++];
        }

        // Copy temp into nums1
        for (int s = 0; s < size; s++) {
            nums1[s] = temp[s];
        }

        // Print final result
        System.out.println("Sorted Array looks like:");
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        int m, n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in nums1 (m):");
        m = sc.nextInt();

        System.out.println("Enter the number of elements in nums2 (n):");
        n = sc.nextInt();

        int[] nums1 = new int[m + n];  // Create nums1 with space for both arrays
        int[] nums2 = new int[n];

        System.out.println("Enter " + m + " elements for nums1:");
        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }

        // Remaining positions in nums1 should already be 0 by default

        System.out.println("Enter " + n + " elements for nums2:");
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();  // Fixed: use i < n
        }

        Solution sol = new Solution();
        sol.merge(nums1, m, nums2, n);
    }
}
