//Find all the permutation of a string

class StringPermutation
{
  public static List<String> list = new ArrayList<String>();
  
  public static void permutate(String str, int i, int j)
  {
    if(i == j)
        list.add(str);
    else
    {
      for(int k=i;k<=j;k++)
      {
        str = swapCharacter(str,i,k);
        permutate(str,i+1,j);
        str = swapCharacter(str,i,k);
      }
    }
  }
  
  public static String swapCharacter(String str,int from, int to)
  {
    char[] strs = str.toCharArray();
    char temp = strs[from];
    strs[from] = strs[to];
    strs[to] = temp;
    return String.valueOf(strs);
  }
  
  public static void main(String[] args)
  {
    String example = "abcd";
    permutate(example,0,example.length()-1);
    
    for(String i : list)
    {
      System.out.println(i);
    }
  }
}
