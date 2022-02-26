
import java.util.Scanner;

class Node3
{
int data;
Node3 next;
}
public class StackWithLinkedList {
    Node3 top;
    StackWithLinkedList()
    {
    top=null;
    }
    public void push()
    {
     Scanner sca=new Scanner(System.in);
     System.out.println("Enter the data. ");
     Node3 n=new Node3();
     n.data=sca.nextInt();
    if(top==null)
    {
      top=n;
    }
    else
    {
     n.next=top;
     top=n;
    }
    System.out.println("Data inserted.");
    }
    public void pop()
    {
    if(top==null)
    {
      System.out.println("Stack is Empty");
    }
    else
    {
      System.out.println(top.data+" is deleted.");
      top=top.next;
    }
    }
    public static void main(String []args)
    {
     StackWithLinkedList obj=new StackWithLinkedList();
     while(true){
        System.out.println("\nPress 1 for push");
        System.out.println("Press 2 for pop");
        System.out.println("Press 4 for exit");
        
        System.out.println("Enter your choice: ");
        Scanner sca=new Scanner(System.in);
        int choice=sca.nextInt();
        switch(choice){
            case 1:
            {
            obj.push();
            break;
            }
            case 2:
            {
            obj.pop();
            break;
            }
            case 4:
            {
            System.exit(0);
            break;
            }
            default:
                System.out.println("Wroung choice:");
        }
        }
    }
}
