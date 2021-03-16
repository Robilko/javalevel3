package Java_3_Proffesionalevel.Lesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1_2 {
    public static void main(String[] args) {
        System.out.println("Задание 1:");
        System.out.println("Создали массивы:");
        Integer[] arrInt = new Integer[]{1, 2, 3, 4, 5, 6};
        System.out.println("Массив целых чисел " + Arrays.toString(arrInt));
        String[] arrStr = new String[]{"one", "two", "three", "four"};
        System.out.println("Массив стрингов " + Arrays.toString(arrStr));

        System.out.println("Меняем местами элементы в массивах:");
        arrInt = new ChangeArray<Integer>().changeElement(arrInt,1, 2);
        System.out.println(Arrays.toString(arrInt));
        arrStr = new ChangeArray<String>().changeElement(arrStr,1, 2);
        System.out.println(Arrays.toString(arrStr));

        System.out.println("\nЗадание 2:");
        ArrayList<?> arrayListInt = new ChangeArray<>().toArrayList(arrInt);
        System.out.println("ArrayList с целыми числами " + arrayListInt);
        ArrayList<?> arrayListStr = new ChangeArray<>().toArrayList(arrStr);
        System.out.println("ArrayList со стрингами " + arrayListStr);


    }
}
