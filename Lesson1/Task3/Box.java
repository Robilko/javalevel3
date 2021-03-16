package Java_3_Proffesionalevel.Lesson1.Task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box <T extends Fruit & SpecialFruit>{
    private ArrayList<T> container;
    private int capacity;

    public Box(int capacity, T... fruits) {
        this.capacity = capacity;
        if (fruits.length > capacity) {
            fruits = Arrays.copyOfRange(fruits, 0, capacity);
        }
        container = new ArrayList<>(Arrays.asList(fruits));
        this.capacity = capacity - fruits.length;
    }

    public void putFruit(T fruit) {
        if (capacity > 0) {
            container.add(fruit);
            capacity--;
        }

    }

    public float getWeight() {
        if (container.isEmpty()) return 0.0f;
        return container.size() * container.get(0).getWEIGHT();
    }

    public boolean CompareWeight(Box<?> anotherBox) {
        return  Math.abs(this.getWeight() - anotherBox.getWeight()) < 0.01;
    }

    public void transferFruitsToAnotherBox(Box<T> anotherBox) {
        if (this == anotherBox) return;

        int countMax = Math.min(container.size(), anotherBox.capacity);
        List<T> fruits = container.subList(0, countMax);
        anotherBox.container.addAll(fruits);
        container.removeAll(fruits);

        anotherBox.capacity -= countMax;
        capacity += countMax;
    }


}
