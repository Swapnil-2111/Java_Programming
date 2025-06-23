// package OddNumbersInArray;
import java.util.*;
import java.lang.*;

public class OddNumsInArray {
    public void recOdd(int arr[],int size,int index){
        //Base Case
        if (index==size) {
            return;
        }
        if (arr[index]%2!=0) {
            System.out.println(arr[index]);
        }
        //Recursive Call
        recOdd(arr, size, index+1);
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
        System.out.println("The Odd Numbers Are:");
        OddNumsInArray on=new OddNumsInArray();
        on.recOdd(arr, size, index);
        
    }
}
