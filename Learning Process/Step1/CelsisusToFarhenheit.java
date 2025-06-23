import java.util.*;
public class CelsisusToFarhenheit{
    private double celsisus;
    private double farhenheit;
    public CelsisusToFarhenheit(){
        super();
    }
    public CelsisusToFarhenheit(double celsisus){
        this.celsisus = celsisus;
    }
    public double getCelcisus(){
        return celsisus;
    }
    public double getFarhenheit(){
        return farhenheit;
    }
    public void setCelsisus(double celsisus){
        this.celsisus = celsisus;
    }
    public void setFarhenheit(double farhenheit){
        this.farhenheit = farhenheit;
    }
    public static void calculateFarhenheit(CelsisusToFarhenheit obj){
        obj.farhenheit = (obj.celsisus * 9 / 5) + 32;
        System.out.println("The temperature in Celsius: " + obj.celsisus + " is equal to " + obj.farhenheit + " in Fahrenheit.");
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        CelsisusToFarhenheit obj = new CelsisusToFarhenheit();
        System.out.print("Enter the temperature in Celsius: ");
        obj.celsisus = scanner.nextDouble();
        calculateFarhenheit(obj);
        scanner.close();
    }
}