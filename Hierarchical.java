class Animal{
    void eat()
    {
        System.out.println("Eating");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Barkkkk");
    }
}
class Cat extends Animal{
    void milk(){
        System.out.println("Milkkk");
    }
}
public class Hierarchical {
    public static void main(String[] args) {
     Dog d = new Dog();
     d.bark();
     d.eat();
     Cat c = new Cat();
     c.milk();
     c.eat();
    }
}
