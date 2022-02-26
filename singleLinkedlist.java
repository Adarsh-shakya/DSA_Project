
import java.util.Scanner;

class Node4
{
    int data;
    Node4 next;
}
public class singleLinkedlist 
{
    Node4 head;
    int len;
    public singleLinkedlist()
    {
     head=null;
     len=0;
    }
    public void insertAtLast()
    {
      System.out.println("Enter the data: ");
      Scanner sca=new Scanner(System.in);
      Node4 n=new Node4();
      n.data=sca.nextInt();
      len++;
      if(head==null)
      {
        head=n;
      }
      else
      {
        Node4 current=head;
        while(current.next!=null)
        {
            current=current.next;
        }
        current.next=n;
      }
      System.out.println("Data inserted.");
    }
    public void insertAtPosition()
    {
      System.out.println("Enter the data : ");
      Scanner sca=new Scanner(System.in);
      Node4 n =new Node4();
      n.data=sca.nextInt();
      System.out.println("Enter the position: ");
      int p=sca.nextInt();
      if(head==null)
      {
        
          head=n;
      }
      else
      {
          Node4 current=head;
          for(int i=0;i<p-1;i++)
          {
            current=current.next;
          }
          n.next=current.next;
          current.next=n;
      }
      
    }
    
    public void Traverse()
    {
      if(head==null)
      {
        System.out.println("list is Empty");
      }
      else
      {
        Node4 current;
        for(current=head;current!=null;current=current.next)
        {
         System.out.print(current.data+" ");
        }
      }
    }
    public static void main(String []args)
    {
      singleLinkedlist obj=new singleLinkedlist();
       while(true){
        System.out.println("\nPress 1 for insertAtLast");
        System.out.println("Press 2 for insertAtPosition");
        System.out.println("Press 3 for Traverse");
        System.out.println("Press 6 for deleting");
        System.out.println("Press 4 for exit");
        
        System.out.println("Enter your choice: ");
        Scanner sca=new Scanner(System.in);
        int choice=sca.nextInt();
        switch(choice){
            case 1:
            {
            obj.insertAtLast();
            break;
            }
            case 2:
            {
            obj.insertAtPosition();
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
            case 5:
            {
            obj.DeleteAtLast();
             break;
            }
            case 6:
            {
              obj.DeleteAtFrist();
              break;
            }
            default:
                System.out.println("Wroung choice:");
        }
        }
     }

    public void DeleteAtLast() {
        if(head==null)
        {
        System.out.println("list is Empty");
        }
        else
        {
         Node4 current=head;
         while(current.next!=null)
         {
           current=current.next;
         }
         System.out.println(current.data+" is deleted");
         current=null;
        }
    }

    public  void DeleteAtFrist() {
        if(head==null)
        {
          System.out.println("list is Empty");
        }
        else
        {
          System.out.println(head.data+" is deleted");
          head=head.next;
        }
    }
}
