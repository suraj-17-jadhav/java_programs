package array.io;

public class second_maximum_in_an_array_secondMethod {
    public static void main(String[] args) {
        int arr[]= {7,1,45,23,10,56,45};
        int n= arr.length;
        sort_arr(arr,n);
        long sec_max= Integer.MIN_VALUE;
        long max= arr[n-1];
        for (int i = n-2; i >=0 ; i--) {
            if(arr[i] < max && arr[i] > sec_max){
                sec_max= arr[i];
            }
        }
        System.out.println(sec_max);
    }

    private static void sort_arr(int[] arr, int n) {
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[j]<arr[i]){
                    int temp= arr[i];
                    arr[i]= arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
