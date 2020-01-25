package jtm.activity05;

import jtm.activity04.Road;
import jtm.activity04.Transport;

import java.util.Locale;

public class Amphibia extends Vehicle {
	
	private int numberOfWheels;
	private byte numberOfSails;

	public Amphibia(String id, float consumption, int tankSize, byte sails, int wheels) {
		super(id, consumption, tankSize, wheels);
		this.numberOfSails = sails;
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
		if(road.getClass() == Road.class){
			if (getFuelInTank() >= ((road.getDistance() * getConsumption()) / 100)) {
				setFuelInTank(getFuelInTank() - road.getDistance() * getConsumption() / 100);
				return getId() + " " + getTypeOfClass() + " is driving on " + road.toString() + " with " + numberOfWheels + " wheels";
			}else{
				return "Cannot move on " + road.toString() + ". Necessary fuel:"
						+ String.format(Locale.US, "%.2f", neededFuel) + "l, fuel in tank:"
						+ String.format(Locale.US, "%.2f", getFuelInTank()) + "l";
			}
		}else {
			return getId() + " " + getTypeOfClass() + " is sailing on " + road.toString() + " with " + numberOfSails + " sails";
		}
		
	}
	
}
