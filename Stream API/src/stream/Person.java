package stream;

public class Person {
	String name;
	int billions;
	
	public Person(String name, int billions) {
		this.name = name;
		this.billions = billions;
	}
	
	public String getName() {
		return name;
	}
	
	public int getMoney() {
		return billions;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Name: " + getName() + "\n");
		sb.append("Net worth: " + getMoney() + " billion US dollars\n");
		
		return sb.toString();
	}
}
