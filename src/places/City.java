package places;

public class City extends Place implements IPointers{
	
	public City(String name) {
		super(name);
	}
	public String unnamed() {
		return "город";
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
