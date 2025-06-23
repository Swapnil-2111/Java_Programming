// package MaximumElementOfArray;
import java.lang.*;
import java.util.*;

public class MaxElementInArray {
    public int max(int a,int b){
        if (a>b) {
            return a;
        }
        else
            return b;
    }
    public int maxInArray(int arr[],int size,int index,int maxi){
        //Base Case
        if (index==size) {
            return 0;
        }
        //Recursive relation
        MaxElementInArray mx=new MaxElementInArray();
        maxi=mx.max(maxi,arr[index]);
        int maxi2=maxInArray(arr, size, index+1, maxi);
        return max(maxi,maxi2);
    }
    public static void main(String[] args) {
        int size,index=0,maxi=Integer.MIN_VALUE;
        System.out.println("Enter the size of the array:");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        int []arr=new int[size];
        System.out.println("Enter the elements in the array:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        MaxElementInArray me=new MaxElementInArray();
        int store=me.maxInArray(arr, size, index, maxi );
        System.out.println("Maximum element is:"+store);
    }
}
