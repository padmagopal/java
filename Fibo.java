import java.util.*;
public class Fibo
{ public static void main(String args[])
  { int n1=1,n2=1,n3;
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    System.out.print(n1+" "+n2);
    for(int i=2;i<n;i++)
    { n3 = n1 + n2;
      n1=n2;
      n2=n3;
      System.out.print(" "+n3);
    }


  }
}
