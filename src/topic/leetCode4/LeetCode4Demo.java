package topic.leetCode4;

import util.IntMergeUtil;

public class LeetCode4Demo {

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 4, 6};
        int[] nums2 = {2, 3, 7, 8};

        int[] merged = IntMergeUtil.mergeIntArray(nums1, nums2);
        int length = merged.length;

        if (length % 2 == 1) {
            System.out.println(merged[length / 2]);
        }
        else {
            System.out.println((merged[length / 2 - 1] + merged[length / 2]) / 2.0);
        }
    }
}
