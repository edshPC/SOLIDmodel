package organs;

public class Heart extends Organ implements IYocking{
	
	private boolean isYocking = false;
	
	public Heart(int id) {
		super(id);
	}
	
	@Override
	public String startYoking() {
		isYocking = true;
		return "начало екать";
	}
	@Override
	public String notYoking() {
		isYocking = false;
		return "не екает";
	}
	@Override
	public String isYoking() {
		if (isYocking)
			return "екало";
		return "не екало";
	}
	 
	@Override
	public String toString() {
		return "сердце";
	}
}
