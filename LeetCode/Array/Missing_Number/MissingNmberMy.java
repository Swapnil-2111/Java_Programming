import java.util.*;
class Solution {
    public int missingNumber(int[] nums) {
        int siri=0;
        // int k=Integer.MAX_VALUE;//Return value Integer
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==siri){
                // k= nums[i];
                siri++;
                i=-1;
            }
        }

        return siri;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        int[] nums = new int[size];
        System.out.println("Enter " + size + " elements (from 0 to " + size + " with one number missing):");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        // Use the Solution class
        Solution sol = new Solution();
        int missing = sol.missingNumber(nums);

        System.out.println("The missing number is: " + missing);
    }
}
