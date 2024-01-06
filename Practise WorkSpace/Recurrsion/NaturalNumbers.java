public class NaturalNumbers {
    public static void main(String[] args) {
        int n = 100;
        // naturalNumberPrint(n);
        naturalNumberSum(1,n,0);
    }
    public static void naturalNumberPrint(int n)
    {
        if(n == 60)
        return;

        System.out.println("The Current Iteration of function calling itself is " + n);
        naturalNumberPrint(n+1);
    }
    public static void naturalNumberSum(int i,int n,int sum)
    {
        
        if(i == n)
        {
            sum+=i;
            System.out.println(sum);
            return;
        }

        sum +=i;
        naturalNumberSum(i+1,n,sum);
        
    }
}
