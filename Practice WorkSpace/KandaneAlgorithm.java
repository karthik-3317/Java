public class KandaneAlgorithm {
    public static void main(String[] args) {
        int arr[]={5,4,7,-100};
        kadane(arr);
    }
    public static void kadane(int arr[])
    {
        int n = arr.length;
        int currentSum = 0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            currentSum +=arr[i];
            maxSum = Math.max(currentSum,maxSum);
            currentSum = Math.max(currentSum,0);
        }
        System.out.println(maxSum);
    }

}
