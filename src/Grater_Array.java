public class Grater_Array {
   int  myArray1[];
   int  myarray2[];
   int result_arr[];
   int count;
   Grater_Array(){
       myArray1=new int[]{3,4,1,2,2};
       myarray2=new int[]{1,2,1,3,1};
   }
   public  void  check_array(){
       result_arr=new int[myArray1.length];
       for (int i = 0; i <myArray1.length; i++) {
           count=0;
           for (int j = 0; j <myarray2.length ; j++) {
               if (myArray1[i]<=myarray2[j]){
                   count++;
               }
           }
           result_arr[i]=count;
       }
   }
   public void traverse(){
       for (int res:result_arr) {
           System.out.print(res+" ");
       }
   }
}
class arrayMain{
    public static void main(String[] args) {
        Grater_Array obj =new Grater_Array();
        obj.check_array();
        obj.traverse();
    }
}
