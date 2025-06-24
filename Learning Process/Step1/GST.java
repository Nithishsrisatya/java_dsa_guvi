import java.util.*;
public class GST{
    private int Amount;
    private float gstPercentage = 0.18f;
    private float discountPercentage = 0.10f;
    private float gstAmount;
    private float discountAmount;
    public GST(){
        super();
    }
    public GST(int Amount){
        this.Amount = Amount;
    }
    public void setTotalAmount(int Amount){
        this.Amount = Amount;
    }
    public int getAmount(){
        return Amount;
    }
    public float getGstPercentage(){
        return gstPercentage;
    }
    public float getDiscountPercentage(){
        return discountPercentage;
    }
    public float getGstAmount(){
        return gstAmount;
    }
    public float getDiscountAmount(){
        return discountAmount;
    }
    public static void calculateGst(GST obj){
        obj.gstAmount = obj.Amount * obj.gstPercentage;
        System.out.println("The GST amount is: " + obj.gstAmount);
    }
    public static void calculateDiscount(GST obj){
        obj.discountAmount =  (obj.Amount + obj.gstAmount) * obj.discountPercentage;
        System.out.println("The discount amount is: " + obj.discountAmount);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        GST obj = new GST();
        System.out.print("Enter the total amount: ");
        obj.Amount = scanner.nextInt();
        calculateGst(obj);
        calculateDiscount(obj);
        System.out.println("Total after applied GST " + obj.gstAmount + " and Discount " + obj.discountAmount + " is: " + (obj.Amount + obj.gstAmount - obj.discountAmount));
        scanner.close();
    }
}