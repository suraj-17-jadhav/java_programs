package array.io;

public class array_isSorted_or_not {
    public static void main(String[] args) {
        int arr[]= {2,5,18,89,100};
        int n= arr.length;
        int flag=0;
        for (int i = 0; i < n-1; i++) {
            if(arr[i+1]>arr[i]){

            }
            else {
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("array is not sorted");
        }else {
            System.out.println("array is sorted");
        }
    }
}
