import java.util.*;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;         // Last index of actual elements in nums1
        int j = n - 1;         // Last index of nums2
        int k = m + n - 1;     // Last index of full nums1

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // Only copy remaining nums2 (if any)
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3, n = 3;

        Solution sol = new Solution();
        sol.merge(nums1, m, nums2, n);

        System.out.println("Sorted Array looks like:");
        System.out.println(Arrays.toString(nums1));
    }
}

