import java.util.Scanner;

public class Binary {
    int result=0;
    public int bin(int num){
        if(num<=0)
        {

            return 0;
        }
       else {
            int r= bin(num/2);
             r=num%2;
            result=result*10+r;
           return result;
        }
    }
}
class binMain{
    public static void main(String[] args) {
        Binary obj=new Binary();
        Scanner sca =new Scanner(System.in);
        System.out.println("enter the number: ");
        int num=sca.nextInt();
        System.out.println("Binary number: "+obj.bin(num));
    }
}
