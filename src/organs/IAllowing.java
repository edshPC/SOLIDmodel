package organs;

import enums.Actions;
import persons.Person;

public interface IAllowing {
	public String isAllowing(boolean isAllow, Actions act, Person p);
}
