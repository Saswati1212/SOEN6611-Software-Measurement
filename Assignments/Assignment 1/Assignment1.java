import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment1 {



	public static double distance(double lat1, double lon1, double lat2, double lon2) {

		final int R = 6371; // Radius of the earth

		double latDistance = Math.toRadians(lat2 - lat1);
		double lonDistance = Math.toRadians(lon2 - lon1);

		double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2) + Math.cos(Math.toRadians(lat1))
				* Math.cos(Math.toRadians(lat2)) * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);

		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
		double distance = R * c * 1000; // convert to meters

		return distance * (Math.PI / 180);
	}


	public static void main(String[] args) {

		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Location 1 GPS co-ordinates : ");
			System.out.println("Latitude 1 : ");
			double lat1 = scanner.nextDouble();

			System.out.println("Longitude 1 : ");
			double lon1 = scanner.nextDouble();

			System.out.println("Enter Location 2 GPS co-ordinates : ");
			System.out.println("Latitude 2 : ");
			double lat2 = scanner.nextDouble();

			System.out.println("Longitude 2 : ");
			double lon2 = scanner.nextDouble();

			System.out.println(distance(lat1, lat2, lon1, lon2));


		} catch (InputMismatchException e) {
			System.out.println("please enter the correct co-ordinates"); // fixed the defect
		}

}

}