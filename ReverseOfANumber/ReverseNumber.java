// package ReverseOfANumber;
import java.util.*;
import java.lang.*;
public class ReverseNumber {
    public static void main(String[] args) {
        int number;
        System.out.println("Enter the number:");
        number=new Scanner(System.in).nextInt();
        int sumCount=0,sum=0,num=number;
        System.out.println("The reverse of the number is:");
        while (number!=0) {
            sumCount=number%10;
            System.out.print(sumCount);
            number=number/10;
        }
        
    }   
}
