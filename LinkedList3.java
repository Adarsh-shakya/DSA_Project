import java.util.Scanner;

public class LinkedList3 {
    Node head;
    int len;
    LinkedList3()
    {
        head=null;
        len=0;
    }
    public void insert()
    {
        Scanner sca=new Scanner(System.in);
        System.out.println("Enter the list end with -1:");

        while (true)
        {
            Node n=new Node();
            int d=sca.nextInt();
            if(d==-1)
            {
                break;
            }
            n.data=d;
            n.next=null;
            if (head==null)
            {
                head=n;
            }
            else
            {
             Node current=head;
             while(current.next!=null)
             {
                 current=current.next;
             }
             current.next=n;
            }
            len++;
        }


    }
    public int midden()
    {
        Node current=head;
        for (int i = 0; i <len/2 ; i++)
        {
          current=current.next;
        }
        return current.data;
    }

    public static void main(String[] args) {
        LinkedList3 obj=new LinkedList3();
        obj.insert();
        System.out.println(obj.midden());
    }
}
