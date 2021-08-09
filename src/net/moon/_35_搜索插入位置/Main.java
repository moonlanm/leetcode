package net.moon._35_搜索插入位置;

import java.util.Arrays;

/**
 * @author moonlan
 * date 2021/4/27 10:56
 */
@SuppressWarnings(value = "unused")
public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().searchInsert2(new int[]{1, 3, 5, 6}, 5));
        System.out.println(new Main().searchInsert2(new int[]{1, 3, 5, 6}, 2));
        System.out.println(new Main().searchInsert2(new int[]{1, 3, 5, 6}, 7));
        System.out.println(new Main().searchInsert2(new int[]{1, 3, 5, 6}, 0));
    }

    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int n = target - nums[i];
            if (n <= 0) {
                return i;
            }
        }

        return nums.length;
    }

    public int searchInsert2(int[] nums, int target) {
        int n = nums.length;
        int left = 0, right = n - 1, ans = n;
        while (left <= right) {
            int mid = ((right - left) >> 1) + left;
            if (target <= nums[mid]) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
