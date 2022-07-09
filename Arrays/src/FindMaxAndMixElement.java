package Arrays.src;

/**
 *
 * @author - Dimple Gupta
 *
 * Find the minimum and maximum element in a given Array
 * Input  : arr[] = {10, 50, 15, 100, 300, 500}
 * Output : Minimum Element is 15
 *          Maxmimum Element is 500
 *
 * Time Complexity O(n)
 */
public class FindMaxAndMixElement {

    static class Pair{
        int min;
        int max;
    }

    public Pair getMinMaxPair(int arr[]){
        int n = arr.length;
        Pair minMax = new Pair();
        if (n == 1){
            minMax.min = arr[0];
            minMax.max = arr[0];
        }

        if (arr[0] > arr[1]){
            minMax.min = arr[1];
            minMax.max = arr[0];
        }else{
            minMax.min = arr[0];
            minMax.max = arr[1];
        }

        for(int i = 2; i < n; i++){
            if (arr[i] < minMax.min){
                minMax.min = arr[i];
            } else if (arr[i] > minMax.max) {
                minMax.max = arr[i];
            }
        }

        return minMax;
    }

    public static void main(String[] args) {
        FindMaxAndMixElement findMaxAndMixElement = new FindMaxAndMixElement();
        int arr[] = {10, 50, 15, 100, 300, 500, 560};
        Pair minMax = findMaxAndMixElement.getMinMaxPair(arr);
        System.out.println("Minimum Value in Array is "+minMax.min);
        System.out.println("Maximum Value in Array is "+minMax.max);
    }
}
