// package PalindromeNumber;
import java.lang.*;
import java.util.*;
public class PalindromeNumber {
    public static void main(String[] args) {
        int number,digit;
        System.out.println("Enter the number of digits present in your number:");
        digit=new Scanner(System.in).nextInt();
        System.out.println("Enter the number:");
        number=new Scanner(System.in).nextInt();
        int count=0,rem=number;
        int arr[]=new int[digit];
        for(int i=0;number!=0 && i<digit;i++){
            count=number%10;
            arr[i]=count;
            number=number/10;
        }        
        for(int i=0;i<digit;i++){
            // if (arr[i]==arr[digit-1]) {
            //     continue;
            // }
             if (arr[i]==arr[digit-1] ) {
                System.out.println("PALINDROME");
                break;
            }
            else if (arr[i]!=arr[digit-1]||arr[i]!=arr[i] || arr[i]!=arr[i+1]) {
                System.out.println("NOT PALINDROME");
                break;
            }
        }
    }
}
