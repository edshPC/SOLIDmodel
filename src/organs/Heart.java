package organs;

public class Heart extends Organ implements IYocking{
	
	private boolean isYocking = false;
	
	public Heart(int id) {
		super(id);
	}
	
	@Override
	public String startYoking() throws CantYokingExeption {
		if(isYocking)
			throw new CantYokingExeption("������ ��� �����");
		
		isYocking = true;
		return "������ �����";
	}
	@Override
	public String notYoking() throws CantYokingExeption {
		if(!isYocking)
			throw new CantYokingExeption("������ � ��� �� �����");
			
		isYocking = false;
		return "�� �����";
	}
	@Override
	public String isYoking() {
		if (isYocking)
			return "�����";
		return "�� �����";
	}
	
	public static class CantYokingExeption extends RuntimeException {
		CantYokingExeption(String msg) {
			super(msg);
		}
	}
	 
	@Override
	public String toString() {
		return "������";
	}
}
