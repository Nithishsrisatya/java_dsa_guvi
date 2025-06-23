import java.util.Scanner;
public class AreaOfCircle {
    private double radius;
    public AreaOfCircle(){
        super();
    }
    public AreaOfCircle(double radius) {
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public static void areaOfCircle(AreaOfCircle circle){
        double area = Math.PI * Math.pow(circle.radius,2);
        System.out.println("The area of the circle with radius: " + circle.radius + " is:" + area);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        AreaOfCircle circle = new AreaOfCircle();
        System.out.print("Enter the radius of the circle: ");
        circle.radius = scanner.nextDouble();
        areaOfCircle(circle);
        scanner.close();
    }
}
