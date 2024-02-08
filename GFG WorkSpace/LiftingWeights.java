import java.util.*;
public class LiftingWeights {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size =sc.nextInt();
        int maxCapacity = sc.nextInt();
        int weights[] = new int[size];
        for(int i=0;i<size;i++){
            weights[i]= sc.nextInt();
        }
        int currentSum = 0;
        for(int i=0;i<size;i++){
            currentSum +=weights[i];
            if(currentSum>=maxCapacity){
                break;
            }

        }
    }
}
