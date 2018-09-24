import java.util.*;
public class Fibor
{  static int n1=1,n2=1;
  static void fibonacci(int count)
  {  int n3;
     if(count>0)
     { n3 = n1 +n2;
       n1=n2;
       n2=n3;
System.out.print(" " + n3);
fibonacci(count-1); }
}
public static void main(String args[])
{Scanner s = new Scanner(System.in);
  int count = s.nextInt();
System.out.print(n1 +" "+n2 );
  fibonacci(count-2);




}
}
