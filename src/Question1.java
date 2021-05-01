public class Question1 {

    static boolean linearSearch(int[] arr, int size, int item, int counter){
        if (arr[counter] == item){
            return true;
        }
        if (counter >= size - 1){
            return false;
        }
        return linearSearch(arr, size, item, counter + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int item = 11;
        System.out.println(linearSearch(arr, arr.length, item, 0));
        item = 10;
        System.out.println(linearSearch(arr, arr.length, item, 0));
    }
}
