import java.util.Scanner;

class Solution {
    public int majorityElement(int[] nums) {
        int num=0;
        int count=0;
        int maxCount=0;
        if(nums.length==1){
            num=nums[0];
            return num;
        }
        if(nums.length==2){
            if(nums[0]==nums[1]){
                num=nums[0];
                return num;
            }
            else {
                return -1;
            }
        }
        for(int i=0;i<nums.length;i++){
            count=1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>maxCount){maxCount=count;num=nums[i];}
            
            }
            if(maxCount>nums.length/2){
                return num;
            }
            
        return num;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter the elements in the array:");
        for (int i = 0; i < n; i++) {
            nums[i]=sc.nextInt();
        }
        Solution sol=new Solution();
        int store=sol.majorityElement(nums);
        System.out.println("Majority Element is:"+store);

    }
}
