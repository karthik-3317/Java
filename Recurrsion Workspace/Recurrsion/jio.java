public class jio {
    public static boolean isStable(int num) {
        String strNum = String.valueOf(num);
        char firstDigit = strNum.charAt(0);
        for (int i = 1; i < strNum.length(); i++) {
            if (strNum.charAt(i) != firstDigit) {
                return false;
            }
        }
        return true;
    }

    public static int findStableUnstableSum(int[] arr) {
        int maxStable = 0;
        int minUnstable = 0;

        for (int num : arr) {
            if (isStable(num)) {
                maxStable = Math.max(maxStable, num);
            } else {
                if (minUnstable == 0 || num < minUnstable) {
                    minUnstable = Math.min(minUnstable,num);
                }
            }
        }

        return maxStable + minUnstable;
    }

    public static void main(String[] args) {
        int[] arr = {112233, 1223, 456789, 111222333, 4444};
        int sum = findStableUnstableSum(arr);
        System.out.println("Sum: " + sum);
    }
}
