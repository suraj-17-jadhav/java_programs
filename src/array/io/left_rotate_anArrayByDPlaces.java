package array.io;

public class left_rotate_anArrayByDPlaces {
    public static void main(String[] args) {
        int arr[]= {1,4,7,10,23,45,68,100};
        int d =4;
        int n= arr.length;
//        output= [23,45,68,100,1,4,7,10]
         reverse(arr,0 , d-1);
         reverse(arr,d, n-1);
         reverse(arr,0,n-1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start <= end){
            int temp= arr[start];
            arr[start]= arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
    }
}
