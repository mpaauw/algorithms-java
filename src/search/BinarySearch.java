package search;

/**
 * Contains implementations for the Binary Search algorithm.
 */
public class BinarySearch {
    /**
     * Binary Search algorithm implementation.
     * Array must be sorted prior to search.
     * Efficiency: O(log n)
     * @param sortedArr array of elements to be searched. Must be sorted in order for algorithm to function properly.
     * @param value value to search for within the array.
     * @return the index of the value if it is found within the array, -1 if not found.
     */
    public int binarySearch(int[] sortedArr, int value) {
        int left = 0;
        int right = sortedArr.length - 1;
        while(left <= right) {
            int mid = (left + right) / 2;
            if(sortedArr[mid] == value) {
                return mid;
            }
            if(sortedArr[mid] < value) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return -1;
    }

    /**
     * Recursive Binary Search algorithm implementation.
     * Array must be sorted prior to search.
     * Efficiency: O(log n)
     * @param sortedArr array of elements to be searched. Must be sorted in order for algorithm to function properly.
     * @param value value to search for within the array.
     * @param left value to track left bound of array search values.
     * @param right value to track right bound of array search values.
     * @return the index of the value if it is found within the array, -1 if not found.
     */
    public int binarySearchRecursive(int[] sortedArr, int value, int left, int right) {
        if(left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        if(sortedArr[mid] == value) {
            return mid;
        }
        if(sortedArr[mid] < value) {
            return binarySearchRecursive(sortedArr, value, mid + 1, right);
        }
        else {
            return binarySearchRecursive(sortedArr, value, left, mid - 1);
        }
    }
}
