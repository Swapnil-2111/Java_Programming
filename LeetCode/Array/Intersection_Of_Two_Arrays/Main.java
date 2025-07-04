import java.util.Scanner;

public class Main {

    // Intersection logic
    static class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            int count1 = nums1.length;
            int count2 = nums2.length;
            int minArray = Math.min(count1, count2);
            int maxArray = Math.max(count1, count2);

            int[] store = new int[minArray];
            int k = 0;

            for (int i = 0; i < count1; i++) {
                for (int j = 0; j < count2; j++) {
                    if (nums1[i] == nums2[j]) {
                        // Check for duplicates before storing
                        boolean isDuplicate = false;
                        for (int m = 0; m < k; m++) {
                            if (store[m] == nums1[i]) {
                                isDuplicate = true;
                                break;
                            }
                        }
                        if (!isDuplicate) {
                            store[k++] = nums1[i];
                        }
                        break; // break inner loop once match is found
                    }
                }
            }

            // Return only the part of the array that contains valid values
            int[] result = new int[k];
            for (int i = 0; i < k; i++) {
                result[i] = store[i];
            }

            return result;
        }
    }

    // Main method for user input/output
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for first array
        System.out.println("Enter size of first array:");
        int n1 = sc.nextInt();
        int[] nums1 = new int[n1];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }

        // Input for second array
        System.out.println("Enter size of second array:");
        int n2 = sc.nextInt();
        int[] nums2 = new int[n2];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) {
            nums2[i] = sc.nextInt();
        }

        // Solve and print intersection
        Solution sol = new Solution();
        int[] result = sol.intersection(nums1, nums2);

        // Output
        System.out.print("Intersection of arrays: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

