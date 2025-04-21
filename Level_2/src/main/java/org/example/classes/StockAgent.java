package org.example.classes;

import org.example.interfaces.Observable;
import org.example.interfaces.Observer;

import java.util.*;

public class StockAgent implements Observable {
	private List<Observer> observers;
	private String marketStatus;

	public StockAgent() {
		observers = new ArrayList<>();
	}

	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(marketStatus);
		}
	}

	public void setMarketStatus(String status) {
		this.marketStatus = status;
		notifyObservers();
	}
}
