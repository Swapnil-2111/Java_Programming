import java.lang.*;
import java.util.*;

public class ArmstrongNum {

    public static void main(String[] args) {
        int number, num = 0;
        System.out.println("Enter the number:");
        number = new Scanner(System.in).nextInt();
        int temp = number;
        int sum = 0, noOfDigit = 0;

        for (int i = 0; number != 0; i++) {
            number = number / 10;
            noOfDigit = noOfDigit + 1;
        }

        number = temp;
        System.out.println("Your Number has " + noOfDigit + " digits.");
        for (int i = 0; number != 0; i++) {
            num = number % 10;
            sum = sum + (num * num * num);
            number = number / 10;
        }
        if (sum == temp) {
            System.out.println("The entered number is a ARMSTRONG!!");
        } else {
            System.out.println("The entered number is not a ARMSTRONG!!");
        }

    }
}