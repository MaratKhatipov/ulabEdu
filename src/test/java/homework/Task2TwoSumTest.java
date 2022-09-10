package homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task2TwoSumTest {

    Task2TwoSum test = new Task2TwoSum();

    @Test
    void whenManySameNumbers() {
        int[] array = {1, 1, 1, 1, 1, 1, 1, 3, 7};
        int[] expected = {3, 7};
        Assertions.assertArrayEquals(expected, test.twoSum(array, 10));
    }

    @Test
    void whenManySameNumbersPrint() {
        int[] array = {1, 1, 1, 1, 1, 1, 1, 3, 7};
        String expected = "[3, 7]";
        Assertions.assertEquals(expected, test.printTwoSum(array, 10));
    }

    @Test()
    void whenExpectedException() {
        int[] array = {1, 1, 1, 1, 1, 1, 1,};
        Assertions.assertThrows(IllegalArgumentException.class, () -> test.twoSum(array, 10));
    }
}