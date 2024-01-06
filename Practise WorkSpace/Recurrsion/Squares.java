import java.util.Scanner;

public class Squares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("The factorial of the numbers for the range " + karthik(sc.nextInt()));
        aditya(10, 0);
    }
    public static int  karthik(int n){
        if(n == 0)
        return 1;
        return n * karthik(n-1);
    }
    public static void aditya(int n,int temp)
    {
        if(n == 0)
        return ;
        temp += n;
        aditya(n - 1, temp);
        System.out.println("This is executed after all completed if doubt check the n value it will increase " + n);
    }
    public static int pavan(int n,int e)
    {
        if(n == 1)
        return 1;
        e = e + n;
        return n + pavan(n - 1, e);
    }
}
