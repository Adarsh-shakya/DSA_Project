import java.util.Scanner;
public class stackExample 
{
    int arr[];
    int top;
    public stackExample()
    {
        arr=new int[5];
        top=-1;
    }
    void push(){
        if(top==arr.length-1){
        System.out.println("Stack full/over");
        }
        else{
        System.out.println("Enter data..");
        Scanner sca=new Scanner(System.in);
        int data=sca.nextInt();
        
        top=top+1;
        arr[top]=data;
        System.out.println("Data inserttad");
        }
    }
    void pop(){
        if(top==-1){
        
        System.out.println("Stack empty..");
        }
        else{
          System.out.println("Deleted//..."+arr[top]);
        top=top-1;       
        }
    }
    void veiw(){
        if(top==-1){
        System.out.println("Stack empty/ underflow");
        }
        else {
        System.out.println("Stack element.");
        for(int i=top;i>=0;i--){
        System.out.println(arr[i]);
        }
        }
    }
    public static void main(String []args){
        stackExample obj=new stackExample();
        while(true){
        System.out.println("Press 1 for push");
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
