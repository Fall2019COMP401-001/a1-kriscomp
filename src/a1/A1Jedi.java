package a1;

import java.util.Scanner;

public class A1Jedi {
	
	public static void main(String[] args) {
		int personNumber;
		int typesofItemsNumber; 
		int itemNumberOfperson;
		int itemsPerPerson;
		String itemTitle;
		
		int[] itemNumberList = new int[999];
		String[] itemsList = new String[999];
		boolean[] repeat = new boolean[999];
		int[] customerBuyItem = new int[999];
		
		Scanner scan = new Scanner(System.in);
		
		typesofItemsNumber = Integer.valueOf(scan.next());
		
		for (int i = 1; i <= typesofItemsNumber; i++) {
			itemsList[i] = scan.next();
			scan.next();
		}
		personNumber = Integer.valueOf(scan.next());
		for (int i = 1; i <= personNumber; i++) {
			scan.next();
			scan.next();
			
			itemsPerPerson = Integer.valueOf(scan.next());
			
			for (int j = 1; j <= itemsPerPerson; j++) {
				itemNumberOfperson = Integer.valueOf(scan.next());
				itemTitle = scan.next();
				
				for (int k = 1; k <= typesofItemsNumber; k++) {
					if (itemTitle.equals(itemsList[k])) {
						if (repeat[k] == false) {
							customerBuyItem[k] ++;
							repeat[k] = true;
						}
						itemNumberList[k] += itemNumberOfperson;
					}
				}
			}
			for (int k = 1; k <= typesofItemsNumber; k++) {
				repeat[k] = false;
			}
		}
		scan.close();
		
		for (int j = 1; j <= typesofItemsNumber; j++) {
			if (customerBuyItem[j] == 0) {
				System.out.print("No ");
				System.out.print("customers bought " +  itemsList[j]);
				System.out.println();
			}
			else {
				System.out.print(customerBuyItem[j] + " ");
				System.out.print("customers bought " + itemNumberList[j] + " " + itemsList[j]);
				System.out.println();
			}
		}
	}
}