//Q: Given a list of words for example : cat,bat,rat.... and given a query which has a special character '.' which can be
//represented as any alphabet between 'a-z'. Write a function which gives true as output if the the query is in the list of words.
//Example: List of words: cat,bat,rat,cct,cut Query 1: c.t Output 1 : true Query 2: c.. output 2…

import java.io.*;
import java.util.*;

class FindWord
{
  public static void main(String[] args)
  {
    String[] list = {"cat","bat","cct","cut"};
    String query = "..t";
    query = query.replace(".","[a-z]{1}");
    for(String str : list)
    {
      if(str.matches(query))
      {
        System.out.println("True");
        System.exit(0);
      }
    }
    System.out.println("False");
  }
}
