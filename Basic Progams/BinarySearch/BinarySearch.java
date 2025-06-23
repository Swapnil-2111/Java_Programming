import java.util.*;

class BinarySearch {

    public static int BS(Vector<Integer> v, int target) {
        int s = 0;
        int e = v.size() - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;     // recompute every pass

            if (v.get(mid) == target)      // found it
                return mid;

            if (target > v.get(mid))       // search right half
                s = mid + 1;
            else                           // search left half
                e = mid - 1;
        }
        return -1;                         // not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> v = new Vector<>();

        System.out.print("Enter number of elements (sorted!): ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " integers in **ascending order**:");
        for (int i = 0; i < n; i++) {
            v.add(sc.nextInt());
        }

        System.out.print("Enter target to search: ");
        int target = sc.nextInt();

        int pos = BS(v, target);
        if (pos != -1)
            System.out.println("Found at index " + pos);
        else
            System.out.println("Not present in the vector");
    }
}
