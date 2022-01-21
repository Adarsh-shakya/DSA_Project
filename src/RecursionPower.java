import java.util.Scanner;
//Power by recursion
public class RecursionPower {
    public static int power(int n,int p){
      if(p==0){
          return  1;
      }
       int temp= power(n,p-1);
        int ans=n*temp;
        return ans;
    }

}
class PowerMain{
    public static void main(String[] args) {
        {
            Scanner sca=new Scanner(System.in);
            int n;
            int p;
            System.out.println("Enter the number and power: ");
            n=sca.nextInt();
            p=sca.nextInt();
            System.out.println(RecursionPower.power(2,3));

        }
    }
}
