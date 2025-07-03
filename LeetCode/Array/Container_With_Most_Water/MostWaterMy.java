import java.util.*;
class SolutionMy {
    public int maxArea(int[] height) {
        int maxArea=0;
        int area=0;
        int n=height.length;
        int length=0;
        int breadth=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                length=min(height[i],height[j]);
                breadth=Math.abs(i-j);
                area=length*breadth;
                if(maxArea<area){
                    maxArea=area;
                }
            }
        }
        return maxArea;
    }
    public static int min(int a, int b){
        if(a<b){
            return a;
        }
        else{
            return b;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        System.out.println("Enter the heights in the array:");
        int[] height=new int[size];
        for(int i=0;i<size;i++){
            height[i]=sc.nextInt();
        }
        SolutionMy sol=new SolutionMy();
        int store=sol.maxArea(height);
        System.out.println("Maximum amount of water a container can store:"+store);
    }
}

