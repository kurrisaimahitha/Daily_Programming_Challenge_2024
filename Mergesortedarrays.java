import java.util.ArrayList;
import java.util.List;

public class MergeSortedArrays {
    
    public static List<Integer> mergeSortedArrays(int[] arr1, int[] arr2) {
        List<Integer> mergedArray = new ArrayList<>();
        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mergedArray.add(arr1[i]);
                i++;
            } else {
                mergedArray.add(arr2[j]);
                j++;
            }
        }

        while (i < arr1.length) {
            mergedArray.add(arr1[i]);
            i++;
        }

        while (j < arr2.length) {
            mergedArray.add(arr2[j]);
            j++;
        }

        return mergedArray;
    }

    public static void main(String[] args) {
        int[] arr1 = {10, 12, 14};
        int[] arr2 = {1, 3, 5};

        List<Integer> result = mergeSortedArrays(arr1, arr2);
        System.out.println(result);
    }
}
