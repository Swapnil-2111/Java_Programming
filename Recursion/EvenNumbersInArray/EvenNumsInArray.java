// package EvenNumbersInArray;

import java.util.*;
import java.lang.*;

public class EvenNumsInArray {
    public void recEven(int arr[],int size,int index){
        //Base Case
        if (index==size) {
            return;
        }
        if (arr[index]%2==0) {
            System.out.println(arr[index]);
        }
        //Recursive Call
        recEven(arr, size, index+1);
    }
    public static void main(String[] args) {
        int size,index=0;
        System.out.println("Enter the size of the array:");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        int []arr=new int[size];
        System.out.println("Enter the elements in the array:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The Even Numbers Are:");
        EvenNumsInArray on=new EvenNumsInArray();
        on.recEven(arr, size, index);
        
    }
}
