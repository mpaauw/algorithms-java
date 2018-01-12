package sort;

/**
 * Contains implementations for the Merge Sort algorithm.
 */
public class MergeSort {
    /**
     * Recursive Merge Sort algorithm implementation.
     * Efficiency: O(n log n), not in-place.
     * @param arr array of elements to be sorted.
     * @param left the left partition of arr.
     * @param right the right partition of arr.
     */
    public void mergeSortRecursive(int[] arr, int left, int right) {
        if(right <= left) {
            return;
        }
        int mid = (left + right) / 2;
        mergeSortRecursive(arr, left, mid); // recurse left partition
        mergeSortRecursive(arr, mid + 1, right); // recurse right partition
        merge(arr, left, right, mid); // sort disassembled partitions
    }

    /**
     * Helper method used within the Merge Sort algorithm.
     * @param arr the array to be merged into.
     * @param left left partition index.
     * @param right right partition index.
     * @param mid midpoint between left and right index partitions.
     */
    public void merge(int[] arr, int left, int right, int mid) {
        int leftCount = (mid + 1) - left;
        int rightCount = right - mid;
        int[] leftArr = new int[leftCount];
        int[] rightArr = new int[rightCount];
        for(int i = 0; i < leftCount; i++) {
            leftArr[i] = arr[left + i];
        }
        for(int i = 0; i < rightCount; i++) {
            rightArr[i] = arr[mid + 1 + i];
        }
        int l = 0, r = 0, iter = left;
        while(l < leftArr.length && r < rightArr.length) {
            if(leftArr[l] < rightArr[r]) {
                arr[iter++] = leftArr[l++];
            }
            else {
                arr[iter++] = rightArr[r++];
            }
        }
        while(l < leftArr.length) {
            arr[iter++] = leftArr[l++];
        }
        while(r < rightArr.length) {
            arr[iter++] = rightArr[r++];
        }
    }
}
