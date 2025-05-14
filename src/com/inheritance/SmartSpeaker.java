package com.inheritance;

public class SmartSpeaker implements NetworkConnectable, PowerManagable, VoiceControllable {

	private String deviceName;
	private boolean isPoweredOn = false;

	public SmartSpeaker(String deviceName) {

		this.deviceName = deviceName;
	}

	@Override
	public void respondToVoiceCommand(String command) {

		if (isPoweredOn) {

			System.out.println(isPoweredOn + "");
		} else
			System.out.println(deviceName + "is Powered Off");
	}

	@Override
	public void powerOn() {

		isPoweredOn = true;

		System.out.println(deviceName + "Powering on");

	}

	@Override
	public void powerOff() {

		isPoweredOn = false;

		System.out.println(deviceName + "Powering off");

	}

	@Override
	public void connecToWifi(String ssid) {

		System.out.println(deviceName + " Connecting to " + ssid);
	}

	@Override
	public void disconnectFromWifi() {

		System.out.println(deviceName + "Disconnecting from Wifi");
	}

	public void playMusic(String song) {

		if (isPoweredOn) {

			System.out.println(deviceName + " playing " + song);
		}

	}

}
