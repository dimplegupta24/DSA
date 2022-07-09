package Arrays.src;

import java.util.Arrays;

/**
 *
 * @author - Dimple Gupta
 *
 * Find Kth smallest element in a given Array in all elements are unique
 * Input  : arr[] = {10, 50, 15, 100, 300, 500}
 *        : k = 3
 * Output : Kth Smallest Element is 50
 *
 *
 * Time Complexity O(n)
 */
public class KthSmallest {

    public int kthElement(int arr[], int k){
        // Sort the Array
        Arrays.sort(arr);

        //Find the Kth Element
        return arr[k-1];
    }

    public static void main(String[] args) {
        KthSmallest kthSmallest = new KthSmallest();
        int arr[] = {10, 50, 15, 100, 300, 500};
        int k = 3;


        System.out.println("Kth Smallest Element is : "+kthSmallest.kthElement(arr,k));
    }
}
