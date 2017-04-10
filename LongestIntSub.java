//Given a array of N integers, find the longest subsequence in the array of contiguous numbers.
import java.io.*;
import java.util.*;

class LongestIntSub
{
  public static int findLong(int[] a)
  {
    int curr = 0;
    int prev = 0;
    int next = 0;
    int longseq = 1;
    int maxseq = 1;
    int counter = 0;
    for(int i=1;i<a.length;i++)
    {
      curr = a[i];
      prev = a[i-1];

      if(curr - prev == 1)
      {
        longseq++;
        maxseq = Math.max(longseq,maxseq);
      }
      else
      {
        maxseq = Math.max(longseq,maxseq);
        longseq = 1;
      }
    }
    return maxseq;
  }

  public static void main(String[] args)
  {
    int[] a = {1, 56, 58, 57, 90, 92, 94, 93, 91, 45};

    System.out.println("Length of longest contiguous subsequence: "+findLong(a));

  }

}
