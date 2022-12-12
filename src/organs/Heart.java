package organs;

public class Heart extends Organ implements IYocking{
	
	private boolean isYocking = false;
	
	public Heart(int id) {
		super(id);
	}
	
	@Override
	public String startYoking() throws CantYokingExeption {
		if(isYocking)
			throw new CantYokingExeption("—ердце уже екает");
		
		isYocking = true;
		return "начало екать";
	}
	@Override
	public String notYoking() throws CantYokingExeption {
		if(!isYocking)
			throw new CantYokingExeption("—ердце и так не екает");
			
		isYocking = false;
		return "не екает";
	}
	@Override
	public String isYoking() {
		if (isYocking)
			return "екало";
		return "не екало";
	}
	
	public static class CantYokingExeption extends RuntimeException {
		CantYokingExeption(String msg) {
			super(msg);
		}
	}
	 
	@Override
	public String toString() {
		return "сердце";
	}
}
