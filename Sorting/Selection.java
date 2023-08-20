public class Selection {
    public static void Selection_sort(int arr[]){
        for(int i =0; i<arr.length-1; i++){
            int min = i;
            for(int j =i+1; j<arr.length; j++)
                if(arr[j] < arr[min])
                    min = j;

                    int temp = arr[min];
                    arr[min] = arr[i];
                    arr[i] = temp;
                
            
        }
    }
    static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args){
        int arr[] = {23, 54, 23, 56, 765, 34, 6777};
        System.out.print("The original arr is :" + " ");
        printArray(arr);
        Selection_sort(arr);
        System.out.print("The  arr is after sorting:" + " ");
         printArray(arr);
    }
}
