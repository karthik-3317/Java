import java.util.*;

public class FindThePrefixCommonArrayOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            arr2[i] = sc.nextInt();
        }

        Map<Integer, Integer> hmap = new HashMap<>();

        for (int i = 0; i < size; i++) {
            hmap.put(arr1[i], 1 + hmap.getOrDefault(arr1[i], 0));
            hmap.put(arr2[i], 1 + hmap.getOrDefault(arr2[i], 0));
            int currentCounter = 0;
            System.out.println(hmap);
            for (int j=0;j<=i;j++) {
                if (hmap.containsKey(arr1[j]) && hmap.containsKey(arr2[j])) {
                    if (hmap.get(arr1[j]) % 2 == 0) {
                        currentCounter++;
                    }
                }
            }
            result[i] = currentCounter;
        }

        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}
