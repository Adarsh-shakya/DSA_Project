
import java.util.Scanner;

public class BinarySearch
{ 
    int arr[];
    int first;
    int last;
    int mid;
    int item;
    
  public BinarySearch()
  {
   arr=new int[]{10,20,30,50,60,80,90,120,140,500};
   first=0;
   last=arr.length;
   mid=(first+last)/2;
  }
  public void Search()
  {
      Scanner sca=new Scanner(System.in);
      System.out.println("Enter the number: ");
      item=sca.nextInt();
      while(item!=arr[mid])
      {
      if(item>arr[mid])
          first=mid;
      else
          last=mid;
      mid=(first+last)/2;
      if(mid==0 || mid==arr.length-1)
      {
        break;
      }
      }
      if(item==arr[mid])
       System.out.println("Number is at index "+mid);
      else
      System.out.println("Number is no present.");
      
  }
  public static void main(String []args)
  {
     BinarySearch obj=new BinarySearch();
     obj.Search();
  }
    
}
