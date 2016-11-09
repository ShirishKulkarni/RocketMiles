package com.rocket.miles.home.assignment.bean;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Bean object to maintain the status of CashRegister
 * 
 * @author Shirish
 *
 */
public class CashRegister {

	private Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();

	public CashRegister() {
		super();
		this.map = new LinkedHashMap<Integer, Integer>();
		this.map.put(20, 0);
		this.map.put(10, 0);
		this.map.put(5, 0);
		this.map.put(2, 0);
		this.map.put(1, 0);
	}

	public Map<Integer, Integer> getMap() {
		return map;
	}

	private int getTotal(Map<Integer, Integer> myMap) {
		int total = 0;

		total = 20 * map.get(20) + 10 * map.get(10) + 5 * map.get(5) + 2 * map.get(2) + 1 * map.get(1);

		return total;
	}

	@Override
	public String toString() {
		return "$" + getTotal(this.map) + ":[ status>" + map + "]";
	}

	public int getTotal() {

		return getTotal(this.map);
	}

}
