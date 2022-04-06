
public class Marge_sort {
    public void marge(int []arr,int p,int q,int r)
    {
      int n1=q-p+1;
      int n2=r-q;
      int m[]=new int[n1];
      int l[]=new int[n2];
      
      for(int i=0;i<n1;i++)
      {
      m[i]=arr[p+i];
      }
      for(int j=0;j<n2;j++)
      {
      l[j]=arr[q+1+j];   
      }
      
      int i=0;
      int j=0;
      int k=p;
      
      while(i<n1 && j<n2)
      {
       if(m[i]<=l[j])
       {
        arr[k]=m[i];
        i++;
       }
       else
       {
       arr[k]=l[j];
       j++;
       }
       k++;
      }
      
      while(i<n1)
      {
        arr[k]=m[i];
        i++;
        k++;
      }
      while(j<n2)
      {
       arr[k]=l[j];
       j++;
       k++;
      }
    }
    
    public void margeSort(int arr[],int l,int r)
    {if(l<r)
    {
      int m=(l+r)/2;
      
      margeSort(arr,l,m);
      margeSort(arr,m+1,r);
      
      marge(arr,l,m,r);
    }
    }
    
    public void traverse(int arr[],int len){
        for(int i=0;i<len;i++)
        {
        System.out.print(arr[i]+" ");
        }
     
    }
   public static void main(String []arg)
   {
     int arr[] = { 6, 5, 12, 10, 9, 1 };
     Marge_sort obj=new Marge_sort();
     obj.margeSort(arr, 0, arr.length-1);
     
     System.out.println("Sorted  Array");
     obj.traverse(arr, arr.length);
   }
    
}
