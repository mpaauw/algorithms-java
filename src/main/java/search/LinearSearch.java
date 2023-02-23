package search;

/**
 * Contains implementations for the Linear Search algorithm.
 */
public class LinearSearch {
    /**
     * Linear Search algorithm implementation.
     * Efficiency: O(n)
     * @param input array of elements to be searched; does not need to be sorted.
     * @param searchValue value to search for within the array.
     * @return the index of the value if it is found within the array, null if not found
     */
    public Integer linearSearch(int[] input, int searchValue) {
        for(int i = 0; i < input.length; i++) {
            if(input[i] == searchValue) {
                return i;
            }
        }
        return null;
    }

    /**
     * Recursive Linear Search algorithm implementation.
     * Efficiency: O(n)
     * @param input array of elements to be searched; does not need to be sorted
     * @param searchValue value to search for within the array.
     * @return the index of the value if it is found within the array, null if not found.
     */
    public Integer linearSearchRecursive(int[] input, int searchValue) {
        return this.linearSearchRecursive(
                input,
                searchValue,
                0
        );
    }
    private Integer linearSearchRecursive(
            int[] input,
            int searchValue,
            int index) {
        if(index >= input.length) {
            return null;
        }
        if(input[index] == searchValue) {
            return input[index];
        } else {
            return linearSearchRecursive(
                    input,
                    searchValue,
                    index + 1
            );
        }
    }
}
