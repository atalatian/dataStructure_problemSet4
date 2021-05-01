public class Question2 {
    static boolean binarySearch(int[] arr, int item, int first, int last){
        if (first > last){
            return false;
        }
        int mid = (first + last)/2;
        if (arr[mid] == item){
            return true;
        }else if (item < arr[mid]){
            return binarySearch(arr, item, first, mid - 1);
        }
        return binarySearch(arr, item, mid + 1, last);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int item = 11;
        System.out.println(binarySearch(arr, item, 0, arr.length - 1));
        item = 10;
        System.out.println(binarySearch(arr, item, 0, arr.length - 1));
    }
}
