// Find the rotation distance of a rotated sorted array.
// For example:
//input:4, 5, 6, 1, 2, 3   output:3

class RotationDistance
{
  public static int distance(int[] a,int start,int end)
  {
    if(a[start] > a[end])
    {
      int mid = (end -start) /2;
      if(a[mid] > a[end])
      {
        return distance(a,mid+1,end);
      }
      else
      {
        return distance(a,start,mid-1);
      }
    }
    else
    {
      return start;
    }

  }

  public static void main(String[] args)
  {
    //Read from stdin here
    int[] a = {9,1,2,3,4,5,6,7,8};
    for(int i: a)
    {
      System.out.print(i);
    }
    System.out.println();
    
    System.out.println("Rotation Distance: "+ (distance(a,0,a.length-1)+1));
  }

}
