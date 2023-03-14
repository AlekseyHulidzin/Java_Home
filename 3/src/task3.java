import java.util.*;

public class task3 {

// Пусть дан произвольный список целых чисел
public static void main(String[] args) {
    List<Integer> list = new ArrayList<>(Arrays.asList(1, 9, 2, 6, 4, 3, 5, 7, 8, 0));
    System.out.println("Array: " + list);
    System.out.println("Min: " + getMin(list));
    System.out.println("Max: " + getMax(list));
    System.out.println("Avg: " + getAverage(list));
}

// Найти минимальное значение
public static Integer getMin(List<Integer> list){
    int min = list.get(0);
    for (Integer item: list){
        if (item < min) min = item;
    }
    return min;
}

// Найти максимальное значение
public static Integer getMax(List<Integer> list){
    int max = list.get(0);
    for (Integer item: list){
        if (item > max) max = item;
    }
    return max;
}

// Найти среднее значение
public static Integer getAverage(List<Integer> list){
    int sum = 0;
    for (Integer item: list) sum += item;
    return sum / list.size();
}

}