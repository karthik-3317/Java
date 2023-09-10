public class Gcd
{

    public static void main(String[] args) {
    int here = gcd(106,4);
        System.out.println(here);
    }
    public static int gcd(int a,int b){
        if(a == b) return a;
        if(a > b) return gcd(a-b,b);
        else return gcd(a,b-a);
    }

}
