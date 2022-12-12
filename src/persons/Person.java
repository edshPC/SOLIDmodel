package persons;

import organs.Heart;

abstract public class Person implements ISetPretext, IReplies {
	
	private static int lastId = 0;
	
	private int id;
	protected String name;
	private Heart heart;
	
	public Person() {
		this.id = lastId + 1;
		lastId = id;
		heart = new Heart(id);
	}
	public Person(String name) {
		this();
		this.name = name;
	}
	
	public Heart getHeart() {
		return heart;
	}
	public int getId() {
		return this.id;
	}
	
	public abstract String thirdName();
	
	@Override
	public String with() {
		return "с " + this + "ом";
	}
	@Override
	public String onHim() {
		return "у него";
	}
	@Override
	public String toWhom() {
		return this + "у";
	}
	@Override
	public String sayWhat(String phrase) {
		return this + " сказал, что это, мол, " + phrase;
	}
	
	@Override
	public String toString() {
		if (name == null) {
			return "человек";
		}
		return name;
	}
	@Override
	public int hashCode() {
		return id;
	}
	@Override
	public boolean equals(Object o) {
		
		if(!(o instanceof Person))
			return false;
		
		Person p = (Person) o;
		class IdChecker implements IEqualChecker {
			private int id1;
			private int id2;
			public IdChecker(int id1, int id2) {
				this.id1 = id1;
				this.id2 = id2;
			}
			
			@Override
			public boolean checkIds() {
				return id1 == id2;
			}
		}
		IdChecker checker = new IdChecker(this.id, p.hashCode());
		
		return checker.checkIds();
	}
}
