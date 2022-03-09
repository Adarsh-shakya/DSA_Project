
import java.util.Scanner;

public class linearSearch
{
 int arr[];
 int item;
 int i;
public linearSearch()
{
 arr=new int[]{2,4,5,7,8,9,10,14,56,78,30};
}
public void Search()
{
  Scanner sca =new Scanner(System.in);
  System.out.println("Enter the item for Search: ");
  item=sca.nextInt();
  for(i=0;i<arr.length;i++)
  {
    if(arr[i]==item)
    {
     System.out.println("Item is at Index :"+i);
     break;
    }
  }
  if(i==arr.length)
  {
     System.out.println("Given item is not present.");
  }
}
public static void main(String []args)
{
   linearSearch obj=new linearSearch();
   obj.Search();
}
}
