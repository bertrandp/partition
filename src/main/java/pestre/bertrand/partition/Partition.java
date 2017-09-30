package pestre.bertrand.partition;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * This class contains static methods to split an array into smaller chunks.
 */
public class Partition {

    /**
     * Returns consecutive subarrays of an integer array, each of the same size (the final array may be smaller).
     *
     * @param list the array to return consecutive subarrays of
     * @param size the size of each subarray (the last may be smaller)
     * @return an array of consecutive subarrays
     */
    public static int[][] partition(int[] list, int size) {
        if (list == null) {
            throw new IllegalArgumentException("List cannot be null");
        }
        if (size <= 0) {
            throw new IllegalArgumentException("Size must be superior to 0");
        }

        int[][] subarrays = new int[(int) Math.ceil((double) list.length / size)][];
        int x = 0;
        for (int i = 0; i < list.length; i += size) {
            subarrays[x] = Arrays.copyOfRange(list, i, Math.min(list.length, i + size));
            x++;
        }
        return subarrays;
    }

    /**
     * Returns consecutive subarrays of an array, each of the same size (the final array may be smaller).
     *
     * @param list the array to return consecutive subarrays of
     * @param size the size of each subarray (the last may be smaller)
     * @return an array of consecutive subarrays
     */
    public static <T> T[][] partition(T[] list, int size) {
        if (list == null) {
            throw new IllegalArgumentException("List cannot be null");
        }
        if (size <= 0) {
            throw new IllegalArgumentException("Size must be superior to 0");
        }

        T[][] subarrays = (T[][]) Array.newInstance(list.getClass(), (int) Math.ceil((double) list.length / size));
        int x = 0;
        for (int i = 0; i < list.length; i += size) {
            subarrays[x] = Arrays.copyOfRange(list, i, Math.min(list.length, i + size));
            x++;
        }
        return subarrays;
    }
}