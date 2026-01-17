class Device
{
    void powerOn()
    {
      System.out.println("Power On");
    }
}
class Laptop extends Device
{
  void boot()
  {
    System.out.println("Booting");
  }
}
class GamingLaptop extends Laptop
{
    void startGame()
    {
        System.out.println("Start Game ");
    }
}
public class Multilevel2 {
    public static void main(String[] args) {
        GamingLaptop g = new GamingLaptop();
        g.startGame();
        g.boot();
        g.powerOn();
    }
}
