package openccsensors.common.sensors.targets;

import java.util.HashMap;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import openccsensors.common.api.ISensorTarget;
import openccsensors.common.helper.EntityHelper;

public class LivingTarget extends EntityTarget implements ISensorTarget {

	public LivingTarget(Object obj, double relativeX, double relativeY,
			double relativeZ) {
		super((Entity) obj, relativeX, relativeY, relativeZ);

	}

	@Override
	public HashMap getExtendedDetails(World world) {

		EntityLiving entityLiving = (EntityLiving) world.getEntityByID(id);

		HashMap retMap = EntityHelper.livingToMap(entityLiving);
		retMap.putAll(getBasicDetails(world));

		return retMap;
	}

	@Override
	public String[] getTrackablePropertyNames() {
		return null;
	}
}