
import java.util.Scanner;

class Nod
{
 int data;
 Nod next;
 Nod previos;
}
public class doubleLinkedList {
   Nod head;
    public doubleLinkedList()
    {
       head=null;
    }
    public void insert()
    {
     System.out.println("Enter the data: ");
     Scanner sca=new Scanner(System.in);
     Nod n=new Nod();
     n.data=sca.nextInt();
     if(head==null )
     {
      head=n;
     }
     else
     {
      Nod temp=head;
      while(temp.next!=null)
      {
        temp=temp.next;
      }
      temp.next=n;
      n.previos=temp;
      System.out.println("Data inserted");
     }
    }
    public static void main(String []args)
    {
      doubleLinkedList obj=new doubleLinkedList();
      Scanner sca=new Scanner(System.in);
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
              
              break;
           }
           case 3:
           {
              
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
