public class insertion_sort {
    public static void insertion(int arr[]){
        for(int i=1; i<arr.length; i++){
            int key = arr[i];
            int j = i-1;

            while(j >=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }

   static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
            // System.out.println();
        }
    }
    public static void main(String[] args){
        int arr[] = {23, 54, 23, 56, 765, 34, 6777};
        System.out.print("The original arr is :" + " ");
        printArray(arr);
        insertion(arr);
        System.out.print("The  arr is after sorting:" + " ");
         printArray(arr);
    }
    
}
