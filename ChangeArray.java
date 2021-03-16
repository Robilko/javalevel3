package Java_3_Proffesionalevel.Lesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class ChangeArray<T> {

    public  T[] changeElement(T[] arr, int i, int j) {
        T tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
        return arr;
    }

    public ArrayList<T> toArrayList(T[] arr) {
        return new ArrayList<>(Arrays.asList(arr));
    }
}
