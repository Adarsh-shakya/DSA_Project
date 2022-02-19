import java.util.Scanner;

class Node
{
int data;
Node next;
}
class LinkedList2
{
  Node Start;
  LinkedList2()
  {
      Start=null;
  }
  public void CreateList()
  {
    Scanner sca=new Scanner(System.in);
      System.out.println("Enter the list with 10 element: ");
      for (int i = 0; i <10 ; i++) {
          Node n=new Node();
          n.data=sca.nextInt();
          n.next=null;
          if(Start==null)
          {
              Start=n;
          }
          else
          {
              Node current=Start;
              while(current.next!=null)
              {
                  current=current.next;
              }
              current.next=n;
          }
      }

  }
  public void Unduplicate()
  {
      Node current=Start;
      for ( current = Start; current.next!=null ; current=current.next)
      {
       if(current.data==current.next.data)
       {
           current.next=current.next.next;
       }
      }

  }
  public void Traverse()
    {
       Node current=Start;
       for (current=Start;current!=null;current=current.next)
           System.out.print(current.data+" ");
    }

    public static void main(String[] args) {
        LinkedList2 obj=new LinkedList2();
        obj.CreateList();
        obj.Unduplicate();
        obj.Traverse();
    }
}

