package dxat.deviceManager.server.entities;

public class DeviceEntity {
	private String name = null;
	private String ip = null;
	private String description = null;
	public DeviceEntity(String name, String ip, String description) {
		super();
		this.name = name;
		this.ip = ip;
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
