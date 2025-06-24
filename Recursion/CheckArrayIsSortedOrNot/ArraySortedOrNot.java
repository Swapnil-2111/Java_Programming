import java.util.*;

public class ArraySortedOrNot {

    // Recursive function to check if the array is sorted
    public int arraySort(Vector<Integer> v, int index) {
        // Base case: if we reach the second last element, it's sorted
        if (index == v.size() - 1) {
            return 1;
        }

        // If current element is greater than the next, array is not sorted
        if (v.get(index) > v.get(index + 1)) {
            System.out.println("NOT SORTED!!");
            return 0;
        }

        // Recursive call
        return arraySort(v, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> v = new Vector<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            v.add(sc.nextInt());
        }

        System.out.println("Entered array:");
        for (var value : v) {
            System.out.print(value + "  ");
        }

        System.out.println(); // Line break
        System.out.print("The above array is ");

        ArraySortedOrNot so = new ArraySortedOrNot();
        int result = so.arraySort(v, 0);

        if (result == 1) {
            System.out.println("SORTED!!");
        }
    }
}
