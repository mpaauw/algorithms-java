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

    /**
     * Insertion Sort algorithm implementation.
     * Efficiency: O(n^2)
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
