// package NthTermOfFibonacciSeries;
import java.lang.*;
import java.util.*;

public class NthTermOfFibonacciSeries {
    public static void main(String[] args) {
        int number;
        System.out.println("Enter the position or index of which you want the value in Fibonacci Series:");
        Scanner sc=new Scanner(System.in);
        number=sc.nextInt();
        int a=0,b=1,c=0;
        if (number==1) {
            System.out.print(a+" ");
        }
        if (number==2) {
            System.out.print(a+" "+b);
        }

        else{
            // System.out.print(a+" "+b+" ");
            for(int i=0;i<number-2;i++){
                c=a+b;
                a=b;
                b=c;
            }
            System.out.print("The "+number+"th term of Fibonacci Series is:"+c+" ");
        }
    }
}

    

