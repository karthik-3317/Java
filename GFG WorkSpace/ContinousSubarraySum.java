import java.util.Arrays;
import java.util.Scanner;

public class ContinousSubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int currentSum = 0;
        int currentMax = 0;
        int left = 0;
        int result[] = new int[2];
        for(int i=0;i<arr.length;i++){
            currentSum += arr[i];
            if(currentSum > currentMax){
            currentMax = Math.max(currentSum,currentMax);
                result[0]=left;
                result[1]=i;
            }
            if(currentSum<0){
                currentSum = 0;
                left = i+1;
            }
        }
//        return Arrays.asList(result); use this in lintcode
    }
}
