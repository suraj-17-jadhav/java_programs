package array.io;

public class reversing_the_array_elements {
    public static void main(String[] args) {
        int arr[]= {12,22,23,35,55,76,85};
        int n= arr.length;
        int start=0;
        int end= n-1;
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("array elements after reversing the array elements ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
