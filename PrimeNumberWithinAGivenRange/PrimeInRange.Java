import java.lang.*;
import java.util.*;

class PrimeNoInRange{
    public static void main(String[] args){
        int start,end;
        System.out.println("Enter the range in natural numbers.");
        System.out.println("Enter the starting value and ending value of the range respectively:");
        Scanner sc=new Scanner(System.in);
        start=sc.nextInt();
        end=sc.nextInt();
        System.out.println("The prime numbers in the range are:");
        if(start<=2){
            System.out.println(2 +"is a PRIME Number");
        }
        for(int i=start;i<=end;i++){
            for(int j=2;j<i;j++){
                if (i%j==0) {
                    // System.out.println("Entered number is not a prime number .");
                    break;
                }
                else{
                    if (j+1==i) {
                    System.out.println(i+" is a PRIME Number.");
                    break; 
                    }
                
                }
            }
            
        }
        if(start==end){
            System.out.println("You have entered same values in both the places.So range is now Zero and range has been focused only on a single number ie "+start+" And this number is ");
            for(int i=2;i<start;i++)
            {
                if (start%i==0) {
                System.out.println("Entered number is not a prime number .");
                break;
                }
                else{
                    if (i+1==start) {
                    System.out.println("Entered number is a PRIME Number.");
                    break; 
                    }
                
                }
            }
        }
    }
}