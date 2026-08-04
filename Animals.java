class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
    void sleep() {
        System.out.println("Animal is sleeping.");
    }
}
class Bird extends Animal {
    void eat() {
        System.out.println("Bird is eating seeds.");
    }
    void sleep() {
        System.out.println("Bird is sleeping in its nest.");
    }
    void fly() {
        System.out.println("Bird is flying.");
    }
}
public class Animals{
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();
        System.out.println();
        Bird bird = new Bird();
        bird.eat();
        bird.sleep();
        bird.fly();
    }
}
