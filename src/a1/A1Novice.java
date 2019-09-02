package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int personNumber;
		int itemNumber;
		char initial;
		
		String[] name = new String[999];
		String[] costListStr = new String[999];
		double[] cost = new double[999];
		String read;
		
		personNumber = Integer.valueOf(scan.next());
		for (int k = 1; k <= personNumber; k ++) {
			initial = scan.next().charAt(0);
			name[k] = initial + ". " + scan.next();
			itemNumber = Integer.valueOf(scan.next());
			
			for (int i = 1; i <= itemNumber; i ++) {
				read = scan.next();
				scan.next();
				cost[k] += Double.valueOf(scan.next()) * Integer.valueOf(read);
			}
			
			costListStr[k] = String.format("%.2f", cost[k]);
		}
		scan.close();
		
		for (int j = 1; j <= personNumber; j ++) {
			System.out.println(name[j] + ": "+ costListStr[j]);
		}
	}
}
