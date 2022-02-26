
import java.util.Scanner;


public class StackWithArray
{
   int arr[];
   int top;
   public StackWithArray()
   {
       arr=new int[5];
       top=-1;
   }
   public void push()
   {
       if(top==arr.length-1)
       {
         System.out.println("Stack is full.");
       }
       else
       {
           System.out.println("Enter the data");
           Scanner sca=new Scanner(System.in);
         top++;
         arr[top]=sca.nextInt();
         System.out.print("Data inserted.");
       }
          
   }
   public void pop()
   {
   if(top==-1)
   {
     System.out.println("Stack is Empty.");
   }
   else
   {
     System.out.println(arr[top]+" is deleted.");
     top--;
   }
   }
   public void veiw()
   {
      if(top==-1)
   {
     System.out.println("Stack is Empty.");
   }
      else
      {
       for(int i=0;i<=top;i++)
       {
       System.out.print(arr[i]+" ");
       }
      }
   }
   public static void main(String []args)
   {
     StackWithArray obj=new StackWithArray();
     while(true){
        System.out.println("\nPress 1 for push");
        System.out.println("Press 2 for pop");
        System.out.println("Press 3 for veiw");
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
            case 3:
            {
            obj.veiw();
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
