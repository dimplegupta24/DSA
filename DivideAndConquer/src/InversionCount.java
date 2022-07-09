package DivideAndConquer.src;

import java.util.Arrays;

public class InversionCount {
    public static int mergeAndCount(int arr[], int left, int mid, int right){
        int left_array[] = Arrays.copyOfRange(arr,left, mid+1);
        int right_array[] = Arrays.copyOfRange(arr,mid+1, right+1);

        int i = 0 , j = 0, k = left, swaps = 0;
        while(i <left_array.length  && j < right_array.length){
            if (left_array[i] <= right_array[j]){
                arr[k++] = left_array[i++];
            }else{
                arr[k++] = right_array[j++];
                swaps += (mid+1)-(left+i);
            }
        }
        while (i < left_array.length)
            arr[k++] = left_array[i++];
        while (j < right_array.length)
            arr[k++] = right_array[j++];
        return swaps;
    }

    private static int mergeSortAndCount(int[] arr, int l, int r)
    {
        int count = 0;
        if (l < r) {
            int m = (l + r) / 2;
            // Left sub array count
            count += mergeSortAndCount(arr, l, m);

            // Right sub array count
            count += mergeSortAndCount(arr, m + 1, r);

            // Merge count
            count += mergeAndCount(arr, l, m, r);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 20, 6, 4, 5 };

        System.out.println(
                mergeSortAndCount(arr, 0, arr.length - 1));
    }
}
