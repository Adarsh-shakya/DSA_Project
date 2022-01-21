import java.util.Scanner;

public class IncreasingNum {
    public static int increas(int n){
        if(n==0){
            return 0;
        }
        int recuAnswer=increas(n-1);
        System.out.print(recuAnswer+1+" ");
        return n;
    }
}
class MainNum{
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        System.out.println("Enter the number: ");
        IncreasingNum.increas(sca.nextInt());
    }



}
