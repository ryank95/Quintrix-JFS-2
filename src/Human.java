
public class Human implements Eatable {
	private String name;
	private int age;
	
	Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	Human() {
		this.name = "";
		this.age = 0;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void eat() {
		System.out.println(name + ": Mmmmm yummy food");
	}
}
