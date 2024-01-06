import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int[] a= new int[26];
        for( int i = 0; i < 26; i++)
        {
            a[i] = -1;
        }
        removedup(name,0,a);
    }
    public static void removedup(String name,int len,int[] a)
    {
        if( len == name.length())
        {
            return;
        }
        
        if(a[(int)name.charAt(len) - 'a'] == -1){
            System.out.print(name.charAt(len));
            a[(int)name.charAt(len) - 'a'] = 1;
        }

        removedup(name, len + 1, a);
    }
}
