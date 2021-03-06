package com.simplilearn.webapp.bean;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent {

	private static final long serialVersionUID = 1L;
	
	// create a event.
	public CustomEvent(Object source) {
		super(source);
	}

	public String toString() {
		return "--- This is a custom event ---";
	}
}
