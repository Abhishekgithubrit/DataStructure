public class Bubble{
    public static void Bubble_sort(int arr[]){
        for(int i =0; i<arr.length-1; i++){
            for(int j =0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
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
        Bubble_sort(arr);
        System.out.print("The  arr is after sorting:" + " ");
         printArray(arr);
    }
}

