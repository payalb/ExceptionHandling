package exception;

public class Demo6 {
	public static void main(String[] args) {
		Employee2 e= new Employee2();
		e.setId(1);
		e.setName("Payal");
		try {
			e.setAge(4/0);
			} catch (InvalidAgeException e1) {
			System.out.println(e1.getMessage());
		}
	}
}

class Employee2{
	
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
	public void setAge(int age) throws InvalidAgeException {
		if(age>18) {
		this.age = age;
		}
		else {
			throw new InvalidAgeException("Invalid age");
		}
	}
}

class InvalidAgeException extends Exception{
	
	public InvalidAgeException(String message) {
		super(message);
	}
}