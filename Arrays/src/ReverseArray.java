/**
 *
 * @author - Dimple Gupta
 *
 * Reverse a given Array
 * Input  : arr[] = {1,2,3,4,5,6,7,8}
 * Output : arr[] = {8 7 6 5 4 3 2 1 }
 *
 * Time Complexity O(n)
 */
public class ReverseArray{

    public void arrayReverse(int arr[], int start, int end){
        while (start < end){
            int temp =  arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        ReverseArray reverseArray = new ReverseArray();
        reverseArray.arrayReverse(arr,0,arr.length-1);
        reverseArray.printArray(arr);
    }
}