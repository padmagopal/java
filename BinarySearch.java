import java.util.*;
class BinarySearch
{
   public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     int n = s.nextInt();
     int[] a = new int[40];
     for(int i=0;i<n;i++)
     {
       a[i]=s.nextInt();
     }

int num;
System.out.println("enter the number to be saerched");
num = s.nextInt();
int beg =0;
int end = n-1;
int mid;
int found=0;
while(beg<=end)
{ mid = (beg+end)/2;
  if(a[mid]==num)
  {
     System.out.println("the position is"+num +" " +mid);
    found =1;
    break;
      }
  else if(mid>num)
    end = mid-1;
  else
   beg = mid+1;
}
if(found==0)
{
  System.out.println("error not found");
}

}




}
