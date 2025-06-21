import java.lang.*;
import java.util.*;

class GreatestNumber{
    public static void main(String[] args){
        int number1,number2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two Numbers ");
        number1=sc.nextInt();
        number2=sc.nextInt();
        if(number1>number2){
            System.out.println("Greatest of the given numbers is:"+ number1);
        }
        else if(number1<number2){
            System.out.println("Greatest of the given numbers is:"+number2);
        }
        else
            System.out.println("Both the entered numbers are equal!!");

    }
}