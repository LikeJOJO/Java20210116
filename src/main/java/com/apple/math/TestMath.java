package com.apple.math;

public class TestMath {
    public static void main(String[] args) {
//        int[] arrs = {1, 5, 7, 9, 13, 14, 18, 20};
//        System.out.println(BinarySearch.bsearch(arrs, arrs.length, 5));

        int[] arrs = {7, 9, 3, 5, 10, 0, 1};
        QuickSort.quickSort(arrs, 0, arrs.length - 1);
        for (int i : arrs) {
            System.out.println(i);
        }
    }
}
