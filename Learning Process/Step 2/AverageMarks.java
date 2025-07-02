public class AverageMarks {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        
        double totalMarks = 0;
        
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            double marks = scanner.nextDouble();
            totalMarks += marks;
        }
        
        double average = totalMarks / numSubjects;
        System.out.println("The average marks are: " + average);
        
        scanner.close();
    }
}
