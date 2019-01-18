package exception;

public class Demo7 {
	public static void main(String[] args) {
		Employee1 e= new Employee1();
		e.setId(1);
		e.setName("Payal");
		e.setAge(4);
		
	}
}

class Employee1{
	
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
			throw new RuntimeException("Invalid age");
		}
	}
}