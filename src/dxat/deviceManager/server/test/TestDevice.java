package dxat.deviceManager.server.test;

import dxat.deviceManager.server.Device;

public class TestDevice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--- TESTING DEVICE ---");
		
		System.out.println("Creating Device...");
		Device device = new Device("My Device", "127.0.0.1", "This device");
		
	}

}
