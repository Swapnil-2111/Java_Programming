// package Recursion.PowerOfElement;
import java.lang.*;
import java.util.*;

public class RecPower {
    public int power(int n){
        //BASE CASE
        if (n==0) {
            return 1;
        }
        //Recursive Call
        int finalAns,temp;
        temp=power(n-1);
        finalAns=2*temp;
        return finalAns;

    }
    public static void main(String[] args) {
        int num,value;
        System.out.println("Enter the number:");
        num=new Scanner(System.in).nextInt();
        System.out.print("The value is:");
        RecPower rp=new RecPower();
        value=rp.power(num);
        System.out.println(value);
    }
}
