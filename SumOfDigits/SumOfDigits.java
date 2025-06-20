package SumOfDigits;
import java.lang.*;
import java.util.*;

public class SumOfDigits {
    public static void main(String[] args) {
        int number,num;
        System.out.println("Enter the number:");
        number=new Scanner(System.in).nextInt();
        num=number;
        int countSum=0,sum=0;
        while(number!=0){
            countSum=number%10;
            sum=sum+countSum;
            number=number/10;
        }
        System.out.println("The sum of digits of the entered number "+num+" is:"+sum);
    }
}
