package carauctionv2;

import javax.swing.JOptionPane;

public class CarAuctionV2 {
	
	
static String input = "";
static int selection = 0;
static Car [] car = new Car[100];
static int carCount = 0;
static int foundAt = -1;
static String  searchVIN = "";

	public static void main (String[] args){
		
		JOptionPane.showMessageDialog(null, "Welcome to the car Auctioneer");
		while(selection != 4) {
			menu();
			switch(selection) {
			case 1 : 
			car[carCount] = new Car();
			car[carCount].getInfo();
			car[carCount].report();
			carCount++;
			break;
			case 2 : displayAllCars();
			break;
			case 3 : searchCar();
			default : JOptionPane.showMessageDialog(null, "goodbye!! bruh");
			
			}//end switch selection
		}//end while selection

		
	}//end main
	
	public static void menu() {
		input = JOptionPane.showInputDialog("to add a car select - 1" + "\n" + 
											"todisplay all cars - 2" + "\n" +
											"to search a car - 3" + "\n" + 
											"tto exit the program select - 4");
		selection = Integer.parseInt(input);
	}
	
	public static void displayAllCars() {
		for(int i = 0; i < carCount; i++ ) {
			car[i].report();
		}
	}
	
	public static void searchCar() {
		input = JOptionPane.showInputDialog(null, "which VIN would you like to search For ??");
		searchVIN = input;
		int i = 0;
		while (i < carCount) {
			if (car[i].VIN.equals(searchVIN)) {
				car[i].report();
			} else if (!car[i].VIN.equals(searchVIN)) {
				JOptionPane.showMessageDialog(null, " not found);");
						
			} else {
				i++;
			}
		}
	}
	
	
}//end class

class Car {
	static String input = "";
	
	
	String make;
	String model;
	String VIN;
	int year;
	double mileage;
	double originalPrice;
	
	Car(){
		make = "";
		model = "";
		VIN = "";
		year = 0;
		mileage = 0;
		originalPrice = 0;
	}//end car w/o construcotrs
	
	Car(String make,String model,String VIN,int year,double mileage,double originalPrice){
		this.make = make;
		this.model = model;
		this.VIN = VIN;
		this.year = year;
		this.mileage = mileage;
		this.originalPrice = originalPrice;
		
	}// car with contrucotrs
	
	void getInfo(){
		input = JOptionPane.showInputDialog("please the enter make of the car : ");
		make = input;
		input = JOptionPane.showInputDialog("please the enter model of the car : ");
		model = input;
		input = JOptionPane.showInputDialog("please the enter VIN of the car : ");
		VIN = input;
		input = JOptionPane.showInputDialog("please the enter year of the car : ");
		mileage = Double.parseDouble(input);
		input = JOptionPane.showInputDialog("please the enter mileage of the car : ");
		originalPrice = Double.parseDouble(input);
		
	}
	
	void report() {
		JOptionPane.showMessageDialog(null,"Make : " + make + "\n" + 
										   "Model : " + model + "\n" +
										   "VIN : " + VIN + "\n" + 
										   "Year : " + year + "\n" + 
										   "Mileasage : " + mileage + "\n" + 
										   "Original Price : " + originalPrice);
	}

}//end car class