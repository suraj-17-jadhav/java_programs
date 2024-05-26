public class maximum_in_the_array {
    public static void main(String[] args) {
        int arr[] = {12,34,56,87,33,99};
        int n= arr.length;
        int max= arr[0];
        for (int i = 0; i < n; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("the maximum number in the array is "+max);

    }
}
