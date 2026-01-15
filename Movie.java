class movie1{
    String name = "Puspa";
    int rating = 8;
    int ry = 2021;
    void Film1()
    {
        System.out.println("Movie Name : " + name);
        System.out.println("Movie Rating : " + rating);
        System.out.println("Movie Release year : " + ry);
    }
}
class movie2{
    String name = "Puspa2";
    int rating = 7;
    int ry = 2022;
    void Film2()
    {
        System.out.println("Movie Name : " + name);
        System.out.println("Movie Rating : " + rating);
        System.out.println("Movie Release year : " + ry);
    }
}
class movie3{
    String name = "Animal";
    int rating = 4;
    int ry = 2023;
    void Film3()
    {
        System.out.println("Movie Name : " + name);
        System.out.println("Movie Rating : " + rating);
        System.out.println("Movie Release year : " + ry);
    }
}
class movie4{
    String name = "Ram";
    int rating = 9;
    int ry = 2024;
    void Film4()
    {
        System.out.println("Movie Name : " + name);
        System.out.println("Movie Rating : " + rating);
        System.out.println("Movie Release year : " + ry);
    }
}
class movie5
{
    String name = "KGF";
    int rating = 5;
    int ry = 2025;
    void Film5()
    {
        System.out.println("Movie Name : " + name);
        System.out.println("Movie Rating : " + rating);
        System.out.println("Movie Release year : " + ry);
    }
}
public class Movie {
    public static void main(String[] args) {
        movie1 obj1 = new movie1();
        obj1.Film1();
        movie2 obj2 = new movie2();
        obj2.Film2();
        movie3 obj3 = new movie3();
        obj3.Film3();
        movie4 obj4 = new movie4();
        obj4.Film4();
        movie5 obj5 = new movie5();
        obj5.Film5();
    }
}
