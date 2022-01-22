import java.util.Scanner;

public class ArrSum {
    public static int  fun(int arr[],int i){
       if(i<0){

           return 0;
       }
        int ans=fun(arr,i-1);
        int sum=arr[i]+ans;
        return sum;
    }
}
class ArrtMain{
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int l=sca.nextInt();
        int array[]=new int[l];
        System.out.println("Enter the Array: ");
        for (int i = 0; i < array.length ; i++) {
            array[i]= sca.nextInt();
        }

        System.out.println("sum of array is :" +ArrSum.fun(array,array.length-1));
    }
}

