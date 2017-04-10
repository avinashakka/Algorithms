//Given a amtrix as a 2D Array, rotate it 90 degrees and print.
/*
Ex: [0,1,2,3]
    [4,5,6,7]
    [8,9,10,11]
    [12,13,14,15]

becomes

  [12,8,4,0]
  [13,9,5,1]
  [14,10,6,2]
  [15,11,7,3]

*/

class RotateMatrix
{
  public static void main(String[] args)
  {
    int[][] a = {{0,1,2,3},{4,5,6,7},{8,9,10,11},{12,13,14,15}};
    int rotateFactor = 2;

    for(int i=0;i<a.length;i++)
    {
      for(int j=0;j<a[0].length;j++)
      {
        System.out.print(a[i][j]+" ");
      }
      System.out.println();
    }

System.out.println();
int[][] b = new int[a.length][a[0].length];

    //rotateFactor = 1 ===> 90 degrees
    System.out.println("Rotation: 90 degrees");
    for(int j=0;j<a[0].length;j++)
    {
      for(int i=a.length-1;i>=0;i--)
      {
        b[j][i] = a[i][j];
        System.out.print(b[j][i]+" ");
      }
      System.out.println();
    }

    System.out.println("Rotation: 180 degrees");
    //rotateFactor = 2 ===> 180degrees
    for(int j=a[0].length-1;j>=0;j--)
    {
      for(int i=a.length-1;i>=0;i--)
      {
        System.out.print(a[j][i]+" ");
      }
      System.out.println();
    }

    System.out.println("Rotation: 270 degrees");
    //rotateFactor = 3 ===> 270 degrees
    for(int j=a[0].length-1;j>=0;j--)
    {
      for(int i=0;i<a.length;i++)
      {
        System.out.print(a[i][j]+" ");
      }
      System.out.println();
    }
  }
}
