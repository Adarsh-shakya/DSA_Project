import java.util.Scanner;

class Node
{
 int data;
 Node next;
}
public class Linkedlist
{
    Node start;
    public Linkedlist()
    {
        start=null;
    }
    public void insert()
    {
        Scanner sca =new Scanner(System.in);
        System.out.println("Enter the data : ");
        Node nn=new Node();
        nn.data=sca.nextInt();
        nn.next=null;

        if(start==null)
        {
            start=nn;
        }
        else
        {
            Node current=start;
            while (current.next!=null)
            {
                current=current.next;
            }
            current.next=nn;
        }
        System.out.println("data inserted..");
    }

    public void delete()
    {
        if(start==null)
        {
            System.out.println("List is empty");
        }
        else
        {
            System.out.println("delete element-->"+start.data);
            if(start.next==null)
            {
               start=null;
            }
            else
            {
                start=start.next;
            }
        }
    }
    public void traverse()
    {
        if(start==null) {
            System.out.println("List is empty");
        }
        else
        {
            Node current;
            for (current=start;current!=null;current=current.next)
            {
                System.out.print(" "+current.data);
            }
        }
    }

    public static void main(String[] args) {
        Linkedlist obj=new Linkedlist();
        while (true)
        {
            System.out.println("\nPress 1 for insert ");
            System.out.println("Press 2 for delete ");
            System.out.println("Press 3 for traverse ");
            System.out.println("Press 4 for Exit  ");
            System.out.println("Press 5 for insertAtStart");
            System.out.println("Press 6 for insertAtPosition");

            System.out.println("Enter your choice : ");
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
                case 4:
                {
                    System.exit(0);
                    break;
                }
                case 5:
                {
                    obj.insertAtStart();
                    break;
                }
                case 6:
                {
                    obj.insertAtPosition();
                    break;
                }

                default:
                {
                    System.out.println("...Wrong choice..");
                }
            }
        }
    }


    public void insertAtPosition() {
        Scanner sca=new Scanner(System.in);
        System.out.println("Enter the data: " );
        Node nn=new Node();
        nn.data=sca.nextInt();
        System.out.println("Enter the position: ");
        int pos=sca.nextInt();
        Node temp=start;
        for(int i=1;i<pos-1;i++)
        {
            temp=temp.next;
        }
        nn.next=temp.next;
        temp.next=nn;
        System.out.println("Data inserted");
    }

    public void insertAtStart() {
        System.out.println("Enter the data: ");
        Scanner sca=new Scanner(System.in);
        Node nn=new Node();
        nn.data=sca.nextInt();
        if(start==null)
        {
            start=nn;
        }
        else {
            nn.next=start;
            start=nn;
        }
        System.out.println("Data inserted");
    }
}
