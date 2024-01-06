import java.util.Scanner;

public class PrintNTo1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        callme(sc.nextInt());
    }
    public static void callme(int i)
    {
        if(i < 0) return;
        System.out.println(i);
        callme(i-1);
    }
}
