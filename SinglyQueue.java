
import java.util.Scanner;


public class SinglyQueue {
    int arr[];
    int Front,Rear;
    SinglyQueue()
    {
       arr=new int[5];
       Front=-1;
       Rear=-1;
    }
    public void insert()
    {
        if(Rear==arr.length-1)
        {
         System.out.println("Queue full");
        }
        else
        {
            Scanner sca=new Scanner(System.in);
           System.out.println("Enter the data: ");
           int data=sca.nextInt();
           if(Front==-1)
           {
             Front++;
           }
           Rear=Rear+1;
           arr[Rear]=data;
           System.out.println("Data inserted");
        }
      
    }
    public void delete()
    {
       if(Front==-1 || Rear==-1)
     {
       System.out.println("Queu is Empty");
     }
       else
       {
         if(Front==Rear)
         {
           Front=Rear=-1;
         }
         else
         {
           Front=Front+1;
         }
       }
    }
    public void traverse()
    {
     if(Front==-1 || Rear==-1)
     {
       System.out.println("Queu is Empty");
     }
     else
     {
      for(int i=Front;i<=Rear;i++)
      {
        System.out.print(arr[i]+" ");
      }
     }
    
    }
    public static void main(String []args)
    {
        Scanner sca=new Scanner(System.in);
        SinglyQueue obj=new SinglyQueue();
        
        while(true){
    System.out.println("Press 1 for insert.");
    System.out.println("Press 2 for delete.");
    System.out.println("Press 3 for traverse.");
    System.out.println("Press 4 for Exit.");
    
    System.out.println("Enter your choice.");
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
        }
        default:
        {
        System.out.println("Wrong choice");
        }
    }
        }
    }
}
