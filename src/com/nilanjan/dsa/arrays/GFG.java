package com.nilanjan.dsa.arrays;// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    
		    int arr[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		    
		    int k=sc.nextInt();
		    Solution ob = new Solution();
		    out.println(ob.kthSmallest(arr, 0, n-1, k));
		}
		out.flush();
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partition(int arr[], int l, int r){
        
        int pivot = arr[r];
        int i = l-1;
        int j = l;
        while(j<r){
            if(arr[j]<pivot){
                i++;
                swap(arr, i, j);
                // j++;
            }
            j++;
        }
        swap(arr, i+1, r);
        return i+1;
    }
    public static void findKthElement(int arr[], int l, int r, int k){
        if(l<r){
            int pi = partition(arr, l, r);
            if(pi<=k){
                findKthElement(arr, pi, r, k);
            }
            else{
                findKthElement(arr, l, pi-1, k);
            }
        }
    }
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        findKthElement(arr, l, r, k);
        return arr[k-1];
    } 
}
