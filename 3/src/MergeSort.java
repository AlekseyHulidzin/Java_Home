import java.util.Arrays;


public class MergeSort {

    public static Integer[] mergeSort(Integer[] arr) {
        int mid = arr.length / 2;
        if (arr.length < 2) return arr;
        Integer[] Left = Arrays.copyOfRange(arr, 0, mid);
        Integer[] Right = Arrays.copyOfRange(arr, mid, arr.length);
        return merge(mergeSort(Left), mergeSort(Right));
    }

    public static Integer[] merge(Integer[] left, Integer[] right) {
        Integer[] arr = new Integer[left.length + right.length];
        int i=0, j=0, k=0;
        while (i < left.length && j < right.length) {
            arr[k++] = left[i] < right[j] ? left[i++]:right[j++];
        }
        if(i < left.length) {
            while (i < left.length) {
                arr[k++] = left[i++];
            }
          } else if(j < right.length) {
            while (j < right.length) {
                arr[k++] = right[j++];
            }
          }


        return arr;
    }
}