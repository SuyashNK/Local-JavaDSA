//Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

// The overall run time complexity should be O(log (m+n)).

import java.util.Arrays;

public class medianArray {

    public static double median(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        if(n==0 && m==0) return 0;

        int[] merged = new int[n + m];
        int k = 0;
        
        for(int i = 0; i < n; i++){
            merged[k++] = nums1[i];
        }
        for(int i = 0; i < m; i++){
            merged[k++] = nums2[i];
        }
        Arrays.sort(merged);

        int totalLength = merged.length;

        if (totalLength % 2 == 1) {
            return (double) merged[totalLength / 2];
        } else{
            int mid1 = merged[(totalLength / 2) - 1];
            int mid2 = merged[totalLength / 2];
            return ((double) mid1 + (double) mid2) / 2;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {};
        int[] nums2 = {};
        System.out.println("Result: " + median(nums1, nums2));
    }
}
