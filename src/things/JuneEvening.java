package things;

import persons.Person;
import places.House;
import places.Place;

public class JuneEvening extends Thing {
	public JuneEvening() {
		super("�������� �����");
	}
	
	public String chego() {
		return "�������� �������";
	}

	public String thisEves() {
		return "����� ������";
	}
	public String notSame(String thing1, String thing2) {
		return thing1 + " ������ �� ����� �� " + thing2;
	}
	public String thisEve() {
		return "���� �����";
	}
	public String otherEves() {
		return "������ ������";
	}
	public String createdFor(String what, Person who, Place where) {
		String base = "������� ��� " + what + " " + who + "� " + where.gde();
		if(where instanceof House)
			base += " " + ((House)where).whereIs();
		return base;
	}
}
