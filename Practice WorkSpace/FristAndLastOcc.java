import java.util.Scanner;

public class FristAndLastOcc {
    public static int first = -1;
    public static int last = -1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        firstandlast(name,name.length()-1,'a');
        System.out.println("The First Occurence is " + last);
        System.out.println("The Last Occurence is " + first);
    }

    public static void firstandlast(String ele,int length,char ch)
    {
        if(length == -1)
        return ;
        
        if(ele.charAt(length) == ch)
        {
            if(first == -1)
            first = length;
            else
            last = length;
        }

        firstandlast(ele, length-1 , ch);
    }
}
