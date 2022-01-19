import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n=sca.nextInt();
        String arr[]=new String[n];
        System.out.println("Enter the element of the array: y;" +" ");
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=sca.next();
        }
        System.out.print(arr[arr.length-1]+" ");
        for (int i = 0; i <arr.length-1 ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
