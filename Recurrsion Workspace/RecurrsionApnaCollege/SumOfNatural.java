public class SumOfNatural {
    public static void main(String[] args) {
        sumOfNaturalNumbers(0, 10, 0);
    }
    public static void sumOfNaturalNumbers(int i,int n,int sum)
    {
        if( i == n )
        {
            sum += i;
            System.out.println("The Sum of " + n +" is "+ sum);
            return;
        }
        sum += i;
        sumOfNaturalNumbers(i+1, n, sum);
        sum -= i;
        if(i == 0)
        System.out.println("The Sum When Return Back " + sum);
    }
}
