import java.util.Scanner;

public class StackNew {
    int arr[];
    int top;

    public StackNew(){
        arr=new int[5];
        top=-1;
    }

     void push()
    {
        if(top==arr.length-1) {
            System.out.println("Stack is full");
        }
        else
        {
            Scanner sca=new Scanner(System.in);
            System.out.println("Enter your date: ");
            int data=sca.nextInt();
            top=top+1;
            arr[top]=data;
            System.out.println("Data inserted");
        }
    }
    void pop()
    {
        if(top==-1) {
            System.out.println("Stack is Empty");
        }
        else
        {
            System.out.println("Delete--->"+arr[top]);
            top=top-1;
        }

    }
    void view()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.println("Stack element");
            for(int i=top;i>=0;i--){
                System.out.print(" "+arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        StackNew obj1=new StackNew();
        while (true)
        {
            System.out.println("\nPress 1 for push");
            System.out.println("Press 2 for pop");
            System.out.println("Press 3 for view");
            System.out.println("Press 4 for Exit");

            System.out.println("Enter your choice: ");
            Scanner sca =new Scanner(System.in);
            int choice=sca.nextInt();

            switch (choice)
            {
                case 1:
                {
                   obj1. push();
                    break;
                }
                case 2:
                {
                    obj1.pop();
                    break;
                }
                case 3:
                {
                    obj1.view();
                    break;
                }
                case 4:
                {
                    System.exit(0);
                    break;
                }
                default:
                {
                    System.out.println("Your choice is wrong");
                }
            }
        }
    }

}
