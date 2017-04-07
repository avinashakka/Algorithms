//Given a string str1, order the input string str2 as per str1's order.
//Example: str1="zstuvba" str2="azv" output:"zva"

import java.io.*;
import java.util.*;

class OrderString
{
  private String s1;
  private String s2;

  private String order()
  {
    Map<Character,Integer> map = new HashMap<Character,Integer>();
    int[] a = new int[this.s2.length()];

    for(int i=0;i<this.s1.length();i++)
    {
      map.put(this.s1.charAt(i),i);
    }

    for(int i=0;i<this.s2.length();i++)
    {
        a[i] = map.get(this.s2.charAt(i));
    }

    Arrays.sort(a);//merge sort if needed

    StringBuilder sb = new StringBuilder();

    for(int i=0;i<a.length;i++)
    {
      sb.append(this.s1.charAt(a[i]));
    }

    return sb.toString();

  }

  public static void main(String[] args)
  {
    OrderString os = new OrderString();
    os.s1 = "zwtsuql";
    os.s2 = "utz";

    System.out.println("Order String: "+ os.s1);
    System.out.println("Input String: "+ os.s2);
    System.out.println("Output String: "+ os.order());
  }

}
