package OOPS.Inheritance;
/**
 * @author MR
 * ===========
 * 
 *  What is Inheritance:
 *  ==> Inheruance in java is a machanism in which one class aquires all the properties and behavious of a perent class.
 *  
 *  Inheritance represents the IS-A relationship which is also known as a parent-child relationship
 *  for ex:
 *  Dog IS-A Animal
 *  Car IS-A Vehicle
 *  Programmer IS-A Employee
 *  Surgeon IS-A Doctor
 *  etc...
 *  =========================
 *  
 *  Advantages of Inheritance:
 *   Code Reusability
 *   It promotes runtime polimorphism by allowing method overriding 
 *  ===========================
 *   
 *  Desadvantages of Inheritance:
 *   Using inheritance to two classes (parent and child class )get tightly coupled.
 *  
 * =======================
 * Types of Inheritance:
 * 
 *  Single Inhritance : A single Inhritance one class extends another class (one class only)
 *  B extends A
 *  ---------------------
 *  Multiple Inheritance: In multiple inheritance one class can inherit from a derived class. Hence, the derived class becomes the base class for the new class.
 *  c extends B extends A
 *  -------------------------
 *  Hierarchical Inheritance: In Hierarchical Inheriotance, one class is inherited by many sub classes.
 *  B extends A 
 *  C extends A
 *  
 *  /*  
 *  ---------------------------------------
 *  Multiple Inheritance (Not Used in Java):
 *  In Multiple Inheritance, one class extending more than one class. Java doese not support multipul inheritance.
 *  C extends A && B
 *  --------------------------------------
 *  Hybrid Inheritance (Not Used in Java):
 *  Hybrid Inheritance is a combination of any two inhertances. java dose not support hybrid inheritance
 *  D extends B && C extends A
 *   *
 */

class A{
	void showA() {
		System.out.println("ShowA");
	}
}

class B extends A{
	void showB() {
		System.out.println("ShowB");
	}
}

public class Inheri01_IntroInheritance {

	public static void main(String[] args) {
		System.out.println("Intro of Inheritance");
		B b = new B();
		b.showA();
		b.showB();
	}

}
/**
 * Important Points Of Inheritance :-
 * • Inheritance is achieved by using "extends" keyword.
 * 
 * • Every class has a super or say parent class i.e. Object class (but object class does not have any parent class)
 * 
 * • Below does not take part in inheritance:
 * 
 * - Constructors: A subclass inherits all the members (fields, methods, and nested classes) from its superclass. Constructors are not members, so they are not inherited by subclasses, but the constructor of the superclass can be invoked from the subclass.
 * 
 * - Private members: A subclass does not inherit the private members of its parent class. However, if the superclass has public or protected methods (like getters and setters) for accessing its private fields, these can also be used by the subclass. Programming
 * 
 * • There can be only one super classs, not more than that because iava does not support multiple inheritance.
 *  
 */


