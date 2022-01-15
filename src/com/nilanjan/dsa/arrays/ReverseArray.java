package com.nilanjan.dsa.arrays;// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- >0)
        {
            String str = read.readLine();
            System.out.println(new ReverseArray().reverseWord(str));
        }
    }
}// } Driver Code Ends


//User function Template for Java


class ReverseArray
{
    // Complete the function
    // str: input string
    
    public static String reverseWord(String str)
    {
        // Reverse the string str
        char ans[] = str.toCharArray();
        int n = str.length();
        for(int i = 0 ; i<n/2 ; i++){
            char temp = ans[i];
            ans[i] = ans[n-1-i];
            ans[n-1-i] = temp;
        }
        String res = new String(ans);
        return res;
    }
}