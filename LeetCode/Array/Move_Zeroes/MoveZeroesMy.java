import java.util.*;
class Solution {
    public void moveZeroes(int[] nums) {
        int i=1,j=i-1;
        for(i=1;i<nums.length;i++){
            
            if (nums[j] == 0 && nums[i] != 0) {
                // swap nums[i] and nums[j]
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;   
            }
            
            else if(nums[j]==0 && nums[i]==0){
                // i++;
                continue;
            }
            j++;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        System.out.println("Enter the elements in the array:");
        int[] nums=new int[size];
        int n=size;
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        Solution sol=new Solution();
        sol.moveZeroes( nums);
    }
}
