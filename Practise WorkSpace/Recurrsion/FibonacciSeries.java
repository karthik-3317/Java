public class FibonacciSeries {
        public static void main(String[] args) {
            fibonacci(0, 1,7);
        }
        public static void fibonacci(int a,int b,int n)
        {
            if(n == 0)
            return ;
            int c = a + b;
            System.out.println(c);
            fibonacci(b, c, n-1);
        }
}
