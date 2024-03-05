public class SearchInMountainArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,3,1};
        int target = 3;
        System.out.println(search(array,target));
    }
    static int search(int[] array,int target){
        int peak = peakIndexInMountainArray(array,target);
        int firstTry = orderAgnosticBS(array,target,0,peak);
        if (firstTry != -1){
            return firstTry;
        }
        //try to search in second half
        return orderAgnosticBS(array,target,peak+1,array.length-1);
    }
    static int peakIndexInMountainArray(int[] array,int target){
        int start = 0;
        int end = array.length-1;

        while(start < end){
            int mid = start + (end - start )/2;
            if(array[mid] > array[mid + 1]){
                end = mid;
            }else {
                start = mid + 1;
            }
        }return start; //or end
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end){

        //find whether the array is sorted in ascending or descending;
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            //Find the middle element
//            int mid = (start+end)/2; //might be possible that (start+end) exceed the int range.
            int mid = start + (end - start) / 2;
            if (arr[mid] == target){
                return mid;
            }
            if (isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }else {
                if(target > arr[mid]){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
