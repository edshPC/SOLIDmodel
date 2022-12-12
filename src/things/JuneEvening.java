package things;

import persons.Person;
import places.House;
import places.Place;

public class JuneEvening extends Thing {
	public JuneEvening() {
		super("июньский вечер");
	}
	
	public String chego() {
		return "июньских вечеров";
	}

	public String thisEves() {
		return "Такие вечера";
	}
	public String notSame(String thing1, String thing2) {
		return thing1 + " совсем не похож на " + thing2;
	}
	public String thisEve() {
		return "этот вечер";
	}
	public String otherEves() {
		return "другие вечера";
	}
	public String createdFor(String what, Person who, Place where) {
		String base = "созданы для " + what + " " + who + "а " + where.gde();
		if(where instanceof House)
			base += " " + ((House)where).whereIs();
		return base;
	}
}
