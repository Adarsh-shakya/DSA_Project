public class Quick_sort
{
int arr[]={3,9,8,5,4,2,1,10,19,13,20};
public int partition(int start,int end)
{
    int pivot=arr[start];
    int i=start;
    int j=end;
 while(i<j)
 {
 while(pivot>=arr[i]  && start<arr.length)   
 {
 i++;
 }
 while(pivot<arr[j])
 {
 j--;
 }
 if(i<j)
 {
 int temp=arr[i];
 arr[i]=arr[j];
 arr[j]=temp;
 }
 }
 int temp=arr[start];
    arr[ start]=arr[j];
     arr[j]=temp;
     return j;
}
public void sort(int start ,int end)
{
 if(start<end)
 {
     int pivot=partition(start,end);
     sort(start,pivot-1);
     sort(pivot+1,end);
 }
}
public void Traverse()
{
    for(int i=0;i<arr.length;i++)
    {
    System.out.print(arr[i]+" ");
    }

}

public static void main(String []args)
{
Quick_sort obj=new Quick_sort();
obj.sort(0, obj.arr.length-1);
obj.Traverse();
}
}
