import java.util.*;
import java.lang.*;
class NDistictSumNatNum{
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int num,sum=0;
        System.out.println("Enter the count of the Natural Numbers you have with you of which you want the sum");
        num=sc.nextInt();
        int storenum[]=new int[num];
        System.out.println("Enter your values :");
        for(int i=0;i<num;i++){
            storenum[i]=sc.nextInt();
        }
        for(int i=0;i<num;i++){
            sum=sum+storenum[i];
        }
        System.out.println("The sum of all the numbers entered by is:"+sum);
    }
}