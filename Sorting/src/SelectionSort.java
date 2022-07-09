package Sorting.src;

/**
 *
 * @author - Dimple Gupta
 *
 * Sorting an array using Selection Sort
 * Input  : arr[] = {10, 50, 15, 300, 100, 500, 350}
 *
 * Output : {10 15 50 100 300 350 500}
 *
 *
 * Time Complexity O(n^2)
 *
 * The selection sort algorithm sorts an array by repeatedly finding the minimum
 * element (considering ascending order) from unsorted part and putting it at the beginning.
 * The algorithm maintains two subarrays in a given array.
 */
public class SelectionSort {

    public void sortArray(int[] arr) {
        int n = arr.length;

        for (int i = 0 ; i < n-1; i++){
            int minIndex = i;
            for (int j = i+1; j < n; j++){
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

    }
    public void printArray(int arr[]){

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SelectionSort selectionSort =  new SelectionSort();
        int arr[] = {10, 50, 15, 300, 100, 500, 350};
        System.out.print("Unsorted Array :");
        selectionSort.printArray(arr);
        selectionSort.sortArray(arr);
        System.out.print("Sorted Array after Selection Sort :");
        selectionSort.printArray(arr);
    }


}
