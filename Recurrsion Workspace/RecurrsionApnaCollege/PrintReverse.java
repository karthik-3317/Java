import java.util.Scanner;
public class PrintReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String enter = sc.next();
        reverseString(enter, enter.length()-1);
    }
    public static void reverseString(String alpha,int index)
    {
        if(index == -1)
        return;

        System.out.print(alpha.charAt(index));

        reverseString(alpha, index-1);

        if(index == 0)
        System.out.println();
        
        System.out.print(alpha.charAt(index));
    }
}
