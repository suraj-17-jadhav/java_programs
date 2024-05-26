package array.io;

public class second_maximum_in_an_array {
    public static void main(String[] args) {
        int arr[]= {12,34,23,45,78,100,99};
        int n= arr.length;
        int sec_max= Integer.MIN_VALUE;
        int max= Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(max < arr[i]){
                max= arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if(arr[i]> sec_max && arr[i]< max){
                sec_max= arr[i];
            }
        }
        System.out.println(sec_max);
    }
}
