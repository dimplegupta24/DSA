package Sorting.src;

/**
 *
 * @author - Dimple Gupta
 *
 * Sorting an array using Merge Sort
 * Input  : arr[] = {10, 50, 15, 300, 100, 500, 350}
 *
 * Output : {10 15 50 100 300 350 500}
 *
 *
 * Time Complexity O(nlog(n))
 *
 * The Merge Sort algorithm is a sorting algorithm that is considered as an example of the
 * divide and conquer strategy. So, in this algorithm, the array is initially divided into
 * two equal halves and then they are combined in a sorted manner. We can think of it as a
 * recursive algorithm that continuously splits the array in half until it cannot be further divided.
 * This means that if the array becomes empty or has only one element left,
 * the dividing will stop, i.e. it is the base case to stop the recursion.
 * If the array has multiple elements, we split the array into halves and recursively
 * invoke the merge sort on each of the halves. Finally, when both the halves are sorted,
 * the merge operation is applied. Merge operation is the process
 * of taking two smaller sorted arrays and combining them to eventually make a larger one.
 */
public class MergeSort {

    public void merge(int[] arr, int beg, int mid, int end){
        //Size of the arrays
        int left_size = mid - beg + 1;
        int right_size = end - mid;

        //Temporary Arrays
        int left[] = new int[left_size];
        int right[] =  new int[right_size];

        //Adding the elements to array left temp array
        for (int i = 0 ; i < left_size ; i ++){
            left[i] += arr[beg + i];
        }
        //Adding the elements to right temp array
        for (int j = 0; j < right_size; j++){
            right[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = beg;
        //merging of temp arrays
        while(i < left_size && j < right_size){
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            }else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        //Copy remaining elements of Left Sub array, if any
        while(i < left_size){
            arr[k] = left[i];
            i++;
            k++;
        }
        //Copy remaining elements of right Sub array, if any
        while(j < right_size){
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public void sortArray(int arr[], int beg, int end){
       int mid = (beg+end)/2;
        if (beg < end){
            sortArray(arr, beg, mid);
            sortArray(arr, mid+1, end);
            merge(arr,beg,mid,end);
        }
    }
    public void printArray(int arr[]){

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MergeSort mergeSort =  new MergeSort();
        int arr[] = {10, 50, 15, 300, 100, 500, 350};
        System.out.print("Unsorted Array :");
        mergeSort.printArray(arr);
        mergeSort.sortArray(arr, 0, arr.length-1);
        System.out.print("Sorted Array after Merge Sort :");
        mergeSort.printArray(arr);
    }
}
