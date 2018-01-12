package sort;

/**
 * Contains implementations for various sorting algorithms.
 */
public class Sort {

    /**
     * Selection Sort algorithm implementation.
     * Efficiency: O(n^2)
     * @param arr array of elements to be sorted.
     * @return the sorted array.
     */
    public int[] selectionSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int min = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < min) {
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
