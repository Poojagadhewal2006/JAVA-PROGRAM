interface Client
{
    void print();
    abstract void show();
}
class Dev implements Client
{
    public void print()
    {
        System.out.println("billllll");
    }
    public void show()
    {
        System.out.println("biryaniiii");
    }
}
public class Interface {
    public static void main(String[] args) {
        Dev obj = new Dev();
        obj.show();
        obj.print();
    }
}
