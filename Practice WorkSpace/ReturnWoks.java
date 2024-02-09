import java.util.Scanner;

public class ReturnWoks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println(armstrong(sc.nextInt())); 
    }
    public static int armstrong(int n){
        if( n == 0 )
        return 1;
        int sum = factorial(n);
        return sum + armstrong( n - 1 );
    }
    public static int factorial(int n)
    {
        if( n == 0 )
        return 1;
        return n * factorial( n - 1 );
    }
}
