import java.util.*;
 class DemoThread extends Thread
{ public void run()
  {
    System.out.println("hello in thread class");
    System.out.println("come  continue");
    System.out.println("bye");
   try
  {   for(int i=0;i<5;i++)
     {
       System.out.println("child class"+i);
        Thread.sleep(1000);
     }
  }
catch(Exception e)
{
  System.out.println(e);
}
}}
class MultiThreading
{
  public static void main(String args[])
  {
    DemoThread ob  = new DemoThread();
    ob.start();
    System.out.println("hello");
    try
   {   for(int i=0;i<5;i++)
      {
        System.out.println("main class"+i);
        Thread.sleep(2000);
      }
   }
 catch(Exception e)
 {
   System.out.println(e);
 }
    System.out.println("bye");

  }
}
