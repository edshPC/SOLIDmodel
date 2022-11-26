package organs;

public class Heart extends Organ implements IYocking{
	
	private boolean isYocking = false;
	
	public Heart(int id) {
		super(id);
	}
	
	@Override
	public String startYoking() {
		isYocking = true;
		return "������ �����";
	}
	@Override
	public String notYoking() {
		isYocking = false;
		return "�� �����";
	}
	@Override
	public String isYoking() {
		if (isYocking)
			return "�����";
		return "�� �����";
	}
	 
	@Override
	public String toString() {
		return "������";
	}
}
