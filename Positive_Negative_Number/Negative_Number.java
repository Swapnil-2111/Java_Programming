import java.util.*;
class Negative_Number{
    public static void main(String[] args){
        // int number;
        System.out.println("Enter the number you want to check positive or negative");
        int number=new Scanner(System.in).nextInt();
        if(number>0){
            System.out.println("Entered number "+ number +" is positive");
        }
        else if(number<0){
            System.out.println("Entered number "+ number +" is negative");
        }
        else
            System.out.println("Entered number " + number +" is Zero");
        
    }
}