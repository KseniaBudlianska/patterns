package sortings;

import java.util.Arrays;

public class Ss {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 3, 488, 8, -3, 90};
        Arrays.stream(arr).forEach(e-> System.out.println(e));
        int[] newArr = sort(arr);
        System.out.println("____");
        Arrays.stream(newArr).forEach(e-> System.out.println(e));
    }

    private static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;

            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;


            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }

        return arr;
    }
}
