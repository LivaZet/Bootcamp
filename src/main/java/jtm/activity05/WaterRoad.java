package jtm.activity05;

import jtm.activity04.Road;

public class WaterRoad extends Road {
	
	public WaterRoad() {
		super();
	}
	
	public WaterRoad (String from, String to, int distance){
		super(from, to, distance);
	}
	
	protected String getType() {
		// TODO return required value
		String type = this.getClass().getSimpleName();
		return type;
	}

	@Override
	public String toString() {
		return getType() + " " + getFrom() + " — " + getTo() + ", " + getDistance() + "km";
	}
	
}
