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
		return "������ ��� ��� �������� " + where.gde();
	}
	public String eat(Food what) {
		return "�������� " + what.many();
	}
	public String drink(Food what) {
		return "�������� �� " + what + "��";
	}
	
	@Override
	public String toString() {
		return "���";
	}
}
