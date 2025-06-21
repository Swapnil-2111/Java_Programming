import java.lang.*;
import java.util.*;
public class PrintingNNumber{
    public void printCounting(int n){
        //BASE CASE
        if (n==0) {
            return;
        }
        //Processing
        System.out.println(n+" ");
        //Recursive Call
        printCounting(n-1);
    }
    public static void main(String[] args) {
        int num;
        System.out.println("Enter the number till which you want to print the numbers:");
        num=new Scanner(System.in).nextInt();
        System.out.println("The numbers are:");
        PrintingNNumber pc=new PrintingNNumber();
        pc.printCounting(num);
    }
}