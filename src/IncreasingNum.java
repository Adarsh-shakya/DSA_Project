import java.util.Scanner;
// increasing number
public class IncreasingNum {
    public static void increas(int n){
        if(n==0){
            return ;
        }
        increas(n-1);
        System.out.print(n+" ");

    }
}
class MainNum{
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        System.out.println("Enter the number: ");
        IncreasingNum.increas(sca.nextInt());
    }



}
