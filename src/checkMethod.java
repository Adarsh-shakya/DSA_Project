import java.util.Scanner;
//check number is present or not
public class checkMethod {
    static int arr[]={2,3,5,8,9};
    public static void check(int n,int i)
    {
     if (arr.length<=i || arr[i]==n )
     {
         if(arr.length<=i){
             System.out.println("False");
             return;
         }
         else{
             System.out.println("True");
             return;
         }
     }

     check(n,i+1);

    }

    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sca.nextInt();
        check(num,0);
    }
}
