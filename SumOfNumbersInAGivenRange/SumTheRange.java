import java.lang.*;
import java.util.*;

class SumRange{
    public static void main(String[] args){
        int startRange,closeRange;
        System.out.println("Enter the starting and ending numbers of the range you have");
        startRange=new Scanner (System.in).nextInt();
        closeRange=new Scanner (System.in).nextInt();
        int sum=0;
        for(int i=startRange;i<=closeRange;i++){
            sum=sum+i;
        }
        System.out.println("The Sum of the range is:"+sum);
    }
}