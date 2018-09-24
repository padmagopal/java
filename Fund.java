import java.util.*;
class InsufficientFundsException extends Exception
{
   public InsufficientFundsException(String msg)
   {

    super(msg);
   }


}
class Fund
{

  public static void withdraw(int m,int n)
  { try{
     if(n>m)
    {
      throw new InsufficientFundsException("InsufficientFunds");
    }

  else
  System.out.println("withdrawed");
}
  catch(InsufficientFundsException e)
  {
    System.out.println(e);
  }}
   public static void main(String[] args) { int m=0;
Scanner sc = new Scanner(System.in);


System.out.println("enter the money ");
   int a = sc.nextInt();
m+=a;
System.out.println("enter the money to withdraw");
int n = sc.nextInt();
withdraw(m,n);



}

}
