public class searchArr {
    public static int[] res(int arr[],int currentindex,int Search_value ,int count){
        if(currentindex==arr.length) {
           int tempArr[]=new int[count];
            return tempArr;
        }
        if(arr[currentindex]==Search_value){
            int rac[]=res(arr,currentindex+1,Search_value,count+1);
            rac[count]=currentindex;
            return rac;
        }
        else {
            int rac[]=res(arr,currentindex+1,Search_value,count);
            return rac;
        }

    }
}
class SearchArraMain{
    public static void main(String []Args){
        int ans[]=searchArr.res(new int[]{1,7,4,7,6},0,7,0);
        if(ans.length==0){
            System.out.println("-1");
            return;
        }
        for (int e:ans) {
            System.out.println(e);
        }
    }
}
