package Recursion.PrintingNNumbersInReverseOrder.PrintingNNumbersInConsecutiveManner;

import java.util.Scanner;

public class PrintingNumbersInOrder {
    public static void printCounting(int n){
        //BASE CASE
        if (n==0) {
            return;
        }
        //RECURSIVE CALL
        printCounting(n-1);
        //PROCESSING
        System.out.println(n+" ");
    }
    public static void main(String[] args){
        int num;
        System.out.println("Enter the number:");
        num=new Scanner(System.in).nextInt();
        System.out.println("The Series is:");
        printCounting(num);
    }
}
