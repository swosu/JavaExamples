package simpleOOP;

public class HelloFromDifferentClassSameFile {

	public static void main(String[] args) {
		HelloClassDefinition ourObject = new HelloClassDefinition();
		ourObject.sayHelloFromClassDefinition();
	}
}

class HelloClassDefinition {

	HelloClassDefinition(){

	}

	public void sayHelloFromClassDefinition() {
		System.out.println("Hello, World, from inside a custom method inside a custom class.");

	}

}
