// package MaximumElementOfArray;
import java.util.Scanner;

public class MaxElementInArray1 {

    // helper that returns the larger of two ints
    private int Max(int a, int b) {
        return (a > b) ? a : b;
    }

    // recursive function that returns the maximum element
    public int maxInArray(int[] arr, int index) {
        if (index == arr.length - 1) {          // base case: last element
            return arr[index];
        }
        int maxRest = maxInArray(arr, index + 1); // max of the tail
        return Max(arr[index], maxRest);          // compare head with tail-max
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        MaxElementInArray1 me = new MaxElementInArray1();
        int maximum = me.maxInArray(arr, 0);       // start from index 0
        System.out.println("Maximum element is: " + maximum);

        sc.close();
    }
}

