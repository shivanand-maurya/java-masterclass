// This program calculates the Body Mass Index (BMI) based on user input for weight and height.
// It also categorizes the BMI into underweight, normal weight, overweight, or obese.
package datatypes;

public class BmiCalculator {
    public static void main(String[] args) {
        // Declare variables for weight and height
        double weight = 76.0; // in kilograms
        double height = 1.7; // in meters

        // Calculate BMI
        double bmi = weight / (height * height);

        // Print the result
        System.out.println("Your BMI is : " + bmi);

        // Determine the weight category
        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        }else if(bmi >= 18.5 && bmi < 24.9) {
            System.out.println("You are normal weight.");
        }else if(bmi >= 25 && bmi < 29.9){
            System.out.println("You are overweight.");
        }else{
            System.out.println("You are obese.");
        }

    }
}
