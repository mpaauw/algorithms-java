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
     * @param searchValue value to search for within the array.
     * @return the index of the value if it is found within the array, -1 if not found.
     */
    public Integer binarySearch(int[] sortedInput, int searchValue) {
        int leftIndex = 0, rightIndex = sortedInput.length - 1;
        while(leftIndex <= rightIndex) {
            final int midIndex =  (leftIndex + rightIndex) / 2;
            if(sortedInput[midIndex] == searchValue) {
                return midIndex;
            } else if(sortedInput[midIndex] > searchValue) {
                rightIndex = midIndex - 1;
            } else {
                leftIndex = midIndex + 1;
            }
        }
        return null;
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
    public Integer binarySearchRecursive(int[] sortedInput, int searchValue) {
        return this.binarySearchRecursive(sortedInput, searchValue, 0, sortedInput.length - 1);
    }
    private Integer binarySearchRecursive(int[] sortedInput, int searchValue, int leftIndex, int rightIndex) {
        if(leftIndex > rightIndex) {
            return null;
        }
        final int midIndex = (leftIndex + rightIndex) / 2;
        if(sortedInput[midIndex] == searchValue) {
            return midIndex;
        } else if(sortedInput[midIndex] > searchValue) {
            return binarySearchRecursive(sortedInput, searchValue, leftIndex, midIndex - 1);
        } else {
            return binarySearchRecursive(sortedInput, searchValue, midIndex + 1, rightIndex);
        }
    }

//    public int binarySearchRecursive(int[] sortedArr, int value, int left, int right) {
//        if(left > right) {
//            return -1;
//        }
//        int mid = (left + right) / 2;
//        if(sortedArr[mid] == value) {
//            return mid;
//        }
//        if(sortedArr[mid] < value) {
//            return binarySearchRecursive(sortedArr, value, mid + 1, right);
//        }
//        else {
//            return binarySearchRecursive(sortedArr, value, left, mid - 1);
//        }
//    }
}
