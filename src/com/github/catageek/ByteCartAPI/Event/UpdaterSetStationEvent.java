package com.github.catageek.ByteCartAPI.Event;

import org.bukkit.event.HandlerList;

import com.github.catageek.ByteCartAPI.AddressLayer.Address;
import com.github.catageek.ByteCartAPI.Wanderer.Wanderer;

/**
 * Event triggered when a local updater modifies the address
 * of a BC9001 sign.
 */
public class UpdaterSetStationEvent extends UpdaterClearStationEvent {
	private final Address newAddress;

	/**
	 * Default constructor
	 * 
	 * @param updater The updater involved
	 * @param oldAddress The old address of the station
	 * @param newAddress The new address of the station
	 * @param name The name of the station
	 */
	public UpdaterSetStationEvent(Wanderer updater, Address oldAddress, Address newAddress, String name) {
		super(updater, oldAddress, name);
		this.newAddress = newAddress;
	}

	private static final HandlerList handlers = new HandlerList();

	public HandlerList getHandlers() {
        return handlers;
	}

	public static HandlerList getHandlerList() {
        return handlers;
    }

	/**
	 * @return the newAddress
	 */
	public Address getNewAddress() {
		return newAddress;
	}
}
