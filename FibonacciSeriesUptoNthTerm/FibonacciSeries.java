// package FibonacciSeriesUptoNthTerm;
import java.lang.*;
import java.util.*;

public class FibonacciSeries {
    public static void main(String[] args) {
        int number;
        System.out.println("Enter the number till which you want to print the Fibonacci Series");
        Scanner sc=new Scanner(System.in);
        number=sc.nextInt();
        int a=0,b=1,c;
        if (number==1) {
            System.out.print(a+" ");
        }
        if (number==2) {
            System.out.print(a+" "+b);
        }

        else{
            System.out.print(a+" "+b+" ");
            for(int i=0;i<number-2;i++){
                c=a+b;
                System.out.print(c+" ");
                a=b;
                b=c;
            }
        }
    }
}
