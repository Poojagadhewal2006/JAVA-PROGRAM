class Animal{
    void eat(){
        System.out.println("eatinggggg");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("barkkkkkkk");
    }
}
class Puppy extends Dog{
    void lazy(){
        System.out.println("cutieeeeeeee");
    }
}
public class Multilevel {
    public static void main(String[] args) {
        Puppy obj = new Puppy();
        obj.eat();
        obj.bark();
        obj.lazy();
    }
}
