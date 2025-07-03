import java.util.*;

class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int i = 0;
        int j = height.length - 1;

        while (i < j) {
            int length = min(height[i], height[j]);
            int breadth = Math.abs(i - j); // or simply j - i
            int area = length * breadth;

            if (area > maxArea) {
                maxArea = area;
            }

            // Move the pointer pointing to the shorter line
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }

        return maxArea;
    }

    public static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        System.out.println("Enter the heights in the array:");
        int[] height = new int[size];
        for (int i = 0; i < size; i++) {
            height[i] = sc.nextInt();
        }

        Solution sol = new Solution();
        int store = sol.maxArea(height);
        System.out.println("Maximum amount of water a container can store: " + store);
    }
}

