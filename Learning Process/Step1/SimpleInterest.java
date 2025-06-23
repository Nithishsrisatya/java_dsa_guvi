import java.util.*;
public class SimpleInterest {
    private int principle;
    private int time;
    private int rate;
    private double interest;
    public SimpleInterest(){
        super();
    }
    public SimpleInterest(int principle, int time, int rate){
        this.principle = principle;
        this.time = time;
        this.rate = rate;
    }
    public void setPrinciple(int principle){
        this.principle = principle;
    }
    public void setTime(int time){
        this.time = time;
    }
    public void setRate(int rate){
        this.rate = rate;
    } 
    public int getPrinciple(){
        return principle;
    }
    public int getTime(){
        return time;
    }
    public int getRate(){
        return rate;
    }
    public static void calculateInterest(SimpleInterest obj){
        obj.interest = (obj.principle * obj.time * obj.rate) / 100.0;
        System.out.println("The simple interest for principle: " + obj.principle + ", time: " + obj.time + " , with rate: " + obj.rate + " is: " + obj.interest);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        SimpleInterest simpleInterest = new SimpleInterest();
        System.out.println("Enter the value of principle:");
        simpleInterest.principle = scanner.nextInt();
        System.out.println("Enter the value of time:");
        simpleInterest.time = scanner.nextInt();
        System.out.println("Enter the value of rate:");
        simpleInterest.rate = scanner.nextInt();
        calculateInterest(simpleInterest);
        scanner.close();    }
}
