package search;

/**
 * Contains implementations for the Linear Search algorithm.
 */
public class LinearSearch {
    /**
     * Linear Search algorithm implementation.
     * Efficiency: O(n)
     * @param arr array of elements to be searched.
     * @param value value to search for within the array.
     * @return the index of the value if it is found within the array, -1 if not found
     */
    public int linearSearch(int[] arr, int value) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Recursive Linear Search algorithm implementation.
     * Stack overflow can occur at heavy load (100000+ stack calls).
     * Efficiency: O(n)
     * @param arr array of elements to be searched.
     * @param value value to search for within the array.
     * @param i variable to track array iteration.
     * @return the index of the value if it is found within the array, -1 if not found.
     */
    public int linearSearchRecursive(int[] arr, int value, int i) {
        if(i > arr.length - 1) {
            return -1;
        }
        if(arr[i] == value) {
            return i;
        }
        return linearSearchRecursive(arr, value, i + 1);
    }
}
