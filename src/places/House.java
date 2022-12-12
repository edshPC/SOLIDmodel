package places;

public class House extends Place implements IPointers {
	
	private Place where;
	public House(Place where) {
		super("домик");
		this.where = where;
	}
	
	public String whereIs() {
		return where.gde();
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
