package dxat.deviceManager.server.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import dxat.deviceManager.server.DeviceManagerImpl;
import dxat.deviceManager.server.entities.DeviceEntity;

public class DeviceResources {

	public DeviceResources() {

	}

	@GET
	@Path("{deviceName}/")
	@Consumes("application/json")
	public JSONObject getDevice(@PathParam("deviceName") String deviceName)
			throws JSONException {
		DeviceEntity device;
		try {
			device = DeviceManagerImpl.getInstance().getDevice(deviceName);
		} catch (Exception e) {
			return new JSONObject();
		}
		
		return new JSONObject().put("name", device.getName())
				.put("ipAddress", device.getIp())
				.put("description", device.getDescription());
	}

	
	
}
