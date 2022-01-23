import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class calendar {
    public static void main(String[] args) {
       Scanner sca=new Scanner(System.in);
        Calendar cal=Calendar.getInstance();
        System.out.println("Enter Year: ");
        int year=sca.nextInt();
        System.out.println("Enter month: ");
        int month=sca.nextInt();
        System.out.println("Enter date of the day: ");
        int dy=sca.nextInt();
        cal.set(year,month-1,dy);
        Date df=cal.getTime();
        DateFormat dff=new SimpleDateFormat("EEEEEEEE");
        String day=dff.format(df);
        System.out.println(day);
    }
}
