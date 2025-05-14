package com.inheritance;

public class SmartHomeDemo {

	public static void main(String[] args) {
		
		NetworkConnectable alexa = new SmartSpeaker("Alexa");
		
		alexa.connecToWifi("123");
		

	}

}
