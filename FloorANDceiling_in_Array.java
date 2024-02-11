public class FloorANDceiling_in_Array {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
//        int ans = ceiling(arr,target);
        int ans = floor(arr,target);
        System.out.println(ans);
    }
    //Ceiling of a number..
//    static int ceiling(int[] arr,int target){
//        int start = 0;
//        int end = arr.length-1;
//        while (start<=end){
//            int mid = start + (end-start);
//            if(target<arr[mid]){
//                end = mid - 1 ;
//            } else if (target>arr[mid]) {
//                start = mid + 1;
//            }else {
//                return arr[mid];
//            }
//        }
//        return arr[start];
//    }

    //Floor of a number..
    static int floor(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end-start);
            if(target<arr[mid]){
                end = mid - 1 ;
            } else if (target>arr[mid]) {
                start = mid + 1;
            }else {
                return arr[mid];
            }
        }
        return arr[end];
    }
}
