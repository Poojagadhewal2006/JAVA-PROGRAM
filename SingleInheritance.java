class Animal
{
  void eat()
  {
    System.out.println("eatinggggg");
  }
}
class Dog extends Animal
{
    void bark()
    {
        System.out.println("barkkkkkkkkkk");
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        Dog obj1 = new Dog();
        obj1.bark();
        obj1.eat();
    }   
}
