package jtm.activity05;

import jtm.activity04.Road;
import jtm.activity04.Transport;

public class Ship extends Transport {

	protected byte numberOfSails;

	public Ship(String id, float consumption, int tankSize) {
		super(id, consumption, tankSize);
	}

	public Ship(String id, byte sails) {
		super(id, 0, 0);
		this.numberOfSails = sails;
	}

	protected String getTypeOfClass() {
		// TODO return required value
		Class type = this.getClass();
		return type.getSimpleName();
	}

	@Override
	public String move(Road road) {
		// float neededFuel = (road.getDistance() * getConsumption()) / 100;
		if (road instanceof WaterRoad) {
			// if (getFuelInTank() >= neededFuel) {
			// fuelInTank = this.fuelInTank - neededFuel;

			return getId() + " " + getTypeOfClass() + " is sailing on " + road.toString() + " with " + numberOfSails
					+ " sails";
		} else {
			return "Cannot sail on " + road.toString();
		}

	}
}
