package inlab;
import java.io.*;
public class inlab2 {
  
    static int countMinSteps(int arr[], int N)
    {
    
      int val = 0;
      int mx = Integer.MIN_VALUE;
      for (int i = 0; i < N; i++) {

        int curr = arr[i];
        mx = Math.max(mx, curr);
        val = Math.max(val, mx - curr);
      }

      long res = 0;
      while ((1 << res) - 1 < val) {
        ++res;
      }
      return (int)res;
    }
    public static void main(String[] args)
    {
    
      // Given input
      int arr[] = {5,3,4,4,7,3,6,11,8,5,11};
      int N = arr.length;

      // Function call
      System.out.println(countMinSteps(arr, N));
    
    }
  }