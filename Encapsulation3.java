class Rectangle
{
    private int length;
    private int width;
    int area;
    int parimeter ;
    public void setArea(int length,int width)
    {
        this.length = length;
        
        this.area = length*width;

    }
    public void setParimeter(int length,int width)
    {
        this.width = width;
      
        this.parimeter = 2*(length+width);
    }
    public int getArea()
    {
        return this.area;
    }
    public int getParimeter()
    {
        return this.parimeter;
    }
}
public class Encapsulation3 {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        obj.setArea(4,6);
        obj.setParimeter(6,7);
       System.out.println(obj.getArea());
       System.out.println(obj.getParimeter());
    }
}
