import java.util.Scanner;

public class TimeInterval {
    int start;
    int end;
   TimeInterval arr[]=new TimeInterval[5];
   Scanner sca =new Scanner(System.in);
   int startArray[];
   int endArray[];

   public void getTime(){
       for (int i = 0; i < arr.length ; i++) {
           arr[i]=new TimeInterval();
           System.out.println("enter the "+(1+i)+" Start and end Time: ");
           arr[i].start=sca.nextInt();
           arr[i].end=sca.nextInt();
       }
   }
   public void getStartEnd(){
       startArray=new int[arr.length];
       endArray=new int[arr.length];
       for (int i = 0; i <arr.length ; i++) {
           startArray[i]=arr[i].start;
           endArray[i]=arr[i].end;
       }
   }
  public void sortStartArray(){
       int temp;
       int i=0;
      while(i <arr.length-1) {
          if(startArray[i]>startArray[i+1]){
              temp=startArray[i];
              startArray[i]=startArray[i+1];
              startArray[i+1]=temp;
              i=0;
          }
          else
          {
              i++;
          }
      }
  }
  public void sortEndArray(){
      int temp;
      int i=0;
      while(i <arr.length-1) {
          if(endArray[i]>endArray[i+1]){
              temp=endArray[i];
              endArray[i]=endArray[i+1];
              endArray[i+1]=temp;
              i=0;
          }
          else
          {
              i++;
          }
      }
  }
  public void checkClash(){
       int i;
      for ( i = 0; i <arr.length-1 ; i++) {
          if(endArray[i]>startArray[i+1])
          {break;}
      }
      if(i<arr.length-1)
      {
          System.out.println( "time is clash.");
      }
  }
  public void traverse(){
      for (int res:startArray) {
          System.out.print(res+" ");
      }
      System.out.print("\n");
     for (int res1:endArray) {
          System.out.print(res1+" ");
      }
  }
}
class timeMain{
    public static void main(String[] args) {
        TimeInterval obj =new TimeInterval();
        obj.getTime();
        obj.getStartEnd();
        obj.sortStartArray();
        obj.sortEndArray();
        obj.checkClash();
        obj.traverse();
    }
}

