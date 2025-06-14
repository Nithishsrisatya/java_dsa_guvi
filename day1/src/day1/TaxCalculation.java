/*
 * Tax Calculation Problem based on 2025 Govt Norms.

Input data: name of the employee, location of the employee, designation of the employee, basic salary
HRA 15% of basic if the employee lives in a cosmopolitan city, semi-urban city 10%, rural 5% in a rural area
A monthly bonus of 20% of basic salary
DA of 12% on basic salary

Level1:
Calculate the monthly salary without a bonus.
Calculate the monthly gross salary.
Calculate the annual gross salary.

Print employee details
Print the monthly gross salary.
Print the annual gross salary.
Print the bonus earned for the year.

Level2:
The income tax slabs are as follows:
Upto 5 lakhs: No Tax
5,00,001 to 8,00,000 10%
8,00,001 to 10,00,000 15%
10,00,001 to 12,00,000 20%
12,00,001 to 15,00,000 20%
15,00,001 to 20,00,000 25%
Above 20 Lakhs 30%

The Charity amount under 80G can be deducted from the gross salary.
The interest paid on a Home Loan of up to 1,20,000 can be claimed.
Under section 87, if eligible, you can claim up to 3 lakhs.

Print the taxable income.

Level3:
Print employee details
Print salary details (basic, monthly gross, annual gross, annual bonus)
Print taxable income
Print total standard deductions.
Print the tax amount payable.
 */
package day1;
import java.util.Scanner;

public class TaxCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name, location, designation;
        float basic=0.0f, hra = 0.0f, da=0.0f, bonus=0.0f, monthlyGross=0.0f, annualGross=0.0f, annualBonus=0.0f;
        float charity=0.0f, homeLoanInterest=0.0f, section87Deduction=0.0f;

        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();

        System.out.print("Enter Location (urban/semiurban/rural): ");
        location = sc.nextLine().toLowerCase();

        System.out.print("Enter Designation: ");
        designation = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        basic = sc.nextFloat();

        System.out.print("Enter Charity Amount under BBG: ");
        charity = sc.nextFloat();

        System.out.print("Enter Home Loan Interest Paid: ");
        homeLoanInterest = sc.nextFloat();

        System.out.print("Enter Section 87 Deduction (0 if not eligible): ");
        section87Deduction = sc.nextFloat();

        if (location.equals("urban")) {
            hra = basic * 0.15f;
        } else if (location.equals("semiurban")) {
            hra = basic * 0.10f;
        } else if (location.equals("rural")) {
            hra = basic * 0.05f;
        }

        da = basic * 0.12f;
        bonus = basic * 0.20f;

        monthlyGross = basic + hra + da;
        annualGross = monthlyGross * 12;
        annualBonus = bonus * 12;

        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Designation: " + designation);

        System.out.println("Monthly Gross Salary: ₹" + monthlyGross);
        System.out.println("Annual Gross Salary: ₹" + annualGross);
        System.out.println("Annual Bonus: ₹" + annualBonus);

        float deductions = charity + homeLoanInterest;
        if (section87Deduction <= 300000) {
            deductions += section87Deduction;
        }

        float taxableIncome = annualGross + annualBonus - deductions;
        float tax = 0;

        if (taxableIncome > 2000000) {
            tax = (taxableIncome - 2000000) * 0.30f + 1250000;
        } else if (taxableIncome > 1500000) {
            tax = (taxableIncome - 1500000) * 0.25f + 1000000;
        } else if (taxableIncome > 1200000) {
            tax = (taxableIncome - 1200000) * 0.20f + 900000;
        } else if (taxableIncome > 1000000) {
            tax = (taxableIncome - 1000000) * 0.20f + 600000;
        } else if (taxableIncome > 800000) {
            tax = (taxableIncome - 800000) * 0.15f + 300000;
        } else if (taxableIncome > 500000) {
            tax = (taxableIncome - 500000) * 0.10f;
        }

        System.out.println("\nFinal Computation:");
        System.out.println("Basic Salary: ₹" + basic);
        System.out.println("Monthly Gross Salary: ₹" + monthlyGross);
        System.out.println("Annual Gross Salary: ₹" + annualGross);
        System.out.println("Annual Bonus: ₹" + annualBonus);
        System.out.println("Total Standard Deductions: ₹" + deductions);
        System.out.println("Taxable Income: ₹" + taxableIncome);
        System.out.println("Tax Payable: ₹" + tax);

        sc.close();
    }
}