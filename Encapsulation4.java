class Temperature
{
    private double celsius;
    public Temperature(double celsius)
    {
        this.celsius = celsius;
    }
    public double getFahrenheit()
    {
        return (celsius * 9/5) + 32;
    }
    public void setCelsius(double celsius)
    {
        this.celsius = celsius;
    }
    public double getCelsius()
    {
        return celsius;
    }
}
public class Encapsulation4 {
  public static void main(String[] args) {
    Temperature temp = new Temperature(25.0);
    System.out.println("Celsius : " + temp.getCelsius());
    System.out.println("Fahrenheit : " + temp.getFahrenheit());
    temp.setCelsius(30.0);
    System.out.println("Updated Celsius : " + temp.getCelsius());
    System.out.println("Updated Fahrenheit : " + temp.getFahrenheit());
  }  
}
