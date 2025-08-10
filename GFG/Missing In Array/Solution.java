import java.util.Arrays;

class Solution {
    int missingNum(int arr[]) {
        int n = arr.length;
        int store = 0;

        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            if (arr[0] == 1) {
                return arr[0] + 1;
            } else {
                return 1;
            }
        }

        Arrays.sort(arr);
        boolean flag = true;

        if (arr[0] == 1) {
            for (int i = 1; i < n; i++) {
                if (arr[i] != arr[i - 1] + 1) {
                    store = arr[i] - 1;
                    flag = false;
                }
            }
        }

        if (flag && arr[0] == 1) {
            return arr[n - 1] + 1;
        }
        if (arr[0] != 1) {
            return 1;
        }
        if (!flag) {
            return store;
        }

        return -1;
    }



    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] arr1 = {1, 2, 4, 5}; // Missing 3
        int[] arr2 = {2, 3, 4, 5}; // Missing 1
        int[] arr3 = {1, 2, 3, 4}; // Missing 5
        int[] arr4 = {1};          // Missing 2
        int[] arr5 = {5};          // Missing 1
        int[] arr6 = {};           // Empty array

        System.out.println(sol.missingNum(arr1)); // 3
        System.out.println(sol.missingNum(arr2)); // 1
        System.out.println(sol.missingNum(arr3)); // 5
        System.out.println(sol.missingNum(arr4)); // 2
        System.out.println(sol.missingNum(arr5)); // 1
        System.out.println(sol.missingNum(arr6)); // 0
    }
}
