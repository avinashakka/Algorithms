//Bubble Sort

class BubbleSort
{
  public static void main(String[] args)
  {
    int[] a = {5,2,3,8,5,1,7,6,9,10,1,0,65,34,23};
    for(int i : a)
    {
      System.out.print(i+": ");
    }
    System.out.println();

    for(int i=0;i<a.length;i++)
    {
      for(int j=1;j<a.length-i;j++)
      {
        if(a[j] < a[j-1])
        {
          int temp = a[j-1];
          a[j-1] = a[j];
          a[j] = temp;
        }
      }
    }

    for(int i : a)
    {
      System.out.print(i+": ");
    }

  }

}
