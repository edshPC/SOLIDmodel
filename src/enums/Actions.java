package enums;

public enum Actions {
	FLY("летать"),
	GIVEINCASE("в случае необходимости давать");
	
	
	private String value;
	Actions(String val) {
		this.value = val;
	}
	
	@Override
	public String toString() {
		return this.value;
	}
}
