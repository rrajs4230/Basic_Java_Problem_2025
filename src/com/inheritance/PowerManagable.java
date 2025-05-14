package com.inheritance;

interface PowerManagable {
	
	void powerOn();
	void powerOff();
	
	default void batteryStatus() {
		
		System.out.println("Battery Level Checked");
	}

}
