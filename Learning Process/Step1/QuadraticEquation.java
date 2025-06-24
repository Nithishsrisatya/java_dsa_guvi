import java.util.*;
public class QuadraticEquation {
    private int a;
    private int b;
    private int c;
    private int x;
    public QuadraticEquation(){
        super();
    }
    public QuadraticEquation(int a, int b, int c, int x){
        this.a = a;
        this.b = b;
        this.c = c;
        this.x = x;
    }
    public void setA(int a){
        this.a = a;
    }
    public void setB(int b){
        this.b = b;
    }
    public void setC(int c){
        this.c = c;
    }
    public void setX(int x){
        this.x = x;
    }
    public static void calculate(QuadraticEquation obj){
        int result = obj.a*(int)Math.pow(obj.x, 2)  + obj.b*obj.x + obj.c;
        System.out.println("The result of the quadratic equation " + obj.a + "x^2 + " + obj.b + "x + " + obj.c + " at x = " + obj.x + " is: " + result);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        QuadraticEquation q1 = new QuadraticEquation();
        System.out.print("Enter the value of a: ");
        q1.a = scanner.nextInt();
        System.out.print("Enter the value of b: ");
        q1.b = scanner.nextInt();
        System.out.print("Enter the value of c: ");
        q1.c = scanner.nextInt();
        System.out.print("Enter the value of x: ");
        q1.x = scanner.nextInt();
        calculate(q1);
        scanner.close();
        
    }
}
