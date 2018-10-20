package Sorting;

public class InsertionSort {
    private static void sort(int[] arr){
        for (int i = 1; i < arr.length; i++){
            for (int j = i; j > 0; j--){
                if (arr[j] < arr[j - 1]){
                    swap(arr, j, j - 1);
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static String toString(int[] arr){
        String result = "";
        for (int i = 0; i < arr.length; i++){
            result += arr[i] + " ";
        }
        return result;
    }

    public static void main(String[] args){
        // Test cases
        int[] a1 = {3,5,7,8,5,4,45,7,5,4,65};
        System.out.println(toString(a1));
        InsertionSort.sort(a1);
        System.out.println(toString(a1));

        int[] a2 = {13,-45,23,65456,53,346,6345,-646,738};
        System.out.println(toString(a2));
        InsertionSort.sort(a2);
        System.out.println(toString(a2));
    }
}
