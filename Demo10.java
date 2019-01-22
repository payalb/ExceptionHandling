package exception;

import java.io.IOException;
import java.sql.SQLException;

public class Demo10 {

}
class Parent{
	void m1() throws IOException{}
}

class Child extends Parent{
	void m1() throws ArrayIndexOutOfBoundsException {}
}