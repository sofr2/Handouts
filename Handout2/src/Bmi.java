
public class Bmi {

	public static void main(String[] args) {
		double mass1 = 60; 		// declaring the first mass variable 
		double height1 = 164; // declaring the first height variable 
		double mass2 = 60;  // declaring the second mass variable 
		double height2 = 180; // declaring the second height variable 
		double bmi1; // declaring first bmi 
		double bmi2; // declaring second bmi 
		bmi1 = mass1/Math.pow(height1,2) * 100; // calculate the first bmi 
		bmi2 = mass2/Math.pow(height2, 2) * 100; // calculate the second bmi 
		System.out.println("First BMI:"+ bmi1); // print out first bmi 
		System.out.println("Second BMI:" + bmi2); // print out second bmi 
	}
}
