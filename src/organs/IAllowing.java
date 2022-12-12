package organs;

import enums.Actions;

public interface IAllowing {
	public String isAllowing(boolean isAllow, Actions act, String with);
}
