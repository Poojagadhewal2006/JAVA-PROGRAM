class Book
{
    void read()
    {
        System.out.println("Reading");
    }
}
class Novel extends Book
{
    void storyLine()
    {
        System.out.println("Story Lines");
    }
}
public class SingleLevel3 {
    public static void main(String[] args) {
        Novel obj = new Novel();
        obj.storyLine();
        obj.read(); 
    }
}
