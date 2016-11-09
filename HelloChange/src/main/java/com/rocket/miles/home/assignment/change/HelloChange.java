package com.rocket.miles.home.assignment.change;

import java.util.LinkedHashMap;
import java.util.Map;

import com.rocket.miles.home.assignment.bean.CashRegister;

/**
 * Singleton class to handle all transactions.
 * 
 * @author Shirish
 *
 */
public class HelloChange {

	private CashRegister cashRegister = new CashRegister();
	private static HelloChange helloChange;

	private HelloChange() {
		
	}

	/**
	 * Shows the current status of CashRegister
	 */
	public void show() {
		System.out.println(cashRegister);
	}

	/**
	 * adds the bills in the map to CashRegister
	 * 
	 * @param map
	 */
	public void put(Map<Integer, Integer> map) {

		Map<Integer, Integer> currMap = cashRegister.getMap();
		for (int billNbr : map.keySet()) {
			setBillCount(currMap, billNbr, map.get(billNbr));
		}
	}

	/**
	 * takes the bills in the map if CashRegister has respective bills
	 * 
	 * @param map
	 */
	public void take(Map<Integer, Integer> map) {

		Map<Integer, Integer> currMap = cashRegister.getMap();
		if (checkRegister(currMap, map)) {
			for (int billNbr : map.keySet()) {
				setBillCount(currMap, billNbr, (-1 * map.get(billNbr)));
			}
		} else {
			System.out.println("Sorry!");
		}

	}

	/**
	 * renders change if the bills are exactly present which add upto number
	 * asked by customer
	 * 
	 * @param num
	 */
	public void change(int num,int start) {
		Map<Integer, Integer> currMap = cashRegister.getMap();
		int temp=num;
		if (temp < cashRegister.getTotal()) {
			Map<Integer, Integer> takeMap = new LinkedHashMap<Integer, Integer>();
			int ratio = 0;
			for (int billNbr : currMap.keySet()) {
				ratio = temp / billNbr;
				if (billNbr<=start && ratio > 0 && ratio <= currMap.get(billNbr)) {
					takeMap.put(billNbr, ratio);
					temp = temp % billNbr;
				} else {
					takeMap.put(billNbr, 0);
				}
			}
			if (temp == 0) {
				System.out.println(">>" + takeMap);
				take(takeMap);
			} else {
				if(start/2==0){
				System.out.println("Sorry! No Change...");
				}else{
					change(num,start/2);
				}
			}
			return;
		}
		System.out.println(
				"Change you are asking more than what we are having money(Not sure if I should've told this to customer!!)");
	}

	/**
	 * private method which adds/removes bill
	 * 
	 * @param map
	 * @param billNbr
	 * @param count
	 */
	private void setBillCount(Map<Integer, Integer> map, int billNbr, int count) {
		int curCount = map.get(billNbr);
		if (count >= 0) {
			map.put(billNbr, curCount + count);

		} else {
			map.put(billNbr, curCount + count);
		}

	}

	/**
	 * private method which checks if all bills are present to take from
	 * CashRegister
	 * 
	 * @param currMap
	 * @param map
	 * @return
	 */
	private boolean checkRegister(Map<Integer, Integer> currMap, Map<Integer, Integer> map) {
		for (int billType : currMap.keySet()) {
			if (currMap.get(billType) < map.get(billType)) {
				return false;
			}
		}
		return true;

	}

	public static synchronized HelloChange getInstance() {
		if (helloChange == null) {
			helloChange = new HelloChange();
		}
		return helloChange;
	}

}
