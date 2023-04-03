import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
 */
public class Reverse {
    public static void main(String[] args){
        List<Integer> arr = new  LinkedList<>();
        for (int i = 0; i < 5; i++) {
            arr.add((int) Math.round(Math.random() * 99));
        }
        System.out.println("стартовый массив "+arr);
        List<Integer> reverse = reverseList(arr);
        System.out.println(reverse);
    }
    public static<T> List<T> reverseList(List<T> list)
    {
        List<T> reverse = new ArrayList<>(list);
        Collections.reverse(reverse);
        return reverse;
    }
}