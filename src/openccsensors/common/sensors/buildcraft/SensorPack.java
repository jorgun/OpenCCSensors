package openccsensors.common.sensors.buildcraft;

import openccsensors.OpenCCSensors;
import openccsensors.common.sensors.SensorCard;

public class SensorPack {
	
	public static void init() 
	{
		SensorCard.registerInterface(new BuildCraftSensorInterface());
	}
}
