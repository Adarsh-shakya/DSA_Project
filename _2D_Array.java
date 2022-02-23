
import java.util.Scanner;


public class _2D_Array
{
int arr[][];
int result_arr[];
_2D_Array()
{
  arr=new int[5][5];
  result_arr=new int[5];
}
public void insert()
{
 Scanner sca=new Scanner(System.in);
        
for(int i=0;i<5;i++)
{
    System.out.println("Enter the row of array with 5 element: ");
 for(int j=0;j<5;j++)
 {
     arr[i][j]=sca.nextInt();
 }
}
System.out.println("Data inserted.");
}
public void Cal_Diff_sum()
{
    int rowSum;
    int colSum;
for(int i=0;i<5;i++)
{
  rowSum=0;
  colSum=0;
  for(int j=0;j<5;j++)
  {
  rowSum+=arr[i][j];
  colSum+=arr[j][i];
  }
  result_arr[i]=rowSum-colSum;
}
}
public void Traverse()
{
  for(int res:result_arr)
  {
    System.out.print(res+" ");
  }
}
public static void main(String []args)
{
   _2D_Array obj=new _2D_Array();
   obj.insert();
   obj.Cal_Diff_sum();
   obj.Traverse();
}
}
