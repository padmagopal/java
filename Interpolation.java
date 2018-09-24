import java.util.*;
class Interpolation
{
  public static void main(String args[])
  { Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int[] a = new int[15];
    for(int i=0;i<n;i++)
    {
      a[i]=s.nextInt();

    }
System.out.println("number to be seached");
int val = s.nextInt();
int mid ;
int low =0;
int high = n-1;
while(low<=high)
{
 mid = low + (high-low)*((val - a[low])/(a[high]-a[low]));
 if(val==a[mid])
 {System.out.println(mid);
 break;}
 else if(val>mid)
    low = mid+1;
  else
   high = mid-1;
}

  }
}
