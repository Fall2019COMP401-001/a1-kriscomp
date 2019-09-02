package a1;

import java.util.*;

public class A1Jedi {
	
	public static void main(String[] args) {
		
		int itemsCount;
		int personCount;
		int numberItemsPerPerson;
		int itemsPerPerson;
		
		String[] itemList = new String[999];
		boolean[] repeat = new boolean[999];
		String itemTitle;
		
		int[] itemNumber = new int[999];
		int[] customerBuy = new int[999];
		
		Scanner scan = new Scanner(System.in);
		
		itemsCount = Integer.valueOf(scan.next());
		personCount = Integer.valueOf(scan.next());

		
		for (int k = 1; k <= itemsCount; k++) {
			itemList[k] = scan.next();
			scan.next();
		}
		
		for (int i = 1; i <= personCount; i++) {
			scan.next();
			scan.next();
			itemsPerPerson = Integer.valueOf(scan.next());
			for (int j = 1; j <= itemsPerPerson; j++) {
				numberItemsPerPerson = Integer.valueOf(scan.next());
				itemTitle = scan.next();
				for (int k = 1; k <= itemsCount; k++) {
					if (itemTitle.equals(itemList[k])) {
						if (repeat[k] == false) {
							customerBuy[k]++;
							repeat[k] = true;
						}
						itemNumber[k] += numberItemsPerPerson;
					}
				}
			}
			for (int k = 1; k <= itemsCount; k++) {
				repeat[k] = false;
			}
		}
		scan.close();
		
		for (int i = 1; i <= itemsCount; i++) {
			if (customerBuy[i] == 0) {
				System.out.print("No ");
				System.out.print("customers bought " +  itemList[i]);
				System.out.println();
			}
			else {
				System.out.print(customerBuy[i] + " ");
				System.out.print("customers bought " + itemNumber[i] + " " + itemList[i]);
				System.out.println();
			}
		}
	}
}