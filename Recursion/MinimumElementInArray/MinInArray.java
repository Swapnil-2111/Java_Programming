// package MinimumElementInArray;
import java.lang.*;
import java.util.*;

public class MinInArray {
    public static int min(int a,int b){
        if (a>b) {
            return b;
        }
        else
            return a;
    }
    public int minInArray(int arr[],int size,int index,int mini){
        //Base Case
        if (index==size) {
            return mini;
        }
        //Recursive Call
        mini=min( mini,arr[index]);
        int ans=minInArray(arr, size, index+1, mini);
        return min(mini,ans);
    }
    public static void main(String[] args) {
        int size,mini=Integer.MAX_VALUE,index=0;
        System.out.println("Enter the size of the array:");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        int [] arr=new int[size];
        System.out.println("Enter the elements in the array:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        MinInArray ma=new MinInArray();
        int store=ma.minInArray(arr, size, index, mini);
        System.out.println("The Minimum value in the array is :"+store);
    }
}
