interface Shape
{
    void area();
}
class Circle implements Shape
{
  public  void area()
  {
    int r=5;
    float area;
    area = 3.14f*r*r;
    System.out.println("Area : " + area);
  }
}
public class Multiple4 {
  public static void main(String[] args) {
    Circle c = new Circle();
    c.area();
  }  
}
