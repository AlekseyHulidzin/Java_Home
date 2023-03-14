import java.util.Arrays;

public class sort {
    
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1,5,4,3,2,7,8,9,7,6,5,4};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(MergeSort.mergeSort(arr)));

    }
}