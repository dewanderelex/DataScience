package Sorting;

public class ShellSort {
    private static void sort(int[] arr){
        for (int gap = arr.length / 2; gap > 0; gap /= 2){
            for (int i = gap; i < arr.length; i++){
                for(int j = i; j - gap >= 0; j -= gap){
                    if (arr[j] < arr[j - gap]) {
                        swap(arr, j, j - gap);
                    }
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
        ShellSort.sort(a1);
        System.out.println(toString(a1));

        int[] a2 = {13,-45,23,65456,53,346,6345,-646,738};
        System.out.println(toString(a2));
        ShellSort.sort(a2);
        System.out.println(toString(a2));
    }
}
