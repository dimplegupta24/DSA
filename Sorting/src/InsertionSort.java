package Sorting.src;

/**
 *
 * @author - Dimple Gupta
 *
 * Sorting an array using Insertion Sort
 * Input  : arr[] = {10, 50, 15, 300, 100, 500, 350}
 *
 * Output : {10 15 50 100 300 350 500}
 *
 *
 * Time Complexity O(n^2)
 *
 * Insertion sort is a simple sorting algorithm that works similar to the way you sort
 * playing cards in your hands. The array is virtually split into a sorted and an unsorted part.
 * Values from the unsorted part are picked and placed at the correct position in the sorted part.
 */
public class InsertionSort {

    public void sortArray(int arr[]){
        int n = arr.length;

        for (int i = 1 ; i < n; i++){
            int key = arr[i];
            int j =  i - 1;
            while(j >=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }
    public void printArray(int arr[]){

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        InsertionSort insertionSort =  new InsertionSort();
        int arr[] = {10, 50, 15, 300, 100, 500, 350};
        System.out.print("Unsorted Array :");
        insertionSort.printArray(arr);
        insertionSort.sortArray(arr);
        System.out.print("Sorted Array after Insertion Sort :");
        insertionSort.printArray(arr);
    }
}
