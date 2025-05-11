// This program is used to generate a salary slip for an employee.
// It includes details such as employee name, designation, basic salary, allowances, deductions, and net salary.
// The program calculates the net salary by subtracting deductions from the total salary (basic + allowances).

package datatypes;

public class SalarySlipGenerator {
    public static void main(String[] args) {
        // Employee details
        String employeeName = "John Doe";
        String designation = "Software Engineer";
        double basicSalary = 50000.0;
        double allowances = 15000.0;
        double deductions = 5000.0;

        // Calculate net salary
        double totalSalary = basicSalary + allowances;
        double netSalary = totalSalary - deductions;

        // Display the salary slip
        System.out.println("Salary Slip for " + employeeName);
        System.out.println("Designation: " + designation);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Allowances: " + allowances);
        System.out.println("Deductions: " + deductions);
        System.out.println("Total Salary: " + totalSalary);
        System.out.println("Net Salary: " + netSalary);
        // Display a message based on the net salary
        if (netSalary > 0) {
            System.out.println("Net salary is positive.");
        } else if (netSalary == 0) {
            System.out.println("Net salary is zero.");
        } else {
            System.out.println("Net salary is negative.");
        }
        
        // Display a message based on the total salary
        if (totalSalary > 0) {
            System.out.println("Total salary is positive.");
        } else if (totalSalary == 0) {
            System.out.println("Total salary is zero.");
        } else {
            System.out.println("Total salary is negative.");
        }
        // Display a message based on the net salary

        if (netSalary > 0) {
            System.out.println("Net salary is positive.");
        } else if (netSalary == 0) {
            System.out.println("Net salary is zero.");
        } else {
            System.out.println("Net salary is negative.");
        }
        
        
        

    }
}
