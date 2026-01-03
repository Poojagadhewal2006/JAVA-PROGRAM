

class Main{
    int age;
    void sum()
    {
       // System.out.println(this);
        System.out.println(this.age);
    }
}
public class Keyword {
    public static void main(String[] args) {
      Main obj = new Main();
     // System.out.println(obj);
      System.out.println(obj.age);
      obj.sum();  
    }
}
