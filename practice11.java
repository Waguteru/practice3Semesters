
import java.util.ArrayList;
import java.util.Collections;

public class practice11 {

    public static void main(String[] args) {
        //Создаём список фруктов
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Яблоко");
        fruits.add("Банан");
        fruits.add("Апельсин");
        fruits.add("Киви");
        fruits.add("Манго");

        //Выводим все элементы
        System.out.println("Исходный список фруктов:");     //дописанный код
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }

        // Удаляем третий элемент 
        fruits.remove(2); // удаляем "Апельсин"
        System.out.println("\nСписок после удаления третьего элемента:"); //дописанный код
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }

        //Проверяем, содержит ли список "яблоко"
        boolean hasApple = fruits.contains("Яблоко");               //дописанный код
        System.out.println("\nСодержит 'Яблоко'? " + hasApple);

        // Сортируем по алфавиту
        Collections.sort(fruits);
        System.out.println("\nОтсортированный список:");
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }

        //создать список имён и выведите только те, которые начинаются на "А"
        ArrayList<String> names = new ArrayList<>();
        names.add("Анна");
        names.add("Борис");
        names.add("Алексей");
        names.add("Мария");
        names.add("Андрей");
        names.add("Сергей");
        names.add("Алина");

        System.out.println("Все имена: " + names);
        System.out.println("\nИмена, начинающиеся на 'А':");

        for (String name : names) {
            if (name.startsWith("А")) {
                System.out.println("- " + name);
            }
        }
    }
}
