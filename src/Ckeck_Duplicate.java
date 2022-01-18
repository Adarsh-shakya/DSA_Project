//chech array have duplicate element or not.
public class Ckeck_Duplicate {
    public static  void main(String arg[]){
        int arr[]={2,3,4,5,3,7,4};
        for (int i = 0; i < arr.length ; i++) {
            int count=0;
            for (int j = 0; j <arr.length ; j++) {
                if (arr[i]==arr[j])
                {
                    count++;
                    if (count>1 && i!=j)
                    {
                        System.out.println("Index "+i+" and Index "+j+" have duplicate value");
                    }
                }
            }
        }
    }
}
