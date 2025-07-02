import java.util.Scanner;

class Solution2 {
    public void moveZeroes(int[] nums) {
        int nonZeroPos = 0;

        // First pass: move non-zero elements forward
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Swap only if nonZeroPos is different
                if (i != nonZeroPos) {
                    int temp = nums[i];
                    nums[i] = nums[nonZeroPos];
                    nums[nonZeroPos] = temp;
                }
                nonZeroPos++;
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] nums = new int[size];

        System.out.println("Enter the elements in the array:");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        Solution2 sol = new Solution2();
        sol.moveZeroes(nums);

        System.out.println("Array after moving zeroes to the end:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}

