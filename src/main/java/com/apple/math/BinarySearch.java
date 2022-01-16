package com.apple.math;

public class BinarySearch {
    public static int bsearch(int[] a, int n, int value) {
        int low = 0;
        int high = n - 1;
        // 注意是 low<=high，而不是 low
        while (low <= high) {
            //  int mid = (low + high) / 2; // 因为如果 low 和 high 比较大的话，两者之和就有可能会溢出
            //  int mid = low + (high - low) / 2;
            int mid = low + ((high - low) >> 1);
            if (a[mid] == value) {
                return mid;
            } else if (a[mid] < value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    // 二分查找的递归实现
    public int bsearch2(int[] a, int n, int val) {
        return bsearchInternally(a, 0, n - 1, val);
    }

    private int bsearchInternally(int[] a, int low, int high, int value) {
        if (low > high) return -1;

        int mid =  low + ((high - low) >> 1);
        if (a[mid] == value) {
            return mid;
        } else if (a[mid] < value) {
            return bsearchInternally(a, mid+1, high, value);
        } else {
            return bsearchInternally(a, low, mid-1, value);
        }
    }
}