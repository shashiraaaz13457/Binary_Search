import java.util.Arrays;

public class Mountain_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,5,6,4};
        System.out.println(peakIndexInMountainArray(arr));
    }
     static int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int mid = start + (end - start)/2;
            if (arr[mid] > arr[mid+1]){
                //It means you are in decreasing side of an array.
                //This maybe my ans but look at the left side also.
                end = mid ;
            } else {
                //Now you are in the ascending side of an array.
                start = mid+1;  // because we know mid + 1 element > mid element
            }
        }
        //In the end , start == end and pointing to the largest number because of the 2 checks above.
         return start; //or return end as both are equal.
     }
}
