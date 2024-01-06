import java.util.Scanner;

public class PrintNTimes {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        callme(sc.nextInt(),sc.nextInt());
    }
    public static void callme(int i,int n)
    {
        if(i>n) return;
        System.out.println("Aditya");
        callme(i+1,n);
    }
}
