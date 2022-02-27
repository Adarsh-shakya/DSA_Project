
import java.util.Scanner;

public class LinearQueueArray {
    int frant;
    int rear;
    int arr[];
    public LinearQueueArray()
    {
     frant=-1;
     rear=-1;
     arr=new int[5];
    }
  public static void main(String []args)
  {
    LinearQueueArray obj=new LinearQueueArray();
    Scanner sca=new Scanner(System.in);
    while(true)
      {
       System.out.println("\nPress 1 for Enqueue");
       System.out.println("Press 2 for Dequeue");
       System.out.println("Press 3 for Traverse");
       System.out.println("Press 4 for Exit");
       
       System.out.println("Enter your choice ");
       int choice=sca.nextInt();
       switch(choice)
       {
           case 1:
           {
              obj.Enqueue();
              break;
           }
           case 2:
           {
              obj.Dequeue();
              break;
           }
           case 3:
           {
            obj.Traverse();  
              break;
           }
           case 4:
           {
              System.exit(0);
              break;
           }
           default:
           {
            System.out.println("Wrong choice.");
           }
       }
  }
}

    public void Enqueue()
    {
        Scanner sca= new Scanner(System.in);
        System.out.println("Enter the data");
        if(rear==arr.length-1)
        {
        System.out.println("Queue is full.");
        }
        else
        {
        if(frant==-1 || rear==-1)
        {
 
          frant++;
          rear++;
          arr[rear]=sca.nextInt();
        }
        else
        {
        rear++;
        arr[rear]=sca.nextInt();
        }
        System.out.println("data is inserted.");
        } 
    }

    private void Dequeue()
    {
     if(rear==-1)
     {
       System.out.println("queue is Empty.");
     }
     else
     {
        frant++;
     }
    }

    private void Traverse()
    {
      if(rear==-1)
     {
       System.out.println("queue is Empty.");
     }
      else
      {
       for(int i=frant;i<=rear;i++)
       {
         System.out.print(arr[i]+" ");
       }
      }
    }
}

