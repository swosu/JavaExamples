package helloJavaOOP;
public class helloJavaClassSameFile {
	public static void main(String[] args) {
		customClassHelloJavaClassSameFile ourObject = 
				new customClassHelloJavaClassSameFile();
		ourObject.sayHello();
	}
}

class customClassHelloJavaClassSameFile {
	customClassHelloJavaClassSameFile(){
	}
	void sayHello() {
		System.out.println("Hello Java from inside a class!");
	} 
}
