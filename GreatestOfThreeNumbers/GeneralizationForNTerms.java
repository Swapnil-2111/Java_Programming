import java.lang.*;
import java.util.*;

class GeneralSumAmongNTerms{
    public static void main(String[] args){
        int totalNum;
        System.out.println("Enter the total count of numbers you have with you ");
        Scanner s=new Scanner(System.in);
        totalNum=s.nextInt();
        
        int storenum[]=new int[totalNum];
        System.out.println("Enter your Values:");
        for(int i=0;i<totalNum;i++){
            storenum[i]=s.nextInt();
        }
        int max=storenum[0],min=storenum[0];
        for(int i=0;i<totalNum;i++){
            if(max>storenum[i])
                max=max;
            else
                max=storenum[i];
            if(min<storenum[i])
                min=min;
            else
                min=storenum[i];    
        }
        System.out.println("Maximum Value is:"+max+" &    Minimum value is:"+min);
    }
}