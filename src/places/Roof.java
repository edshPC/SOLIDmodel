package places;

public class Roof extends Place implements IPointers{
	
	public Roof() {
		super("крыша");
	}
	
	@Override
	public String cuda() {
		return "на " + name.substring(0, name.length()-1) + "у";
	}
	@Override
	public String gde() {
		return "на " + name.substring(0, name.length()-1) + "е";
	}
	@Override
	public String kChemu() {
		return "к " + name.substring(0, name.length()-1) + "е";
	}
}
