//Given an array of n+1 contiguous  integers with a missing element. Find the missing number.

class MissingInt
{
  public static void main(String[] args)
  {
    int[] a = {4,2,6,7,1,3,9,5};
    int n = 9;

    int actualSum = (n*(n+1))/2;// using conventional maths
    int miss = 1; //using XOR
    for(int i : a)
    {
      miss ^= i;
    }

    System.out.println("Missing Int: "+miss);


  }

}
