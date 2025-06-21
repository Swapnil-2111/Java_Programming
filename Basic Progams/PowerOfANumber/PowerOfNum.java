// package PowerOfANumber;
import java.lang.*;
import java.util.*;
public class PowerOfNum {
    public static void main(String[] args) {
        double numBase,numPower;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Base Number:");
        numBase=sc.nextInt();
        System.out.println("Enter the Power Number:");
        numPower=sc.nextInt();
        double power;
        power=Math.pow(numBase,numPower);
        power=(int)Math.pow(numBase,numPower);
        System.out.println("Power value of a Numbers you entered is:"+power);
    }
}
