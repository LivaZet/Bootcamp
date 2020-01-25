package jtm.activity05;

import jtm.activity04.Road;
import jtm.activity04.Transport;

import java.util.Locale;

public class Vehicle extends Transport {

	protected int numberOfWheels;

	public Vehicle(String id, float consumption, int tankSize, int wheels) {
		super(id, consumption, tankSize);
		this.numberOfWheels = wheels;
	}

	protected String getTypeOfClass() {
		// TODO return required value
		Class type = this.getClass();
		return type.getSimpleName();
	}

	@Override
	public String move(Road road) {
		float neededFuel = road.getDistance() * getConsumption() / 100;
		if (road.getClass() == Road.class) {
			if (getFuelInTank() >= ((road.getDistance() * getConsumption()) / 100)) {
				setFuelInTank(getFuelInTank() - road.getDistance() * getConsumption() / 100);
			return getId() + " " + getTypeOfClass() + " is driving on " + road.toString() + " with " + numberOfWheels
					+ " wheels";
			}else{
				return "Cannot move on " + road.toString() + ". Necessary fuel:"
						+ String.format(Locale.US, "%.2f", neededFuel) + "l, fuel in tank:"
						+ String.format(Locale.US, "%.2f", getFuelInTank()) + "l";
			}
		} else {
			return "Cannot drive on " + road.toString();
		}
	}

}
