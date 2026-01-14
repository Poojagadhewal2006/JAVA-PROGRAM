class Parent
{
    void sum(float a, float b)
    {
        System.out.println(a+b);
    }
    void sum(float a, float b, float c)
    {
        System.out.println(a+b+c);
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Parent obj =new Parent();
        obj.sum(3.f,5.5f);  
      
  }
}

