package array.io;

public class remove_duplicates_from_sorted_array_secondMethod {
    public static void main(String[] args) {
        int arr[]= {2,2,4,5,5,6};
        int n= arr.length;

        int k = removeDuplicates(arr);

        for (int i = 0; i < k; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static  int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[j] != nums[i] ){
                nums[i+1]=nums[j];
                i++;
            }
            nums[i]=nums[j];
        }
        return i+1;
    }
}
