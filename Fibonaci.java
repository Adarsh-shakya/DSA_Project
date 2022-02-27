
import java.util.Scanner;

public class Fibonaci {
 int a=0;
 int b=1;
 int c;
 public void fibo(int num)
 {
   if(num>=1)
   {
   c=a+b;
   System.out.print(c+" ");
   a=b;
   b=c;
   fibo(num-1);
   }
 }
 public static void main(String []args)
 {
   Fibonaci obj=new Fibonaci();
   Scanner sca=new Scanner(System.in);
   System.out.println("Enter the number: ");
   int n=sca.nextInt();
   System.out.print(obj.a+" "+obj.b+" ");
   obj.fibo(n);
 }
}
