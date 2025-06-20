import java.util.*;
import java.lang.*;

class SumN{
    public static void main(String[] args){
        System.out.println("Enter the number till which you need sum of natural numbers");
        int num=new Scanner(System.in).nextInt();
        int sum;
        sum=(num*(num+1))/2;
        System.out.println("The sum of "+num+ " natural numbers is:"+ sum);

    }
}