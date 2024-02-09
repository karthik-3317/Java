import java.util.Scanner;

public class SumOfFirstNnumbers {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        callmeParameterized(0,sc.nextInt(),0);
        System.out.println(callmeFunctional(sc.nextInt()));
    }
    public static void callmeParameterized(int i,int size,int sum)
    {
        if(i > size)
        {
            System.out.println(sum);
            return;
        }
        sum += i;
        callmeParameterized(i+1,size,sum);
    }

    public static int callmeFunctional(int n)
    {
        if(n==0)
            return 0;
        return n+callmeFunctional(n-1);
    }

}
