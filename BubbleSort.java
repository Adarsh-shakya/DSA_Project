public class BubbleSort {
     int arr[]={2,7,4,10,8,3,50,30,29,25};
     
    public  void sort()
    {
      for( int i=0;i<arr.length;i++)
      {
          for(int j=0;j<arr.length-i-1;j++)
          {
             if(arr[j]>arr[j+1])
             {
              int temp=arr[j];
              arr[j]=arr[j+1];
              arr[j+1]=temp;
             }
          }
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
  BubbleSort obj=new BubbleSort();
  obj.sort();
  obj.traverse();
  }
}
