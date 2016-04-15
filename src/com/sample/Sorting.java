package com.sample;

/**
 * Created by sudhakar.vasiraju on 4/4/16.
 */
public class Sorting {

    public static void main(String[] args) {
        int[] nums = new int[] {2,67,4,54,4,76,43,3,7,5,22,8,34,53};
        Sorting s = new Sorting();

        s.sopl("Before sorting: ");
        for (int num:nums){
            s.sop(num+" ");
        }
        s.sopl(" ");

        //s.mergeSort(nums);
        s.quickSort(nums);
        s.sopl("After sorting: ");
        for (int num:nums){
            s.sop(num+" ");
        }
        s.sopl(" ");

    }


    public void quickSort(int[] arr) {
        callQS(arr, 0, arr.length -1);
    }

    public void callQS(int[] arr, int first, int last) {

        int pivot = getPivot(arr, first, last);

        if (first < (pivot - 1) ) {
            callQS(arr, first, pivot - 1);
        }
        if (pivot < last) {
            callQS(arr, pivot, last);
        }
    }

    public int getPivot(int[] arr, int first, int last) {
        int pivotElement = arr[ (first + last) / 2];

        while (first <= last) {
            while (arr[first] < pivotElement) first++;
            while (arr[last] > pivotElement ) last--;

            if (first <= last) {
                swap(arr, first, last);
                first++;
                last--;
            }
        }

        return first;
    }

    public void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public void mergeSort(int[] arr) {
        int[] helper = new int[arr.length];
        callMS(arr, helper, 0, arr.length - 1);
    }

    public void callMS(int[] arr, int[] helper, int first, int last) {

        if (first < last) {
            int mid = (first + last) / 2;
            callMS(arr, helper, first, mid);
            callMS(arr, helper, mid+1, last);
            merge(arr, helper, first, mid, last);
        }
    }

    public void merge(int[] arr, int[] helper, int first, int mid, int last) {

        for (int i=first; i<=last; i++) {
            helper[i] = arr[i];
        }
        int left = first;
        int right = mid+1;
        int current = first;

        while (left <= mid && right <= last) {
            if (helper[left] <= helper[right]) {
                arr[current] = helper[left];
                left++;
            }else{
                arr[current] = helper[right];
                right++;
            }
            current++;
        }

        int leftOverElem = mid - left;

        for (int i=0; i<=leftOverElem; i++){
            arr[current+i] = helper[left+i];
        }
    }



    public void sop (Object o){
        System.out.print(o);
    }

    public void sopl (Object o){
        System.out.println(o);
    }
}
