import java.lang.*;
import java.util.*;
class PrimeNumber{
    public static void main(String[] args)
    {
        int number;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        number=sc.nextInt();
        if (number==1) {
            System.out.println("Entered number is 1 and it is neither a prime number nor a composite number.");
        }
        if (number==2) {
            System.out.println("Number is PRIME!!");
        }
        for(int i=2;i<number;i++){
            if (number%i==0) {
                System.out.println("Entered number is not a prime number .");
                break;
            }
            else{
                if (i+1==number) {
                    System.out.println("Entered number is a PRIME Number.");
                    break; 
                }
                
            }
        }

    }
}