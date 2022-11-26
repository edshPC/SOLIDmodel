package places;

public class World extends Place {
	
	public World() {
		super("мир");
	}
	
	@Override
	public String cuda() {
		return "в " + name;
	}
	@Override
	public String gde() {
		return "в " + name + "е";
	}
	@Override
	public String kChemu() {
		return "к " + name + "у";
	}
}
