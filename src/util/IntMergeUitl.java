package util;

/**
 * 合并工具类
 */
public class IntMergeUitl {

    /**
     * 合并整型数组
     * 合并两个有序整型数组为一个有序数组
     * @param nums1 数组1
     * @param nums2 数组2
     * @return 合并后的新数组
     */
    public static int[] mergeIntArray(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;
        int[] merged = new int[m + n];

        //初始化指针
        int i = 0;
        int j = 0;
        int k = 0;

        //重复遍历数组，将最小的依次填入新数组，直到某个数组全部值都填入新数组
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }

        //将另一个剩下数组的全部值添加到末尾
        while (i < m) {
            merged[k++] = nums1[i++];
        }
        while (j < n) {
            merged[k++] = nums2[j++];
        }

        return merged;
    }
}
