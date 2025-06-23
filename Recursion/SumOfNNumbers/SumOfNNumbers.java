// package SumOfNNumbers;
import java.util.*;
import java.lang.*;

public class SumOfNNumbers {
    public int recSum(int n){
        //Base Case
        if (n==1) {
            return 1;
        }
        //Recursive CALL
        int recAns=recSum(n-1);
        return recAns+n;
    }
    public static void main(String[] args) {
        int number,store;
        System.out.println("Enter the number till which you want to print the sum:");
        number=new Scanner(System.in).nextInt();
        System.out.print("The Sum is : ");
        SumOfNNumbers ns=new SumOfNNumbers();
        store=ns.recSum(number);
        System.out.println(store);
    }
}
