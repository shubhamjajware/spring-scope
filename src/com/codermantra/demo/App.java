package com.codermantra.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		School schoolObj1 = context.getBean("school", School.class);
		//School schoolObj2 = context.getBean("school", School.class);
		
		//System.out.println(schoolObj1+" / "+schoolObj2);
		System.out.println(schoolObj1.getStudent()); //prototype but returning same hashcode
		System.out.println(schoolObj1.getStudent()); //prototype but returning same hashcode
		
		//context.getBean("student", Student.class);
		/*
		 * SingletonDemo obj1 = context.getBean("singletonDemo", SingletonDemo.class);
		 * SingletonDemo obj2 = context.getBean("singletonDemo", SingletonDemo.class);
		 * 
		 * PrototypeDemo onj3 = context.getBean("prototypeDemo",PrototypeDemo.class);
		 * PrototypeDemo onj4 = context.getBean("prototypeDemo",PrototypeDemo.class);
		 * 
		 * System.out.println(onj3+" / "+onj4);
		 * 
		 * if(onj3==onj4) { System.out.println("Same object returned"); } else {
		 * System.out.println("objects are having prototype"); }
		 */
		
		/*
		 * Student obj1= context.getBean("student", Student.class);
		 * System.out.println("Null or not"+obj1.getName());
		 * obj1.setName("Shubham Raj Jajware");
		 * System.out.println("obj1: "+obj1.getName());
		 * 
		 * Student obj2= context.getBean("student", Student.class);
		 * System.out.println("Second object is: " +obj2.getName());
		 * 
		 */
		
		
	}

}
