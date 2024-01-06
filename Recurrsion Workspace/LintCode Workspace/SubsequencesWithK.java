import java.util.*;

public class SubsequencesWithK {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int size = sc.nextInt();
        int target = sc.nextInt();
        List<Integer> ds = new ArrayList<>();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        callme(ds, arr, size, target, 0, 0);
    }

    public static void callme(List<Integer> lst, int[] arr, int size, int target, int currentIndex, int currentSum) {
        if (currentIndex == size) {
            if (currentSum == target) {
                for (Integer ls : lst) {
                    System.out.print(ls + " ");
                }
                System.out.println();
            }
            return;
        }

        lst.add(arr[currentIndex]);
        currentSum += arr[currentIndex];

        callme(lst, arr, size, target, currentIndex + 1, currentSum);

        lst.remove(lst.size() - 1);
        currentSum -= arr[currentIndex];

        callme(lst, arr, size, target, currentIndex + 1, currentSum);
    }
}
