import java.util.Scanner;

public class StringIsPalindrome {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        String palindrome = sc.next();
        System.out.println(callme(0,palindrome.length()-1,palindrome));
    }
    public static boolean callme(int i,int j,String palindromeCheck)
    {
        if(i>=j)
        {
            System.out.println(palindromeCheck);
            return true;
        }
        if(palindromeCheck.charAt(i) != palindromeCheck.charAt(j)) return false;
       return callme(i+1,j-1,palindromeCheck);

    }

}
