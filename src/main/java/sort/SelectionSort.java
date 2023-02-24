package sort;

/**
 * Contains implementations for the Selection Sort algorithm.
 */
public class SelectionSort {

    /**
     * Selection Sort algorithm implementation.
     * Efficiency: O(n^2), in-place.
     * @param input array to sort
     * @param ascending flag indicating sort order should ascend or descend.
     * @return sorted input array.
     */
    public int[] selectionSort(int[] input, boolean ascending) {
        return (ascending)
                ? selectionSortAscending(input)
                : selectionSortDescending(input);
    }
    private int[] selectionSortAscending(int[] input) {
        for(int i = 0; i < input.length; i++) {
            int minIndex = i;
            for(int j = i + 1; j < input.length; j++) {
                if(input[j] <= input[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = input[minIndex];
            input[minIndex] = input[i];
            input[i] = temp;
        }
        return input;
    }

    private int[] selectionSortDescending(int[] input) {
        for(int i = 0; i < input.length; i++) {
            int maxIndex = i;
            for(int j = i + 1; j < input.length; j++) {
                if(input[j] >= input[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = input[maxIndex];
            input[maxIndex] = input[i];
            input[i] = temp;
        }
        return input;
    }
}
