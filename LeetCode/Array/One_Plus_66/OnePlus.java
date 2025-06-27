import java.util.*;

class Solution {
    public int[] plusOne(int[] digits) {
        // FIXED: Removed use of store and Math.pow (causes overflow and precision loss)
        // Instead, handle carry by traversing digits from end

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;   // Just add and return if no carry
                return digits;
            }
            digits[i] = 0;     // Set to 0 and continue loop to carry to next digit
        }

        // If we reach here, it means all digits were 9 (e.g., 999 + 1 = 1000)
        int[] result = new int[digits.length + 1];
        result[0] = 1;  // All other digits already 0 by default
        return result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the number:");
        int size = sc.nextInt();

        // FIXED: Removed size++ (no need to pre-increase array size)
        int[] digits = new int[size];

        System.out.println("Enter the large number in such a way that MSB should be entered first and at last LSB should be given:");
        for (int i = 0; i < size; i++) {
            digits[i] = sc.nextInt();
        }

        Solution sol = new Solution();

        // FIXED: Used the returned result array properly
        int[] result = sol.plusOne(digits);

        // Printing result
        System.out.println("Now array looks like:");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
