interface Vehicle
{
    void start();
}
class Car implements Vehicle
{
    public void start()
    {
        System.out.println("Vehicle is starting....");
    }
}
public class Multiple5 {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
    }
}
