//Given a list of integers, output all subsets of size three, which sum to zero.
import java.io.*;
import java.util.*;

class Subset3
{

//O(n*(n-1)) = O(n^2)
public static void subset3(int[] a)
{
  int given = 24;
  ArrayList<ArrayList<Integer>> subsets = new ArrayList<ArrayList<Integer>>();
  for(int i=1;i<a.length;i++)
  {
    int rem = given - a[i-1];
    int j = i;
    int k = a.length - 1;
    while(j < k)
    {
      int sum = a[j] + a[k];
      if(sum == rem)
      {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        temp.add(a[i-1]);
        temp.add(a[k]);
        temp.add(a[j]);
        subsets.add(temp);
        break;
      }
      else if(sum > rem)
      {
        k--;
      }
      else
      {
        j++;
      }
    }
  }
  System.out.println("Sum given: "+given);
  System.out.println("Total subsets: "+subsets.size());
  for(List<Integer> i : subsets)
  {
    for(Integer k : i)
    {
      System.out.print(k+",");
    }
    System.out.println();
  }

}

public static void main(String[] args)
{
  int[] a = {12, 3, 4, 1, 6, 9};
  Arrays.sort(a); //or any nlog(n) impementation of sorting
  subset3(a);
}
}
