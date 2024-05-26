package array.io;

public class second_maximum_thirdMethod {
    public static void main(String[] args) {
        int arr[]= {3,18,7,21,12,99,45,333,17};
        int n = arr.length;
        int max= Integer.MIN_VALUE;
        int sec_max= Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i] > max){
                sec_max= max;
                max= arr[i];
            }
        }
        System.out.println(sec_max);
    }
}
