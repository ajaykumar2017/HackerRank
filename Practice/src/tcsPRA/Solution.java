package tcsPRA;

import java.util.*;

class Vehicle {
	private int number;
	private String name;
	private double price;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Vehicle[] veh = new Vehicle[n];
		for (int i = 0; i < n; i++) {
			veh[i] = new Vehicle();
			veh[i].setNumber(sc.nextInt());
			veh[i].setName(sc.next());
			veh[i].setPrice(sc.nextFloat());
		}
		String vehName = sc.next();

		Vehicle result1 = findVehicleWithMinimumPrice(veh);
		if (result1 != null) {
			System.out.println("number-" + result1.getNumber() + "\n" + "name-" + result1.getName() + "\n" + "price-"
					+ result1.getPrice());
		} else {
			System.out.println("No Vehicle found with mentioned attribute");
		}

		Vehicle result2 = searchVehicleByName(veh, vehName);
		if (result2 != null) {
			System.out.println("number-" + result2.getNumber() + "\n" + "name-" + result2.getName() + "\n" + "price-"
					+ result2.getPrice());
		} else {
			System.out.println("No Vehicle found with mentioned attribute");
		}
	}

	private static Vehicle findVehicleWithMinimumPrice(Vehicle[] vehicle) {
		Vehicle res = null;
		double min = Float.MAX_VALUE;
		for (Vehicle veh : vehicle) {
			if (veh.getPrice() < min) {
				min = veh.getPrice();
				res = veh;
			}
		}
		return res;
	}

	private static Vehicle searchVehicleByName(Vehicle[] vehicle, String name) {
		Vehicle res = null;
		for (Vehicle veh : vehicle) {
			if (veh.getName().equalsIgnoreCase(name)) {
				res = veh;
			}
		}
		return res;
	}

}
