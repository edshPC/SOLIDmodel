package places;

public class Nowhere extends Place {
	
	public Nowhere() {
		super("ничто");
	}
	
	@Override
	public String cuda() {
		return "никуда";
	}
	@Override
	public String gde() {
		return "нигде";
	}
	@Override
	public String kChemu() {
		return "ни к чему";
	}
}
