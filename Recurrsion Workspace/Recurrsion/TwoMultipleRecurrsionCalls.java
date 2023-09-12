import java.util.Scanner;

public class TwoMultipleRecurrsionCalls {
    static Scanner sc  = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(fibonacci(sc.nextInt()));
    }
    public static int fibonacci(int n)
    {
        if(n<=1) return n;
        int last = fibonacci(n-1);
        int secondlast = fibonacci(n-2);
        return last + secondlast;
    }

}
