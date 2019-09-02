package a1;

import java.util.*;

public class A1Adept {
	public static void main(String[] args) {
		
		String firstName; 
		String readThis;
		String maxName = "";
		String minName = "";
		
		int personNumber; 
		int itemNumber;
		int itemOfperson;
		int itemNumberinPerson;
		
		String[] nameList = new String[999];
		String[] itemsList = new String[999];
		double[] priceList2 = new double[999];
		double[] priceList = new double[999];

		double min = 10000;
		double max = 0;
		double average;
		double sum = 0;
		Scanner scan = new Scanner(System.in);
		itemNumber = Integer.valueOf(scan.next());
		for (int i = 1; i <= itemNumber; i++) {
			itemsList[i] = scan.next();
			priceList2[i] = Double.valueOf(scan.next());
		}
		
		personNumber = Integer.valueOf(scan.next());
		for (int i = 1; i <= personNumber; i++) {
			
			firstName = scan.next();
			nameList[i] = firstName + " " + scan.next();
			itemOfperson = Integer.valueOf(scan.next());
			
			for (int j = 1; j <= itemOfperson; j++) {
				itemNumberinPerson = Integer.valueOf(scan.next());
				readThis = scan.next();
				
				for (int m = 1; m <= itemNumber; m++) {
					if (readThis.equals(itemsList[m])) {
						priceList[i] += itemNumberinPerson * priceList2[m];
					}
				}
			}
		}
		scan.close();
		for (int k = 1; k <= personNumber; k++) {
			if (max < priceList[k]) {
				max = priceList[k];
				maxName = nameList[k];
			}
			if (min > priceList[k]) {
				min = priceList[k];
				minName = nameList[k];
			}
			sum += priceList[k];
		}
		average = sum / personNumber;
		
		System.out.println("Biggest: " + maxName + " (" + String.format("%.2f", max) + ")");
		System.out.println("Smallest: " + minName + " (" + String.format("%.2f", min) + ")");
		System.out.println("Average: " + String.format("%.2f", average));
	}
}