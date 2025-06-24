import java.lang.*;
import java.util.*;

public class PrintDigitsOfNum {
    public void printDigit(int n){
        //Base Case
        if (n==0) {
            return;
        }
        //Recursive Call
        int temp=n/10;
        printDigit(temp);
        //Processing
        int digit=n%10;
        System.out.println(digit);
        

    }
    public static void main(String[] args) {
        int num;
        System.out.println("Enter the Number:");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        PrintDigitsOfNum pd=new PrintDigitsOfNum();
        System.out.println("The digits of the number are:");
        pd.printDigit(num);

    }
}
