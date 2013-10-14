/**
 * 
 */
package dxat.deviceManager.server;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author Xavier
 * 
 */
public class Device {
	private String name = "";
	private String ip = "";
	private String description = "";

	public Device(String name, String ip, String description) {
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
