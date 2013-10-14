package dxat.deviceManager.server;
import java.util.HashMap;

public class DeviceManagerImpl {
	private static DeviceManagerImpl instance;
	private HashMap<String, Device> devices = null;
	
	private DeviceManagerImpl(){
		super();
		this.devices = new HashMap<String, Device>();
		
	}
	public static DeviceManagerImpl getInstance(){
		if(instance==null){
			instance = new DeviceManagerImpl();
			return instance;
		}
		return instance;
	}
	
	public Device getDevice(String id) throws Exception{
		return (Device) this.devices.get(id);
	}
	
	public void putDevice(String id, String ip, String desc){
		this.devices.put(id, new Device(id, ip, desc));
	}
	

}
