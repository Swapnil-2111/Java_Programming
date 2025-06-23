// package PrintingElementsOfArray;
import java.lang.*;
import java.util.*;

public class PrintArray {
    public void printArray(int arr[],int size,int index){
        //Base Case
        if (index==size) {
            return;
        }
        System.out.print(arr[index]+" ");
        printArray(arr, size, index+1);
    }
    public static void main(String[] args) {
        int size,index=0;
        System.out.println("Enter the size of array:");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements in your array:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        PrintArray pr=new PrintArray();
        pr.printArray(arr, size, index);
        System.out.println("The elements entered by the user is as belows:");

    }
}
