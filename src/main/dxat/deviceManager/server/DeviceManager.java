package dxat.deviceManager.server;

import dxat.deviceManager.server.entities.DeviceEntity;

public interface DeviceManager {
	
	public DeviceEntity getDevice(String id) throws Exception;
	public void putDevice(String id, String ip, String desc);
	

}
