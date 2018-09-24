import java.lang.*;
import java.util.*;
class LessThanZero extends Exception

{
public LessThanZero(String msg)
{
  super(msg);
}

}
public class Quad
 { public static void Result(int b,int a,int c)
   {    int val = b*b - 4*a*c;
double res=0;

  try{  if(val<0)
    {
      throw new LessThanZero("b2-4ac less than zero");
}
else
 { res = -b + Math.sqrt(val)/2*a;
   System.out.println("the real soultion are" +res +"and " + -1*res);}
  }
   catch(LessThanZero e)
   {
     System.out.println(e);
   }
 }

    public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int b,a,c;
System.out.println("enter the x^2,x,c of b,a,c");
b=s.nextInt();
a=s.nextInt();
c=s.nextInt();
Result(b,a,c);



}



}
