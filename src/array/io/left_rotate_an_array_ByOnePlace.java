package array.io;

public class left_rotate_an_array_ByOnePlace {
    public static void main(String[] args) {
        int arr[]= {21,1,7,10,23,16, 18};
//        output = [7,10,23,16,1]
        int n= arr.length;
        int temp= arr[0];
        for (int i = 1; i <n ; i++) {
            arr[i-1]= arr[i];
        }
        arr[n-1]= temp;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
