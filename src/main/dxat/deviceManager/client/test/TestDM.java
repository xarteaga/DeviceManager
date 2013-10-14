package dxat.deviceManager.client.test;

import dxat.deviceManager.server.DeviceManagerImpl;
import dxat.deviceManager.server.entities.DeviceEntity;

public class TestDM {

	public static void main(String[] args){
		
		// TODO Auto-generated method stub
		DeviceManagerImpl impl = DeviceManagerImpl.getInstance();
		
		impl.putDevice("beta.dxat.net", "10.0.0.1", "router");
		impl.putDevice("alpha.dxat.net", "10.0.0.2", "switch");
		impl.putDevice("gamma.dxat.net", "10.0.0.3", "virtualMachine");
	try{
		DeviceEntity dev1 = impl.getDevice("alpha.dxat.net");
		DeviceEntity dev2 = impl.getDevice("gamma.dxat.net");
		DeviceEntity dev3 = impl.getDevice("beta.dxat.net");
		
		System.out.println(dev1.getDescription());
		System.out.println(dev2.getDescription());
		System.out.println(dev3.getDescription());
		}catch (Exception e){
		
		}

	}
}
