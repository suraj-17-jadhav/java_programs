package array.io;

import java.util.HashSet;

public class remove_duplicates_fromSortedArray {
    public static void main(String[] args) {
        int arr[]= {1,1,2,2,2,3,45,67,67,89};
        int n= arr.length;
        HashSet <Integer> new_arr = new HashSet<>();
        for (int i = 0; i < n; i++) {
            new_arr.add(arr[i]);
        }
        System.out.println(new_arr);
    }
}
