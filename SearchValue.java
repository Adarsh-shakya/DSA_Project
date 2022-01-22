public class SearchValue {
    public static int find(int arr[],int currentIndex,int Search_value){
        if(arr[currentIndex]==Search_value) {
            return currentIndex;
        }
        int ans=  find(arr, currentIndex+1, Search_value);
        return ans;
    }
}
class searchMain{
    public static void main(String[] args) {
        System.out.println("current Index is : "+SearchValue.find( new int[]{1,2,4,2,6},0,2));
    }
}
