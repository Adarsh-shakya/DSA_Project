import java.util.Scanner;
// On this list we can traverse from both side front and back;
class Node2
{
   int rollno;
   Node2 Next;
   Node2 Previous;
}
public class DoublyLinkedList 
{
    Node2 START;
    DoublyLinkedList()
    {
         START=null;
        Node2 Previous=null;
    }
    void insert()
    {
        System.out.println("Enter your rollno");
        Scanner sca=new Scanner(System.in);
        int data=sca.nextInt();
        
        Node2 nn=new Node2();
        nn.rollno=data;
        nn.Next=null;
        
        if(START==null)
        {
           START=nn;
        }
        else
        {
          Node2 current=START;
          while(current.Next!=null)
          {
             current=current.Next;
          }
          current.Next=nn;
          nn.Previous=current;
        }
        System.out.println("date inseted");
    }
    void delete()
    { if(START==null)
    {
        System.out.println("LIst empty");
    }
    else
    {
      System.out.println("delete : "+START.rollno);
      if(START.Next==null)
      {
         START=null;
      }
      else
      {
        START=START.Next;
      }
    }
    }
    void traverse()
    {
        if(START==null)
        {
        System.out.println("List empty...");
        }
        else
        { //forward
           Node2 current;
           for(current=START;current!=null;current=current.Next)
           {
           System.out.print(" "+current.rollno);
           }
 
           //reverse
        }
    }
    public static void main(String args[])
    {
     DoublyLinkedList obj=new DoublyLinkedList();
    while(true)
    {
       System.out.println("\npress 1 for insert");
       System.out.println("press 2 for delete");
       System.out.println("press 3 for traverse");
       System.out.println("press 4 for Exit");
       
       System.out.println("Enter ur choice");
       Scanner sca=new Scanner(System.in);
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
            obj.delete();
            break;
           }
           case 3:
           {
            obj.traverse();
            break;
           }
           case 5:
           {
            System.exit(0);
            break;
           }
           case 4:
           {
             obj.ReverseTraverse();
           }
       }
    }
    }

    public void ReverseTraverse() {
      if(START==null)
      {
        System.out.println("List is Empty. ");
      }
      else
      {
         Node2 current=START;
         while(current.Next!=null)
         { 
             current=current.Next;
         }
         while(current!=START)
         {
             System.out.print(current.rollno+" ");
             current=current.Previous;
         }
      }
    }
}
