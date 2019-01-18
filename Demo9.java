package exception;

public class Demo9 {
	public static void main(String[] args) {
		Employee3 e= new Employee3();
		e.setId(1);
		e.setName("Payal");
		e.setAge(4/0);
		
	}
}

class Employee3{
	
	int id;
	String  name;
	int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
		if(age>18) {
		this.age = age;
		}
		else {
			throw new InvalidagesException("Invalid age");
		}
	}
}

class InvalidagesException  extends RuntimeException{
	public InvalidagesException(String message) {
		super(message);
	}
}