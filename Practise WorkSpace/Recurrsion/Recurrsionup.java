public class Recurrsionup {
    public static void main(String [] args)
    {
        int n = 1;
        printUpNumb(n);
    }
    public static void printUpNumb(int n)
    {
        if(n > 5)
        return;
        System.out.println("The Current Step of iteration is " + n);
        printUpNumb(n+1);
    }
}
