package com.nilanjan.dsa.string;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KMP {
    public static void generateLPS(String str, int lps[]){
        int len = 0;
        lps[0] = 0;
        int i = 1;
        while(i<str.length()){
            if(str.charAt(i) == str.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }
            else{
                if(len!=0){
                    len = lps[len-1];
                }
                else{
                    lps[len] = 0;
                    i++;
                }
            }
        }
    }
    public static ArrayList<ArrayList<Integer>> isMatch(String txt, String pat, int lps[]){
        int i = 0, j = 0, n = txt.length(), m = pat.length();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        while(i<n){
            if(txt.charAt(i) == pat.charAt(j)){
                i++;
                j++;
            }
            else{
                if(j != 0){
                    j = lps[j-1];
                }
                else{
                    i++;
                }
            }
            if(j == m){
                ans.add(new ArrayList<>(Arrays.asList(i-j,i-1)));
                j = lps[j-1];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String pat = "AABAA";
        String txt = "AAXAACAAAABAAZJFNKAABAA";
        int lps[] = new int[pat.length()];
        generateLPS(pat,lps);
        System.out.println(Arrays.toString(lps));
        System.out.println(isMatch(txt, pat, lps));
    }
}
