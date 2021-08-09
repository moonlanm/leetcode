package net.moon._88_合并两个有序数组;

import java.util.Arrays;

/**
 * @author moonlan
 * date 2021/5/22 15:57
 */
@SuppressWarnings(value = "unused")
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        //int[] n1 = {1, 2, 3, 0, 0, 0};
        //int[] n2 = {2, 5, 6};
        int[] n1 = {0};
        int[] n2 = {1};
        main.merge2(n1, 0, n2, n2.length);
        System.out.println(Arrays.toString(n1));
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int m1 = 0;
        int n1 = 0;
        int index = 0;
        int[] ret = new int[m + n];
        while (m1 < m && n1 < n) {
            if (nums1[m1] < nums2[n1]) {
                ret[index++] = nums1[m1++];
            } else {
                ret[index++] = nums2[n1++];
            }
        }

        if (m1 < m) {
            for (int i = m1; i < m; i++) {
                ret[index++] = nums1[i];
            }
        }

        if (n1 < n) {
            for (int i = n1; i < n; i++) {
                ret[index++] = nums2[i];
            }
        }

        System.arraycopy(ret, 0, nums1, 0, nums1.length);
    }

    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        int m1 = m -1;
        int n1 = n - 1;
        int end = m + n - 1;
        while (m1 >= 0 && n1 >= 0) {
            if (nums1[m1] >= nums2[n1]) {
                nums1[end--] = nums1[m1--];
            } else {
                nums1[end--] = nums2[n1--];
            }
        }

        if (m1 >= 0) {
            for (int i = m1; i >= 0; i--) {
                nums1[end--] = nums1[i];
            }
        }

        if (n1 >= 0) {
            for (int i = n1; i >= 0; i--) {
                nums1[end--] = nums2[i];
            }
        }
    }
}
