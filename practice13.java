// Родительский класс

class Animal {

    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Животное издаёт звук");
    }

    // Дополнительное задание 1: метод info()
    public void info() {
        System.out.println("Имя: " + name + ", Возраст: " + age + " лет");
    }
}

// Дочерний класс Dog
class Dog extends Animal {

    // Дополнительное задание 2: поле breed
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age); // вызов конструктора родителя
        this.breed = breed;
    }

    // Конструктор без породы для обратной совместимости
    public Dog(String name, int age) {
        this(name, age, "неизвестная порода");
    }

    @Override
    public void makeSound() {
        System.out.println("Гав-гав!");
    }

    // Дополнительный метод для Dog
    public void displayBreed() {
        System.out.println("Порода: " + breed);
    }
}

// Дочерний класс Cat
class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Мяу!");
    }
}

// Дополнительный класс Bird
class Bird extends Animal {

    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Чирик-чирик!");
    }
}

// Точка входа
public class practice13 {

    public static void main(String[] args) {
        Dog dog = new Dog("Бобик", 3, "Овчарка");
        Cat cat = new Cat("Мурка", 2);

        dog.makeSound(); // Гав-гав!
        cat.makeSound(); // Мяу!

        System.out.println("\n=== Дополнительные задания ===");

        // Дополнительное задание 1: метод info()
        System.out.println("\n1. Информация о животных:");
        dog.info();
        cat.info();

        // Дополнительное задание 2: поле breed
        System.out.println("\n2. Информация о породе собаки:");
        dog.displayBreed();

        // Дополнительное задание 3: ArrayList<Animal>
        System.out.println("\n3. Работа с ArrayList<Animal>:");

        java.util.ArrayList<Animal> animals = new java.util.ArrayList<>();
        animals.add(dog);
        animals.add(cat);
        animals.add(new Bird("Кеша", 1));

        System.out.println("\nЗвуки всех животных в списке:");
        for (Animal animal : animals) {
            animal.makeSound();
        }

        System.out.println("\nИнформация о всех животных:");
        for (Animal animal : animals) {
            animal.info();
        }
    }
}
