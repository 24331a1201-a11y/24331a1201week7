class Fruit {
    String name;
    String taste;
    String size;
    Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }
    void eat() {
        System.out.println(name + " tastes " + taste + ".");
    }
}
class Apple extends Fruit {
    Apple(String size) {
        super("Apple", "Sweet", size);
    }
    @Override
    void eat() {
        System.out.println(name + " tastes " + taste + ".");
    }
}
class Orange extends Fruit {
    Orange(String size) {
        super("Orange", "Sour", size);
    }
    @Override
    void eat() {
        System.out.println(name + " tastes " + taste + ".");
    }
}
public class FruitTest {
    public static void main(String[] args) {
      Apple apple = new Apple("Medium");
        Orange orange = new Orange("Large");
        apple.eat();
        orange.eat();
    }
}
