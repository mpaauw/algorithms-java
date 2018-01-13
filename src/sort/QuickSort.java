package sort;

/**
 * Contains implementations for the Quick Sort algorithm.
 */
public class QuickSort {

    /**
     * Recursive Quick Sort algorithm implementation.
     * Efficiency: O(n^2), in-place.
     * @param arr array of elements to be sorted.
     * @param left left bound index.
     * @param right right bound index.
     */
    public void quickSortRecursive(int[] arr, int left, int right) {
        if(right <= left) {
            return;
        }
        int p = partition(arr, left, right);
        quickSortRecursive(arr, left, p - 1);
        quickSortRecursive(arr, p + 1, right);
    }

    /**
     * Method used for obtaining a pivot index.
     * Used in conjunction with quickSortRecursive().
     * @param arr array of elements to be sorted.
     * @param left left bound index.
     * @param right right bound index.
     * @return
     */
    public int partition(int[] arr, int left, int right) {
        int l = left - 1, r = 0;
        for(r = left; r < right; r++) {
            if(arr[r] <= arr[right]) {
                l++;
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
            }
        }
        l++;
        int temp = arr[l];
        arr[l] = arr[right];
        arr[right] = temp;
        return l;
    }

}
