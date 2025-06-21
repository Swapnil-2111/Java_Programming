// package FactorialOfANumber;
import java.util.*;
import java.lang.*;

public class FactorialOfNum {
    public static void main(String[] args) {
        int number;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of which you want Factorial of :");
        number=sc.nextInt();
        int sum=1;
        for(int i=number;i>0;i--){
            sum=sum*i;
        }
        System.out.println("Factorial of "+number+" is:"+sum);
    }
}
