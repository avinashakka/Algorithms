//Reverse Integer

class ReverseInteger
{
  public static void main (String[] args)
  {
    int n = 1234567891;
    int given = n;
    int revNum = 0;
    int rem = 0;

    while(n > 0)
    {
      rem = n % 10;
      n = n/10;
      revNum = revNum * 10 + rem;
    }
    System.out.println("Given: "+given+" Reversed: "+revNum);

  }
}
