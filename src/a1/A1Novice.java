package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		int personNumber, itemNumber;
		char firstInitial;
		String[] name = new String[9999];
		String[] costListStr = new String[9999];
		double[] cost = new double[9999];
		String read;
		Scanner scan = new Scanner(System.in);
		
		personNumber = Integer.valueOf(scan.next());
		for (int k = 1; k <= personNumber; k ++) {
			firstInitial = scan.next().charAt(0);
			name[k] = firstInitial + ". " + scan.next();
			itemNumber = Integer.valueOf(scan.next());
			for (int i = 0; i < itemNumber; i ++) {
				read = scan.next();
				scan.next();
				cost[k] += Double.valueOf(scan.next()) * Integer.valueOf(readIn);
			}
			costListStr[i] = String.format("%.2f", cost[i]);
		}
		scan.close();
		for (int j = 0; j < personNumber; j ++) {
			System.out.println(name[j] + ": "+ costListStr[i]);
		}
	}
}
