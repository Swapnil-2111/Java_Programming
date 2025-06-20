import java.lang.*;
import java.util.*;

class GreatestNumber3{
    public static void main(String[] args)
    {
        int num1,num2,num3;
        System.out.println("Enter the three numbers:");
        Scanner s=new Scanner(System.in);
        num1=s.nextInt();
        num2=s.nextInt();
        num3=s.nextInt();
        if(num1>num2 & num1>num3){
            System.out.println("The Greatest number among all the numbers is:"+num1);
        }
        else if(num2>num1 & num2>num3){
            System.out.println("The Greatest number among all the numbers is:"+num2);
        }
        else if(num3>num1 & num3>num2){
            System.out.println("The Greatest number among all the numbers is:"+num3);
        }
        else
            System.out.println("The Numbers you entered are all the same numbers or if that's not the case enter the numbers again.");
    }
}