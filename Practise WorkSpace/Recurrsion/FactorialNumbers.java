public class FactorialNumbers {
    public static void main(String[] args) {
        int n = 5;
        int value =  factorialNumbers(n);
        System.out.println(value);
        
    }
    public static int  factorialNumbers(int n)
    {
        if(n == 0 || n == 1)
        {
        return 1;
        }
       System.out.println(n);
       return n * factorialNumbers(n-1);
    }
}
