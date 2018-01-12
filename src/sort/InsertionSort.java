package sort;

/**
 * Contains implementations for the Insertion Sort algorithm.
 */
public class InsertionSort {
    /**
     * Insertion Sort algorithm implementation.
     * Efficiency: O(n^2), in-place.
     * @param arr array of elements to be sorted.
     * @return the sorted array.
     */
    public int[] insertionSort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int j = i;
            while(j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
        return arr;
    }
}
