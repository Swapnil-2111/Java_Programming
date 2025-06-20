import java.util.*;
class EveOdd{
    public static void main(String[] args)
    {
        System.out.println("Enter the Number");
        int num = new Scanner(System.in).nextInt();
        if(num%2==0)
        {
            System.out.println("Entered Number "+num+ " is Even!!");
        }
        else
            System.out.println("Entered Number "+num+ " is Odd!!");
    }
}