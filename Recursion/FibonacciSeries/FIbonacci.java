// package Recursion.FibonacciSeries;
import java.lang.*;
import java.util.*;

public class FIbonacci {
    public int fib(int n){
        //BASE CASE
        if (n==0||n==1) {
            return n;
        }
        //Recursive Call
        int ans=fib(n-1)+fib(n-2);
        return ans;
    }
    public static void main(String[] args) {
        int num,store;
        System.out.println("Enter the number:");
        num=new Scanner(System.in).nextInt();
        System.out.print("The number present on the entered position is : ");
        FIbonacci fb=new FIbonacci();
        store=fb.fib(num);
        System.out.println(store);
    }
}
