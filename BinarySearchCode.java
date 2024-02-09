public class BinarySearchCode {
    public static void main(String[] args) {
        int [] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int target = 18;
        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            //Find the middle element
//            int mid = (start+end)/2; //might be possible that (start+end) exceed the int range.
            int mid = start + (end - start) / 2;
            //m = s + (e-s) /2;
            // m = (2s + e -s)/2 = s+e/2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target>arr[mid]){
                start = mid + 1;
            }else {
                //ans found
                return mid;
            }
        }
        return -1;
    }
}
