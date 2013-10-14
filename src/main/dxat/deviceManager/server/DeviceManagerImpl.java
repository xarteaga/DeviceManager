package dxat.deviceManager.server;

import java.util.HashMap;

import dxat.deviceManager.server.entities.DeviceEntity;

public class DeviceManagerImpl implements DeviceManager {
	private static DeviceManagerImpl instance;
	private HashMap<String, DeviceEntity> devices = null;

	private DeviceManagerImpl() {
		super();
		this.devices = new HashMap<String, DeviceEntity>();
		this.putDevice("Aplpha", "10.0.0.1", "Something for test");
		this.putDevice("Beta", "10.0.0.2", "Something for test");

	}

	public static DeviceManagerImpl getInstance() {
		if (instance == null) {
			instance = new DeviceManagerImpl();
			return instance;
		}
		return instance;
	}

	public DeviceEntity getDevice(String id) throws Exception {
		return (DeviceEntity) this.devices.get(id);
	}

	public void putDevice(String id, String ip, String desc) {
		this.devices.put(id, new DeviceEntity(id, ip, desc));
	}

}
