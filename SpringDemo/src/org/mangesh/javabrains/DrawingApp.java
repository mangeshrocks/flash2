package org.mangesh.javabrains;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	
	public static void main(String[] args) {
		//Triangle triangle = new Triangle();
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		//ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		// for triangle
		/*
		Triangle triangle = (Triangle)context.getBean("triangle");
		triangle.draw();
		
		// for circle
		Circle circle = (Circle) context.getBean("circle");
		circle.draw();
		*/
		//Shape shape = (Shape) context.getBean("triangle");
		//shape.draw();
		
		Shape shape2 = (Shape) context.getBean("circle");
		shape2.draw();
		
		 // print greeting message
		//System.out.println(context.getMessage("greeting", null, "Default Greeting", null));
		
	}

}
	