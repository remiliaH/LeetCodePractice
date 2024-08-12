package topic.leetCode1;

import java.util.HashMap;
import java.util.Map;

public class LeetCode1Demo {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 4, 5};
        int target = 5;
        new LeetCode1Demo().method(arr, target);
    }

    private void method(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int index = target - arr[i];
            if (map.containsKey(index)) {
                System.out.println(map.get(index) + "," + i);
            }
            map.put(arr[i], i);
        }
    }
}
