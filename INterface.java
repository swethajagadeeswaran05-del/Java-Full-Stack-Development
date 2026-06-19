// Extension allowed, modification not allowed (Open-Closed Principle)

class INterface {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.sound();
        a2.sound();
    }
}
interface Animal {
    void sound();
}
class Dog implements Animal {
    public void sound() {
        System.out.println("Bow Bow");
    }
}
class Cat implements Animal {
    public void sound() {
        System.out.println("Meow Meow");
    }
}