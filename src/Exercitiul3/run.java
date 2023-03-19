package Exercitiul3;

public class run {
    public static void main(String[] args) {
        Animal animal1 = new Cat();
        System.out.println("Current state of animal1 is: " +  animal1.walk());
        System.out.println("Current state of animal1 is: " +  animal1.eat());
        Animal animal2 = new Chicken();
        System.out.println("Current state of animal2 is: " +  animal2.talk());
        System.out.println("Current state of animal2 is: " +  animal2.walk());
        Animal animal3 = new Dog();
        Animal animal4 = new Duck();
        Animal animal5 = new Mouse();
    }
}
