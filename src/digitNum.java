import java.util.Scanner;

public class digitNum {
    public static void  num(int n,int ans){
        if(n==0){
            System.out.println(ans);
            return ;
        }
        num(n/10,ans+1);

    }
}
class digitMain{
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        System.out.println("Enter the number: ");
       digitNum.num(sca.nextInt(),0);
    }



}
