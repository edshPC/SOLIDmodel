package things;

import java.io.IOException;

public  class Food extends Thing {
	private int saturation;
	private boolean isDone = false;
	
	public Food(String name, int sat) {
		super(name);
		this.saturation = sat;
	}
	public void make() {
		this.isDone = true;
	}
	public String many() {
		return name.substring(0, name.length()-1) + "и";
	}
	public int getSat() throws FoodNotFoundExeption {
		if (!isDone) {
			throw new FoodNotFoundExeption(name + "а на этот раз не было");
		}
		return saturation;
	}
	
	public static class FoodNotFoundExeption extends IOException {

		FoodNotFoundExeption(String msg) {
			super(msg);
		}
	}
}