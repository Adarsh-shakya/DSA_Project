import java.util.Scanner;
// calculat average marks
public class Student {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        int mark[][]=new int[4][5];
        for (int i = 0; i <4 ; i++) {
            System.out.println("Enter the mark of student "+(i+1)+": ");
            for (int j = 0; j < 5; j++) {
                mark[i][j]= sca.nextInt();
            }
        }
        for (int i = 0; i <5 ; i++) {
            int  avg=0;
            for (int j = 0; j < 4; j++) {
                avg+=mark[j][i];
            }
            System.out.println("Average marks in "+(i+1)+" subject= "+avg/4);
        }
        System.out.println("\n");
        int count=0;
        for (int i = 0; i <4 ; i++) {
            int avg=0;
            for (int j = 0; j < 5; j++) {
                avg+=mark[i][j];
            }
            System.out.println("Average marks in "+(i+1)+" student= "+avg/5);
            if(avg/5<50){
                count++;
            }
        }
        System.out.println("\n"+count+" of student who have  average below 50\n");
    }
}







