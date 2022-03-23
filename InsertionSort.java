
public class InsertionSort 
{
    int arr[]={5,4,10,1,6,2};
    int temp;
    int j,i;
    
    public void sort()
    {
      for(i=1;i<arr.length;i++)
      {
        temp=arr[i];
        j=i-1;
        
        while(j>=0 && arr[j]>temp)
        {
          arr[j+1]=arr[j];
          j--;
        }
        arr[j+1]=temp;
      }
    }
    public void traverse()
    {
      for(int res:arr)
      {
      System.out.print(res+" ");
      }
    }
    public static void main(String []args)
    {
     InsertionSort obj=new InsertionSort();
     obj.sort();
     obj.traverse();
    }
    
}
