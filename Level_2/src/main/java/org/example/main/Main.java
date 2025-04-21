package org.example.main;


import org.example.classes.StockAgency;
import org.example.classes.StockAgent;

public class Main {
	public static void main(String[] args) {

		StockAgent agent = new StockAgent();

		StockAgency agency1 = new StockAgency("Agency 1");
		StockAgency agency2 = new StockAgency("Agency 2");

		agent.addObserver(agency1);
		agent.addObserver(agency2);

		agent.setMarketStatus("Going up!");
		agent.setMarketStatus("Stable");
		agent.setMarketStatus("Going down.");

		agent.removeObserver(agency1);

		agent.setMarketStatus("Going up extremely fast!");
		}
	}
