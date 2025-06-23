import java.util.*;
public class PerimeterAndAreaOfRectangle {
    private int length;
    private int width;
    private int area;
    private int perimeter;
    public PerimeterAndAreaOfRectangle(){
        super();
    }
    public PerimeterAndAreaOfRectangle(int length, int width){
        this.length = length;
        this.width = width;
    }
    public void setLength(int length){
        this.length = length;
    }
    public int getLength(){
        return length;
    }
    public void setwidth(int width){
        this.width = width;
    }
    public int getWidth(){
        return width;
    }
    public void setArea(int area){
        this.area = area;
    }
    public int getArea(){
        return area;
    }
    public void setPerimeter(int perimeter){
        this.perimeter = perimeter;
    }
    public int getPerimeter (){
        return perimeter;
    }
    public static void calculateArea(PerimeterAndAreaOfRectangle obj){
        obj.area = obj.length * obj.width;
        System.out.println("The area of the Rectangle is: " + obj.area);
    }
    public static void calculatePerimeter(PerimeterAndAreaOfRectangle obj){
        obj.perimeter = 2 * (obj.length + obj.width);
        System.out.println("The perimeter of the Rectangle is: " + obj.perimeter);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        PerimeterAndAreaOfRectangle obj = new PerimeterAndAreaOfRectangle();
        System.out.println("Enter the Length of the rectangle: ");
        obj.length = scanner.nextInt();
        System.out.println("Enter the Width of the rectangle: ");
        obj.width = scanner.nextInt();
        calculateArea(obj);
        calculatePerimeter(obj);
        scanner.close();
    }
}
