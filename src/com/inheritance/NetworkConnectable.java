package com.inheritance;

interface NetworkConnectable {
	
	void connecToWifi(String ssid);
	void disconnectFromWifi();
	default void ping() {
		
		System.out.println("Network ping successful");
	}

}
