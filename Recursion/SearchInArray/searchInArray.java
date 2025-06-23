// package SearchInArray;
import java.lang.*;
import java.util.*;
public class SearchInArray {
    public boolean searchInArray(int arr[],int size,int index,int target){
        //BASE CASE
        //There are 2 base cases-->For FOUND/For NOT FOUND
        if (index==size) {
            return false;
        }
        if (arr[index]==target) {
            return true;
        }
        //Recursive Call
        boolean recAns=searchInArray(arr, size, index+1, target);
        return recAns;
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
        System.out.println("Enter the element that you want to search in the array.");
        System.out.println("If the element is present in the array you will get true else false!!");
        int target=sc.nextInt();
        SearchInArray sr=new SearchInArray();
        boolean result = sr.searchInArray(arr, size, index, target);
        System.out.println("Result: " + result);

    }
}
