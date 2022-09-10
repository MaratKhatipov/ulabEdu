package homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task2TwoSum {
    public int[] twoSum(int[] nums, int target) throws IllegalArgumentException {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("массив должен быть заполнен");
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int requiredNumber = target - nums[i];
            if (map.containsKey(requiredNumber) && map.get(requiredNumber) != i) {
                return new int[]{nums[i], nums[map.get(requiredNumber)]};
            }
        }
        throw new IllegalArgumentException("нет решения");
    }

    public String printTwoSum(int[] nums, int target) {
        int[] printArray = twoSum(nums, target);
        return String.format("[%d, %d]", printArray[0], printArray[1]);
    }

    public static void main(String[] args) {
        int[] nums = {};
        Task2TwoSum test = new Task2TwoSum();
        System.out.println(Arrays.toString(test.twoSum(nums, 10)));
        System.out.println(test.printTwoSum(nums, 10));
    }
}
