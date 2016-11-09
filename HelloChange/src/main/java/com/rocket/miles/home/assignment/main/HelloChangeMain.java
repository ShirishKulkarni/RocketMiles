package com.rocket.miles.home.assignment.main;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import com.rocket.miles.home.assignment.change.HelloChange;

public class HelloChangeMain {

	/**
	 * Main method with Menu
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("HelloChange!");
		System.out.println("Ready!");
		HelloChange h = HelloChange.getInstance();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1.SHOW  2.PUT 3.TAKE 4. CHANGE 5.EXIT");

			int opt = sc.nextInt();

			switch (opt) {
			case 1:
				System.out.println("SHOW");
				h.show();
				break;
			case 2:
				System.out.println("PUT>>Enter denomination: #$20 #$10 #$5 #$2 #$1");
				Map<Integer, Integer> map = getData();
				if (map == null) {
					System.out.println("InValid Input");
				} else {
					h.put(map);
				}
				h.show();
				break;
			case 3:
				System.out.println("TAKE>>Enter denomination: #$20 #$10 #$5 #$2 #$1");
				Map<Integer, Integer> mapX = getData();
				if (mapX == null) {
					System.out.println("InValid Input");
				} else {
					h.take(mapX);
				}
				h.show();
				break;
			case 4:
				System.out.println("CHANGE>>Enter the change:");
				opt = sc.nextInt();
				h.change(opt,20);
				h.show();
				break;
			case 5:
				System.out.println("EXIT");
				sc.close();
				System.exit(0);
			}

		}

	}

	/**
	 * takes input from console
	 * 
	 * @return
	 */
	private static Map<Integer, Integer> getData() {
		Map<Integer, Integer> mapX = new LinkedHashMap<Integer, Integer>();

		Scanner s = new Scanner(System.in);

		int count = 5;

		Scanner numScanner = new Scanner(s.nextLine());
		for (int i = 0; i < count; i++) {
			if (numScanner.hasNextInt()) {
				mapX.put(getKey(i), numScanner.nextInt());
			} else {

				return null;
			}
		}

		return mapX;
	}

	/**
	 * private method to maintain the order for the currency to be shown
	 * 
	 * @param i
	 * @return
	 */
	private static Integer getKey(int i) {
		if (i == 0) {
			return 20;
		} else if (i == 1) {
			return 10;
		} else if (i == 2) {
			return 5;
		} else if (i == 3) {
			return 2;
		} else {
			return 1;
		}
	}

}
