import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Scanner userInput = new Scanner(System.in);
		ArrayList<Car> cars = new ArrayList<>();

		int num = Validator.getInt(input, "How many cars are you entering?:");
		int count = 1;

		for (int i = 1; i < num + 1; i++) {
			
			System.out.println("Car:" + i);
			
			int year = Validator.getInt(input, "Please enter the year of your car: ");

			double price = Validator.getDouble(input, "What is the price of your car? : ");

			String make = Validator.getString(userInput, "Please enter the make of the car: ");

			String model = Validator.getString(userInput, "Please enter the model of the car: ");

			cars.add(new Car(make, model, year, price));
			
		}

		// System.out.println("Car make = " + make + ", model = " + model + ", year = "
		// + year + ", price = " + price);
		for(Car car: cars) {
			System.out.println("Car" + count++);
			System.out.println(car.toString());
		}
		

	}

}
