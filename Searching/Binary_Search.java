public class Binary_Search{
    public static int BS(int arr[], int val){
        int s =0, e=arr.length-1;
        int mid = s+(e-s)/2;
        while(s <= e){
            if(arr[mid] == val){
                return mid;
            }
            else if( arr[mid] < val){
                s = mid + 1;
            }else{
                e = mid -1;
            }
            mid = s + (e-s)/2;
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[] = {34, 56, 67, 78, 87, 555 ,777, 999, 5677, 6778};
        int val  = 344;
        int pos = BS(arr, val);
        if(pos == -1){
            System.out.println("The Element is not found");
        }else{
            System.out.println("The Element is found at index" + " "+ pos);
        }
    }
}

//Time Complexity = O(log n)