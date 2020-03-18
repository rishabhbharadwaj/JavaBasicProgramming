package InheritanceExamples;

// Example for super keyword

class Person {
	
	void message() {
		System.out.println("In person class");
	}
}

class Student extends Person{
	
	void message() {
		System.out.println("In Student class");
	}
	void display() {
		message();
		super.message();
	}
}

class Test {
	public static void main(String[] args) {
		Student s = new Student();
		s.display();
	}
}
