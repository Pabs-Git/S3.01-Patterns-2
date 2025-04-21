package org.example.classes;

import org.example.interfaces.Observer;

public class StockAgency implements Observer {
	private String agencyName;

	public StockAgency(String agencyName) {
		this.agencyName = agencyName;
	}

	@Override
	public void update(String stockMarketStatus) {
		System.out.println(agencyName + " has been updated: The market is: " + stockMarketStatus);
	}
}
