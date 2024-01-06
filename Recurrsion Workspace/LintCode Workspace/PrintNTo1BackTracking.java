import java.util.Scanner;

public class PrintNTo1BackTracking {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        callme(sc.nextInt(),sc.nextInt());
    }
    public static void callme(int i,int n)
    {
        if(i>n) return;
        callme(i+1,n);  // backtracking means we first call all the functions and print
        System.out.println(i);
    }

}
