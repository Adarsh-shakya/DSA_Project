
import java.util.Scanner;

class node
{
int data;
node next;
}
public class LinearQueueWithLinkedList 
{
  node frant;
  node rear;
  public LinearQueueWithLinkedList()
  {
    frant=null;
    rear=null;
  }
  
  public static void main(String []args)
  {
   LinearQueueWithLinkedList obj=new LinearQueueWithLinkedList();
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

    private void Enqueue() 
    {
     Scanner sca=new Scanner(System.in);
     node n=new node();
     System.out.println("Enter the data: ");
     n.data=sca.nextInt();
     if(frant==null)
     {
       frant=n;
       rear=n;
     }
     else
     {
       rear.next=n;
       rear=n;
     }
     System.out.println("Data inserted");
    }
    private void Dequeue()
    {
     if(frant==null)
     {
       System.out.println("Queue is Empty");
     }
     else
     {
         System.out.println(frant.data+" is deleted");
     frant=frant.next;
     }
    }
    private void Traverse() 
    {
     if(frant==null)
     {
       System.out.println("Queue is Empty");
     }
     else
     {
       node temp;
       for(temp=frant;temp!=rear;temp=temp.next)
       {
         System.out.print(temp.data+" ");
       }
       System.out.println(temp.data);
     }
    }
}
