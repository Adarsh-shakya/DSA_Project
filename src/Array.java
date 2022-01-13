import java.util.Scanner;

public class Array {
    int arr[];
   public Array()
   {
       arr=new int[5];
       for (int i = 0; i < arr.length ; i++) {
           arr[i]=Integer.MIN_VALUE;
       }
   }
   //method for traverse the array
    public void traverse(){
        for (int res:arr)
        {
            System.out.println(res);
        }
    }
    //insert value at given index

    public void inset(int value ,int index)
    {
        try {
            if (arr[index] == Integer.MIN_VALUE) {
                arr[index] = value;
                System.out.println("value insert successfully...");
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index");
        }
    }
    // print the specific value from the array
    public void getValue(int index)
    {
        try
        {
            System.out.println("Value aat given index is : "+arr[index]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("invalid index");
        }
    }
    // search the value in th array
    public void search(int value)
    {
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]==value) {
                System.out.println("value is found!");
                return;
            }
        }
        System.out.println("Value is not found!");
    }
    // delete the value at given index
    public void delete(int index)
    {
        int i;
        for (i = index; i < arr.length-1 ; i++) {
            arr[i]=arr[i+1];
        }
        arr[i]=0;
        System.out.println("value delete successfully...");
    }
    //delete hole array
    public void deleteArray(){
       arr=null;
        System.out.println("Array delete successfully...");
    }
}
class main{
    public static void main(String[] args) {
        Array obj=new Array();
        Scanner sca =new Scanner(System.in);
        System.out.println("Enter your case:\n1=>traverse the array\n2=>Insert value\n3=>getvalue from Array\n4=>Search element\n5=>delete value\n6=>delete Array\n7=>Exit");
        while (true){
        switch (sca.nextInt()) {
            case 1: {
                obj.traverse();
                break;
            }
            case 2: {
                System.out.println("Enter the value: ");
                int v = sca.nextInt();
                System.out.println("Enter the index: ");
                int i = sca.nextInt();
                obj.inset(v, i);
                break;
            }
            case 3: {
                System.out.println("Enter the index: ");
                int i = sca.nextInt();
                obj.getValue(i);
                break;
            }
            case 4: {
                System.out.println("Enter the value: ");
                int v = sca.nextInt();
                obj.search(v);
                break;
            }
            case 5: {
                System.out.println("Enter the index: ");
                int i = sca.nextInt();
                obj.delete(i);
                break;
            }
            case 6: {
                obj.deleteArray();
                break;
            }
            case 7:
                System.exit(0);
                break;
            default: {
                System.out.println("chose  option miss match..");
            }
        }}
    }
}
