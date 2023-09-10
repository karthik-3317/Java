import java.util.*;
public class Rearrange1 {
    public static int maxContiguousSubarray(int[] arr) {
        // Initialize two pointers, left and right, both pointing to the beginning of the array.
        int left = 0;
        int right = 0;
        // Initialize the maximum subarray size to 0.
        int maxSize = 0;
        // While left and right are within the bounds of the array, do the following:
        while (left < arr.length && right < arr.length) {
            // If the difference between the elements at right and left is equal to 1, increment right and update the maximum subarray size.
            if (arr[right] - arr[left] == 1) {
                right++;
                maxSize = Math.max(maxSize, right - left + 1);
            }
            // Otherwise, if the difference is greater than 1, decrement left.
            else if (arr[right] - arr[left] > 1) {
                left++;
            }
            // If the difference is less than 1, increment right.
            else {
                right++;
            }
        }
        // Return the maximum subarray size.
        return maxSize;
    }
    public static void main(String[] args) {
        // Test the function with a sample array.
        int[] arr = {1,3,2,6,5};
        int maxSize = maxContiguousSubarray(arr);
        System.out.println("The size of the largest subarray that can be rearranged to form a contiguous sequence is: " + maxSize);
    }
}
