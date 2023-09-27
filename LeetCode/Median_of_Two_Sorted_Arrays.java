
/**
 * <a href="https://leetcode.com/problems/median-of-two-sorted-arrays/">Problem link</a>
 * **/

public class Median_of_Two_Sorted_Arrays {
    class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int m = nums1.length, n = nums2.length;
            if (m > n)
                return findMedianSortedArrays(nums2, nums1);
            int i = 0, j = m;
            int half = (m + n + 1) / 2;
            int l1, l2, r1, r2;
            while(i <= j) {
                int mid1 = (i + j) / 2;
                int mid2 = half - mid1;
                l1 = Integer.MIN_VALUE;
                l2 = Integer.MIN_VALUE;
                r1 = Integer.MAX_VALUE;
                r2 = Integer.MAX_VALUE;
                if (mid1 < m)
                    r1 = nums1[mid1];
                if (mid2 < n)
                    r2 = nums2[mid2];
                if (mid1 - 1 >= 0)
                    l1 = nums1[mid1 - 1];
                if (mid2 - 1 >= 0)
                    l2 = nums2[mid2 - 1];
                if (l1 <= r2 && l2 <= r1)
                    if ((m + n) % 2 == 1)
                        return Math.max(l1, l2);
                    else
                        return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
                else if (l1 > r2)
                    j = mid1 - 1;
                else
                    i = mid1 + 1;
            }
            return 0;
        }
    }
}
