class Shape
{
    void draw()
    {
        System.out.println("Draw");
    }
}
class Circle extends Shape
{
    void calculateArea()
    {
        System.out.println("Area");
    }
}
public class SingleInheritance2 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.calculateArea();
        c.draw();
    }
}
