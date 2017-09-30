package pestre.bertrand.partition;

import org.junit.Assert;
import org.junit.Test;

public class PartitionTest {

    private int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8};

    @Test
    public void testValidIntInput() {
        int[][] result = Partition.partition(intArray, 4);
        int[][] expected = {{1, 2, 3, 4}, {5, 6, 7, 8}};

        Assert.assertNotNull(result);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void testValidInputSmallerLastChunk() {
        int[][] result = Partition.partition(intArray, 3);
        int[][] expected = {{1, 2, 3}, {4, 5, 6}, {7, 8}};

        Assert.assertNotNull(result);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void testValidStringInput() {
        String[] stringArray = {"1", "2", "3", "4", "5"};
        String[][] result = Partition.partition(stringArray, 3);
        String[][] expected = {{"1", "2", "3"}, {"4", "5"}};

        Assert.assertNotNull(result);
        Assert.assertArrayEquals(expected, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullArray() {
        Partition.partition((int[]) null, 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIllegalSize() {
        Partition.partition(intArray, -4);
    }
}
