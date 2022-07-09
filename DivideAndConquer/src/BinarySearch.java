package DivideAndConquer.src;

import Sorting.src.MergeSort;

/**
 *
 * @author - Dimple Gupta
 *
 * Sorting an array using Merge Sort
 * Input: arr[] = {10, 20, 30, 50, 60, 80, 110, 130, 140, 170},
 *         x = 110
 * Output : 6
 *
 *
 * Time Complexity O(log n)
 * Space Complexity O(1)
 *
 * Binary Search is a searching algorithm used in a sorted array by repeatedly dividing
 * the search interval in half. The idea of binary search is to use
 * the information that the array is sorted and reduce the time complexity to O(Log n).
 */

public class BinarySearch {
    public int search(int arr[], int x){
        int left = 0;
        int right = arr.length-1;
        while(left <= right){
            int mid = left + (right-left)/2;
            if (arr[mid] == x){
                return mid;
            }
            if (arr[mid] < x){
                left = mid + 1;
            }else{
                right = mid -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch binarySearch =  new BinarySearch();
        int arr[] = {10, 20, 30, 50, 60, 80, 110, 130, 140, 170};
        int x = 110;
        int result = binarySearch.search(arr, x);
        if (result == -1)
            System.out.println("Element not present in array");
        else
            System.out.println("Element found at "
                    + "index " + result);
    }
}
