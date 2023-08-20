public class Linear_Search{

   public static void LS(int arr[], int val){
        for(int i =0; i<arr.length; i++){
            if(arr[i] == val){
                System.out.println("The item found is array at index" + " " + i);
                return;
            }
        }
        System.out.println("The val is not found in whole arr");
    }
    public static void main(String[] args){
       int arr[] = {2 , 4, 6, 86, 886,3, 5, 45};
       int val = 86;
      LS(arr, val);
    }
}