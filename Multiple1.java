interface Walkable
{
    void walk();
    void run();
}
interface Runnable
{
    void walk();
    void run();
}
class Human implements Walkable,java.lang.Runnable
{
    public void walk()
    {
        System.out.println("Walking....");
    }
    public void run()
    {
        System.out.println("Running....");
    }
}
public class Multiple1 {
    public static void main(String[] args) {
        Human h = new Human();
        h.walk();
        h.run();
    }
}
