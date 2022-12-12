package persons;

import places.Place;
import things.Food;

public class They {
	private Person[] persons;
	
	public They(Person... persons) {
		this.persons = persons;
	}
	public Person[] getPersons() {
		return persons;
	}
	
	public String sit(Place where) {
		return "сидели вот так рядышком " + where.gde();
	}
	public String eat(Food what) {
		return "уплетали " + what.many();
	}
	public String drink(Food what) {
		return "запивали их " + what + "ом";
	}
	
	@Override
	public String toString() {
		return "они";
	}
}
