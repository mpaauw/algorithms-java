package sort;

/**
 * Contains implementations for the Bubble Sort algorithm.
 */
public class BubbleSort {

    /**
     * Bubble Sort algorithm implementation.
     * Efficiency: O(n^2), in-place.
     * @param arr array of elements to be sorted.
     * @return the sorted array.
     */
    public int[] bulbaSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

}
