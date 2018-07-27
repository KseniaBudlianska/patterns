package sortings;

import java.util.Arrays;

public class Bs {
    public static void main(String[] args) {
        int[] arr = new int[]{1,0,4,-5,6,8};
        Arrays.stream(arr).forEach(e-> System.out.print(e + ", "));
        System.out.println();
        int[] newArr = bSort(arr);
        Arrays.stream(newArr).forEach(e-> System.out.print(e + ", "));
    }

    private static int[] bSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int el = arr[i];
                    arr[i] = arr[j];
                    arr[j] = el;
                }
            }
        }
        return arr;
    }
}
