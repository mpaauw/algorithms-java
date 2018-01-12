package sort;

/**
 * Contains implementations for the Selection Sort algorithm.
 */
public class SelectionSort {
    /**
     * Selection Sort algorithm implementation.
     * Efficiency: O(n^2), in-place.
     * @param arr array of elements to be sorted.
     * @return the sorted array.
     */
    public int[] selectionSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int min = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }
}
