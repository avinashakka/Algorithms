//Given a Array return 'true' if any two distinct elements sum to N and 'false' if not.

import java.io.*;
import java.util.*;

class TwoSum
{
  public static boolean TSPossible(int[] a,int sum)
  {
    HashMap<Integer,Integer> set = new HashMap<Integer,Integer>();

    for(int i=0;i<a.length;i++)
    {
      int temp = a[i];
      if(set.containsKey(sum - temp))
      {
        return true;
      }
      else
      {
        set.put(temp,i);
      }
    }
    return false;
  }

  public static void main(String[] args)
  {
    int[] a = {1,2,3,4,5,6,7,8,9,12,3,4,5,6,7,8,0};
    int N = 1;

    System.out.println("Given Array");
    for(int i : a)
    {
      System.out.print(i+":");
    }
    System.out.println();
    System.out.println("Given SUM: "+N);
    System.out.println("Two Sum Possible? :"+ TSPossible(a,N));
  }
}
