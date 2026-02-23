class Parent
{
    void Eat()
    {
        System.out.println("Maggie");
    }
}
class Child extends Parent
{
    void Eat()
    {
        //super.Eat();
        System.out.println("Pasta");
    }
}
public class Overriding {
    public static void main(String[] args) {
        //Parent obj = new Child();
        Child obj = new Child();
        obj.Eat();
    }
}
