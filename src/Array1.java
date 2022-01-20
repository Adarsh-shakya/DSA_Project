import java.util.Scanner;
//check the product is odd or not
public class Array1 {
    int arr[];

    public void setArr(int arr[]) {
        this.arr = arr;
    }
    public void checkArray(){
        for (int i = 0; i <arr.length-1; i++) {
            int p=arr[i]*arr[i+1];
            if (p%2!=0)
            {
                System.out.println("The product of "+arr[i]+" and "+arr[i+1]+" is "+p+"that is Odd");
            }
        }
    }
}
class A
{
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        Array1 obj=new Array1();
        int arr1[]=new int[6];
        System.out.println("Enter the element of array: ");
        for (int i = 0; i <arr1.length ; i++) {
            arr1[i]=sca.nextInt();
        }
        obj.setArr(arr1);
        obj.checkArray();
    }
}
