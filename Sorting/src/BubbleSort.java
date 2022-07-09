/**
 *
 * @author - Dimple Gupta
 *
 * Sorting an array using Bubble Sort
 * Input  : arr[] = {10, 50, 15, 300, 100, 500, 350}
 *
 * Output : {10 15 50 100 300 350 500}
 *
 *
 * Time Complexity O(n^2)
 *
 * Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping
 * the adjacent elements if they are in the wrong order. This algorithm is not suitable
 * for large data sets as its average and worst case time complexity is quite high.
 */
public class BubbleSort {

    public void sortArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++){
            for (int j = i+1; j < n-i-1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public void printArray(int arr[]){

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort =  new BubbleSort();
        int arr[] = {10, 50, 15, 300, 100, 500, 350};
        System.out.print("Unsorted Array :");
        bubbleSort.printArray(arr);
        bubbleSort.sortArray(arr);
        System.out.print("Sorted Array after Bubble Sort:");
        bubbleSort.printArray(arr);
    }

}
