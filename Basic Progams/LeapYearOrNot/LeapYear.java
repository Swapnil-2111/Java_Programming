import java.lang.*;
import java.util.*;

class LeapYear{
    public static void main(String[] args){
        int year;
        System.out.println("Enter the year :");
        year=new Scanner(System.in).nextInt();
        if(year%4==0){
            System.out.println("Entered year is LEAP YEAR!!");
        }
        else{
            System.out.println("Entered year is NON-LEAP YEAR!!");
        }
    }
}
