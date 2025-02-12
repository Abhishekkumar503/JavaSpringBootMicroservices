public class Search {
    public static void main(String[] args) {
        int[] nums={1,4,6,7,9,13,51,65,76,84};
        int target=9;

        //linearSeach
        int search=linearSeach(nums,51);
        if(search!=-1)
            System.out.println("Element fount at index : "+search);
        else
            System.out.println("Element not found.");

        int search01=binarySearch(nums,target);
        if(search!=-1)
            System.out.println("Element fount at index : "+search01);
        else
            System.out.println("Element not found.");
    }
    static int linearSeach(int[] arr, int target){
        for (int ar:arr) {
            if (arr[ar] == target)
                return ar;
        }
        return -1;
    }
    static int binarySearch(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        int mid=(start+end)/2;
        while(start<end) {
            if(target == arr[mid]){
                return mid;
            }else if(target < arr[mid]){
                end = mid-1;
            }else{
                start = mid+1   ;
            }
        }
        return -1;
    }

}
