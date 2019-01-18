package exception;

public class Demo3 {
	public static void main(String[] args) {
		Integer i = 0;
		while (true) {
			i = new Integer((int) Math.random());
		}

	}
}
//No way u can handle this: code cannot do anything
//OutOfMemory: heap/ perm gen space is full
//StackOverflowError: stack is full