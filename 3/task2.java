import java.util.*;

public class task2 {

// Пусть дан произвольный список целых чисел
public static void main(String[] args) {
    List<Integer> list = new ArrayList<>(Arrays.asList(1, 9, 2, 6, 4, 3, 5, 7, 8, 0));
    System.out.println("Array: " + list);
    System.out.println("Even removed array: " + removeEvenValue(list));
}

// Нужно удалить из него четные числа
public static List<Integer> removeEvenValue(List<Integer> list){
    Iterator<Integer> it = list.iterator();
    while(it.hasNext()){
        Integer number= it.next();
        if(number % 2 ==0){
            it.remove();
        }
    }
    return list;

}

}