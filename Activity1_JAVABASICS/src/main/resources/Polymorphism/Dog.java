package Polymorphism;

public class Dog extends Animal{

	public void eat(String sKind) {
		System.out.println("Dog is eating");
		super.eat("Dog");
		super.hunt2();

	}
	public void hunt() {
		System.out.println("Dog is hunting");
	}
	public void speak() {
		System.out.println("Dog is barking");
	
}
}