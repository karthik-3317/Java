import java.util.Scanner;
import java.util.Stack;

public class RStacR {
    static Scanner sc = new Scanner(System.in);
    public static  void main(String[] args){
        Stack<Integer> stk = new Stack<>();
        callme(stk);
    }
    public static void callme(Stack<Integer> stk){
        if(stk.isEmpty()) return;
        int temp = stk.pop();
        callme(stk);
        stk.push(temp);
    }
}
