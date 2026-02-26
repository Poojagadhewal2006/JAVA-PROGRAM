class Hello{
    int area ;
    int l=3;
    int b=7;
   
    void AreaRectangle()
    { 
        area=l*b;
        System.out.println(area);
    }
 }
 public class Rectangle {
    public static void main(String[] args)
    {
       Hello obj = new Hello();
       obj.AreaRectangle();
    }
}

