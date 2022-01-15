package com.nilanjan.dsa.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partion(int arr[], int l, int r){
        int i = l-1;
        int j = l;
        int pivot = arr[r];
        while(j<r){
            if(arr[j]<pivot){
                i++;
                swap(arr, i, j);
            }
            j++;
        }
        swap(arr, i+1, r);
        return i+1;
    }
    public static void quickSort(int arr[], int l, int r){
        if(l<r){
            int pi = partion(arr, l, r);
            quickSort(arr, l, pi-1);
            quickSort(arr, pi+1, r);

        }

    }

    public static void main(String[] args) {
        int arr[] = {5,1,4,2,3};
        int n = arr.length;
        System.out.println("Before Sorting: "+ Arrays.toString(arr));
        quickSort(arr, 0, n-1);
        System.out.println("After Sorting: "+ Arrays.toString(arr));

    }
}
