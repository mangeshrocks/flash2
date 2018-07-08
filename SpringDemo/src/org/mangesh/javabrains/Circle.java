package org.mangesh.javabrains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;


public class Circle implements Shape{

	private Point center;
	@Autowired
	private MessageSource messageSource;
	
	public MessageSource getMessageSource() {
		return messageSource;
	}
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
	public Point getCenter() {
		return center;
	}
	@Autowired
	@Qualifier("circleRelated")
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		//System.out.println("Drawing Circle!");
		System.out.println(this.messageSource.getMessage("drawing.circle", null, "Default Drawing Message", null));
		
		//System.out.println("Circle Point is : (" + center.getX() +", "+center.getY()+")");
		System.out.println(this.messageSource.getMessage("drawing.point", new Object[] {center.getX(),center.getY()}, "Default point Message", null));
		
		System.out.println(this.messageSource.getMessage("greeting", null, "Default Greeting", null));
	}
}
