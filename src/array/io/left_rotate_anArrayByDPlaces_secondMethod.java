package array.io;

import java.util.ArrayList;

public class left_rotate_anArrayByDPlaces_secondMethod {
    public static void main(String[] args) {
        int arr[]= {1,12,23,45,67,78,98,100};
        int n= arr.length;
        int k= 5;
//        output = [78,98,100,1,12,23,45,67]
        if (n == 0)
            return;
        k = k % n;
        if (k > n)
            return;
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }
        for (int i = 0; i < n - k; i++) {
            arr[i] = arr[i + k];
        }
        for (int i = n - k; i < n; i++) {
            arr[i] = temp[i - n + k];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
