import java.util.*;
import java.lang.*;

class SumN2{
    public static void main(String[] args){
        int num,sum=0;
        System.out.println("Enter the number you want to enter till you want to get the sum of natural numbers:");
        num=new Scanner(System.in).nextInt();
        for(int i=1;i<=num;i++){
            sum=i+sum;
        }
        System.out.println("The Sum of "+num+" Natural number is :"+ sum);
    }
}