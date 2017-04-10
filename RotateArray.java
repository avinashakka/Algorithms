//Rotate an array to right n places

class RotateArray
{
public static int[] rotateArray(int[] a,int places)
{
  while(places > 0)
  {
    int prev = a[0];
    for(int i=1;i<a.length;i++)
    {
      int temp = a[i];
      a[i] = prev;
      prev = temp;
    }
    a[0] = prev;
    places--;
  }
  return a;
}

public static void main(String[] args)
{
  int[] a = {1,2,3,4,5};
  int k = 2;

  for(int i : a)
  {
    System.out.print(i+" : ");
  }
  System.out.println();

  a = rotateArray(a,k);

  for(int i : a)
  {
    System.out.print(i+" : ");
  }
  System.out.println();
}
}
