import java.util.*;
public class minmax{
static class pair{
        int min;
        int max;
    };
     static pair getminmax(int arr[]){
        pair minmax = new pair();
        minmax.min = arr[0];
        minmax.max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > minmax.max){
                minmax.max = arr[i];
            }else{
                minmax.min = arr[i];
            }
        }
       return minmax;
    }

    //    public static void printArray(int arr[]){
    //     for(int i=0; i<arr.length; i++){
    //         System.out.println(arr[i] + " ");
    //         System.out.println();
    //     }
    //    }
    public static void main(String[] args){
        int arr[] = {1, 2, 3, 4, 5};
        pair minmax = getminmax(arr);
        System.out.println("The min element is :" + " " + minmax.min);
        System.out.println("The max element is :" + " " + minmax.max);


        
    }
}