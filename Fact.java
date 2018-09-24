import java.util.*;
class Fact
{
  static int Factorial(int n)
  {if(n==0)
    return 1;
    else
     return (n*Factorial(n-1));

  }
public static void main(String args[])
{  Scanner s = new Scanner(System.in);
  int n = s.nextInt();
   int fact = Factorial(n);
   System.out.println(fact);




}


}
