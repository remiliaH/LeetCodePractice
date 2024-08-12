package util;

/**
 * 查找工具类
 */
public class IntSearchUtil {

    /**
     * 二分查找法
     * 查找有序整型数组某个值的索引
     * @param arr 目标数组
     * @param target 查找的值
     * @return 目标值的索引
     */
    public static int intBinarySearch(int[] arr, int target) {

        int left = 0;
        int right = arr.length;

        while (left < right) {
            int middle = (left + right) >>> 1;
            if (target < arr[middle]) {
                right = middle;
            }
            else if (target > arr[middle]) {
                left = middle + 1;
            }
            else {
                return middle;
            }
        }
        return -1;
    }
}
