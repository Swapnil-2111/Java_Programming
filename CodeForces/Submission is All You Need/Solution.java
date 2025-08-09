import java.util.*;

public class Solution {
    
    // FIX 1: Changed return type from void to int so we can return score
    public static int sol(int arrSet[]) {
        int mex = 0;
        int index = 0;
        int score = 0;

        // FIX 2: Sort the array so mex logic works correctly
        Arrays.sort(arrSet);

        // Find mex
        mex = 0;
        for (int i = 0; i < arrSet.length; i++) {
            if (arrSet[i] == mex) {
                mex++;
            }
        }

        // Add mex to score
        score += mex;

        // Find index where mex-1 is located
        for (int i = 0; i < arrSet.length; i++) {
            index++;
            if (arrSet[i] == mex - 1) {
                break;
            }
        }

        // Zero out elements up to index
        for (int i = 0; i < index; i++) {
            arrSet[i] = 0;
        }

        // Add remaining elements sum
        for (int i = 0; i < arrSet.length; i++) {
            score += arrSet[i];
        }

        return score; // FIX 3: Return score to main
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of test cases:");
        int t = sc.nextInt(); // FIX 4: Renamed variable from "set" to "t" for clarity
        int[] ans = new int[t];
        
        for (int i = 0; i < t; i++) {
            System.out.println("Enter the number of integers in the set:");
            int size = sc.nextInt();
            int[] arrSet = new int[size];
            System.out.println("Enter the elements in the array:");
            
            // FIX 5: Corrected index bug (was arrSet[i], should be arrSet[j])
            for (int j = 0; j < size; j++) {
                arrSet[j] = sc.nextInt();
            }
            
            ans[i] = sol(arrSet); // FIX 6: sol now returns int
        }
        
        System.out.println("Results:");
        for (int l = 0; l < t; l++) {
            System.out.println(ans[l]);
        }
    }
}
