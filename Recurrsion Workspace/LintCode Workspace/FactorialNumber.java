import java.util.Scanner;

public class FactorialNumber {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(callme(sc.nextInt()));
    }
    public static int callme(int n)
    {
        if(n==0 || n==1) return 1;
        return n*callme(n-1);
    }

}
