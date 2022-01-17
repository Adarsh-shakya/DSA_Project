import java.util.ArrayList;
import java.util.Scanner;

public class _2D_array {
    int arr[][];
    ArrayList odd;
    ArrayList even;
    Scanner sca =new Scanner(System .in);
    public _2D_array()
    {
        arr=new int[4][4];
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("Enter the value of array "+(1+i)+" :");
            for (int j = 0; j <arr.length ; j++) {
                arr[i][j]=sca.nextInt();
            }
        }

    }
    void selectArray(){
        odd=new ArrayList();
        even=new ArrayList();
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                if(arr[i][j]%2==0)
                {
                    even.add(arr[i][j]);
                }
                else{
                    odd.add(arr[i][j]);
                }
            }
        }
    }
    void getResult(){
        System.out.println("Even Number= "+even);
        System.out.println("Odd Number= "+odd);
    }
}
class arrMain{
    public static void main(String[] args) {
        _2D_array obj=new _2D_array();
        obj.selectArray();
        obj.getResult();
    }
}
