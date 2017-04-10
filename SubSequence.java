//Q:Given an array, find the length of the longest consecutive increasing subsequence
//1. what if the subsequence does not have to be consecutive? 
//2. what is the number of longest increasing subsequence (if larger than one)

import java.io.*;
import java.util.*;

class SubSequence
{
    // O(n)
    public static int q11(int[] a)
    {
        Set<Integer> set = new HashSet<Integer>();
        for(int i : a)
        {
            set.add(i);
        }
        
        int subMax = 1;
        for(int i=0;i<a.length;i++)
        {
            if(!set.contains(a[i] - 1))
            {
                int curr_max = 0;
                int curr = a[i];
                while(set.contains(curr))
                {
                    curr_max++;
                    curr++;
                }
                
                subMax = Math.max(curr_max,subMax);
            }
        }
        return subMax;        
    }
    
    //non-consecutive subsequence O(max)
    public static int q1(int[] a)
    {
        Set<Integer> set = new HashSet<Integer>();
        int max = a[0];
        int subMax = 0;
        //O(n)
        for(int i : a)
        {
            max = Math.max(max,i);
            set.add(i);
        }
        
        int curr_max = 0;
        
        //O(max)
        while(max >= 0)
        {
            if(set.contains(max))
            {
                curr_max++;
                max--;
                subMax = Math.max(curr_max,subMax);
            }
            else
            {
                subMax = Math.max(curr_max,subMax);
                curr_max = 0;
                max--;
            }
        }
        return subMax;       
    }
    
    //Q: O(n)
    public static int eff_sub(int[] a)
    {
        int prev = a[0];
        int max = 1;
        int curr_max = 1;
        for(int i=1;i<a.length;i++)
        {
            if(a[i] == prev + 1)
            {
                curr_max++;
                prev = a[i];
            }
            else
            {
                max = Math.max(curr_max,max);
                prev = a[i];
                curr_max = 1;
            }
        }
        return max;
    }
    
    //Q: O(n^2)
    public static int subseq(int[] a)
    {
        int max = 1;
        int curr_max = 1;
        for(int i=0;i<a.length;i++)
        {
            int prev = a[i];
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j] == prev + 1)
                {
                    prev = a[j];
                    curr_max++;
                }
                else
                {
                    max = Math.max(max,curr_max);
                    curr_max = 1;
                }
            }
        }
        
        return max;        
    }
    
    public static void main(String[] args)
    {
        int[] a = {9,1,7,4,6,5,8,1,0,1,7,7,5,0,6,0,1,2,3,4,5,9,7,9,8,4,6,1,4,3,8,5};
        
        for(int i: a)
        {
            System.out.print(i+" : ");
        }
        System.out.println();
        
        System.out.println("Longest Subsequence length: "+q11(a));
    }
}
