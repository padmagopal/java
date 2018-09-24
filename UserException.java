import java.util.*;
class InvalidRadius extends Exception
{
  public InvalidRadius(String msg)
  {
    super(msg);
  }

}
public class UserException
{
void CreateCircle(int radius)
{
  if(radius<0)
  {
    throw new InvalidRadius("radius is less than zero");

  }
else
System.out.println("circle created");

}
  public static void main(String args[])
  {
        UserException ob  = new UserException();
        try{
          ob.CreateCircle(0);
        }
        catch(InvalidRadius e)
        {
          System.out.println(e);
        }

  }
}
