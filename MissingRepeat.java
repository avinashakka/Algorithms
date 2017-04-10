//Given an array consisting of N contiguous elements unsorted, with a repeated integer. Find the missing and the repeated numbers.
import java.io.*;
import java.util.*;

class MissingRepeat
{
  public static void main(String[] args)
  {
      int[] a = {1,1,2,3,4,5,6,7,8,9};

      int N = a.length;
      int actualSum = (N*(N+1))/2;
      int missing = actualSum;
      int repeated = 0;
      HashSet<Integer> set = new HashSet(); // can use a set to keep track of elements

      boolean[] contain = new boolean[a.length+1]; //or can use an array


      //Uses an additional data structure

      for(int j=0;j<contain.length;j++)
        {
          contain[j] = false;
        }

      for(int i : a)
      {
        if(contain[i])
        {
            repeated = i;
        }
        else
        {
            missing -= i;
            contain[i] = true;
        }
      }
      

      System.out.println("Missing: "+missing+" Repeated: "+repeated);
  }

}
