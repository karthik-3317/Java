import java.util.*;

public class LongestPalindromic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int strings = sc.nextInt();
        int stringlen = sc.nextInt();
        Set<String> first = new HashSet<>();
        Set<String> second = new HashSet<>();
        String firstPart = "";
        String lastPart = "";
        String middlePart = "";
        for (int i = 0; i < strings; i++) {
            String curr = sc.next().trim();
            if (!first.contains(curr) && !first.contains(new StringBuilder(curr).reverse().toString()))
                first.add(curr);
            else if (first.contains(new StringBuilder(curr).reverse().toString()) && !second.contains(curr))
                second.add(curr);
        }
        for (String ix : first) {
            StringBuilder rev = new StringBuilder(ix).reverse();
            if (second.contains(rev.toString())) {
                firstPart = firstPart + ix;
                lastPart = rev + lastPart;
            }
        }
        for (String s : first) {
            if (!second.contains(new StringBuilder(s).toString())) {
                if (isPalindromic(s)) {
                    middlePart = middlePart + s;
                    break;
                }
            }
        }
        System.out.println(firstPart.length()+middlePart.length()+lastPart.length());
        System.out.println(firstPart + middlePart + lastPart);
    }

    public static boolean isPalindromic(String s) {
        return new StringBuilder(s).reverse().toString().equals(s);
    }
}
