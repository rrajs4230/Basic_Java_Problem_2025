package com.inheritance;

public interface VoiceControllable {
	
	void respondToVoiceCommand(String command);
	
	default void calibrateMicroPhone() {
		
		 System.out.println("Microphone calibration complete");
	}

}
