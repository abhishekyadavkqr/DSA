package com.abhi;

public class Factory {
	private int items;

	private boolean itemsAvailable(int orders) {
		boolean f = (items >= orders)?true : false;
		
		return f;
	}
	
	public synchronized void consume(int order) throws InterruptedException {
		if(itemsAvailable(order) == false)
		{	
			wait();
		
		}
		items -= order;
		System.out.println("consume "+order);
		notify();	
	}
	
	
	public synchronized void produce(int order) throws InterruptedException {
		if(itemsAvailable(order))
		{
			wait();
		}
		
		items += order;
		System.out.println("Items are produce "+items);
		notify();
		
	}
}
