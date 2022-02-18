
import java.util.Scanner;

class Node1
{
int data;
Node1 next;
}
public class SinglyCircularLinkedList {
    Node1 Start;
    SinglyCircularLinkedList()
    {
      Start=null;
    }
    public void insert()
    {
        Node1 n=new Node1();
        Scanner sca=new Scanner(System.in);
        System.out.println("Enter the data");
        n.data=sca.nextInt();
        if(Start==null)
        {
           Start=n;
           n.next=n;
        }
        else
        {
          Node1 current=Start;
          while(current.next!=Start)
          {
            current=current.next;
          }
          n.next=current.next;
          current.next=n;
        }
    System.out.println(" data Inserted.");
    }
    public void Delete()
    {
        if(Start==null)
        {
          System.out.println("list is Empty");
        }
        else
        {
            System.out.println("delete--->"+Start.data);
          if(Start==Start.next)
          {
            Start=null;
          }
          else
          {
          Node1 current=Start;
          while(current.next!=Start)
          {
             current=current.next;
          }
       
          current.next=Start.next;
          Start=Start.next;
          }
          
  
        }
    }
    public void Traverse()
    {
        if(Start==null)
        {
             System.out.println("List Empty");
        }
        else{
        Node1 current=Start;
        while(current.next!=Start)
        {
          System.out.print(current.data+" ");
          current=current.next;
        }
        System.out.println(current.data);
        }
    }
    
    public static void main(String []args)
    {
      Scanner sca=new Scanner(System.in);
      SinglyCircularLinkedList obj =new   SinglyCircularLinkedList();
      while(true)
      {
       System.out.println("\nPress 1 for insert");
       System.out.println("Press 2 for delete");
       System.out.println("Press 3 for Traverse");
       System.out.println("Press 4 for Exit");
       
       System.out.println("Enter your choice ");
       int choice=sca.nextInt();
       switch(choice)
       {
           case 1:
           {
              obj.insert();
              break;
           }
           case 2:
           {
              obj.Delete();
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
}
