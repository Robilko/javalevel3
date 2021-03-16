package Java_3_Proffesionalevel.Lesson1.Task3;

public class MainClass {
    public static void main(String[] args) {
        Box<Apple> box1 = new Box<>(6, new Apple(), new Apple(), new Apple());
        Box<Apple> box2 = new Box<>(2);
        Box<Orange> box3 = new Box<>(7, new Orange(), new Orange());

        System.out.println("Вес коробок 1 и 3: " + box1.getWeight() + " и " + box3.getWeight());
        System.out.println("Compare: " + box1.CompareWeight(box3));
        System.out.println("Добавим еще 1 апельсин в коробку 3, для проверки:");
        box3.putFruit(new Orange());
        System.out.println("Вес коробок 1 и 3: " + box1.getWeight() + " и " + box3.getWeight());
        System.out.println("Compare: " + box1.CompareWeight(box3));

        System.out.println("Вес коробок с яблоками 1 и 2: " + box1.getWeight() + " и " + box2.getWeight());
        System.out.println("пересыпаем яблоки в другую коробку:");
        box1.transferFruitsToAnotherBox(box2);
        System.out.println("Вес коробок с яблоками 1 и 2 после пересыпки: " + box1.getWeight() + " и " + box2.getWeight());
    }
}
