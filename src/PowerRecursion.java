import java.util.Scanner;

public class PowerRecursion {
    public static void power(int n,int p, int ans){
        if(p==0){
            System.out.println(ans);
            return  ;
        }
         power(n,p-1,ans*n);

    }

}
class MainPower{
    public static void main(String[] args) {
        {
            Scanner sca=new Scanner(System.in);
            int n;
            int p;
            System.out.println("Enter the number and power: ");
            n=sca.nextInt();
            p=sca.nextInt();
            PowerRecursion.power(n,p,1);

        }
    }
}

