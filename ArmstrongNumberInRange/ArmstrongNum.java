import java.util.*;
import java.lang.*;
public class ArmstrongNum {
    public static void main(String[] args) {
        int number,temp,startRange,endRange;
        System.out.println("Enter the starting and ending range:");
        Scanner sc=new Scanner(System.in);
        startRange=sc.nextInt();
        endRange=sc.nextInt();
        temp=startRange;//Created a copy of first number.
        number=startRange;
        int noOfDigit=0,rem=0,sum=0;
        for(int j=startRange;j<=endRange;j++){
            number=j;
            temp=j;
            noOfDigit=0;
            rem=0;
            sum=0;
            for(int i=0;number!=0;i++){
                number=number/10;
                noOfDigit+=1;
            }
            number=j;
            for(int i=0;number!=0;i++){
                rem=number%10;
                number=number/10;
                sum+=Math.pow(rem, noOfDigit);
            }
            if (sum==temp) {    
                System.out.println("Number:"+temp+" is    ARMSTRONG NUMBER");
            }
        }
    }
}
