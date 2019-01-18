package exception;

public class Demo8 {
	public static void main(String[] args) {
		Employee e= new Employee();
		e.setId(1);
		e.setName("Payal");
		try {
			e.setAge(4);
			} catch (Exception e1) {
			System.out.println(e1.getMessage());
		}
	}
}

class Employee{
	
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
	public void setAge(int age) throws Exception {
		if(age>18) {
		this.age = age;
		}
		else {
			throw new Exception("Invalid age");
		}
	}
}