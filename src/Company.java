import java.util.Scanner;
//calculate total salea of the item
public class Company {
    public static void main(String ags[]){
        int sum;
        int comp[][]=new int[5][3];
        Scanner sca=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the sales of 3 items sold by salesman "+(i+1)+":");
            for (int j = 0; j < 3; j++) {
                comp[i][j]=sca.nextInt();
            }

        }
        for (int i = 0; i < 5; i++) {
            sum=0;
            for (int j = 0; j < 3; j++) {
               sum+=comp[i][j];
            }
            System.out.println("Total Sales By Salesman "+(i+1) +"="+sum);
        }
        for (int i = 0; i < 3; i++) {
            sum=0;
            for (int j = 0; j < 5; j++) {
                sum+=comp[j][i];
            }
            System.out.println("Total sales of item "+(i+1) +"="+sum);
        }
    }
}
