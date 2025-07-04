import java.util.*;

public class LongestCommonPrefix {

    static class Solution {
        public String longestCommonPrefix(String[] strs) {
            if (strs == null || strs.length == 0)
                return "";

            int n = strs.length;
            int minLen = strs[0].length();

            for (int i = 1; i < n; i++) {
                if (strs[i].length() < minLen) {
                    minLen = strs[i].length();
                }
            }

            int same = 0;

            for (int index = 0; index < minLen; index++) {
                char ch = strs[0].charAt(index);
                boolean allMatch = true;

                for (int i = 1; i < n; i++) {
                    if (strs[i].charAt(index) != ch) {
                        allMatch = false;
                        break;
                    }
                }

                if (allMatch) {
                    same++;
                } else {
                    break;
                }
            }

            return strs[0].substring(0, same);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the strings (space-separated):");
        String line = sc.nextLine();

        // Split by space
        String[] strs = line.trim().split("\\s+");

        Solution sol = new Solution();
        String result = sol.longestCommonPrefix(strs);

        System.out.println("Longest Common Prefix: " + result);
    }
}
