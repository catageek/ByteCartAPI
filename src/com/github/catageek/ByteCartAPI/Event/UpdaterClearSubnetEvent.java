package com.github.catageek.ByteCartAPI.Event;

import org.bukkit.event.HandlerList;

import com.github.catageek.ByteCartAPI.AddressLayer.Address;
import com.github.catageek.ByteCartAPI.Wanderer.Wanderer;

/**
 * Event triggered when a region reset updater clears the address
 * of a BC9XXX sign (except BC9001).
 */
public class UpdaterClearSubnetEvent extends UpdaterClearStationEvent {
	private final int length;

	/**
	 * Default constructor
	 * 
	 * @param updater The updater involved
	 * @param oldAddress The old address of the subnet
	 * @param length number of stations this subnet can contain
	 */
	public UpdaterClearSubnetEvent(Wanderer updater, Address oldAddress, int length) {
		super(updater, oldAddress, "");
		this.length = length;
	}

	private static final HandlerList handlers = new HandlerList();

	public HandlerList getHandlers() {
        return handlers;
	}

	public static HandlerList getHandlerList() {
        return handlers;
    }

	/**
	 * Get the numbers of address this subnet can contain
	 *
	 * @return The number of address
	 */
	public int getLength() {
		return length;
	}
}
