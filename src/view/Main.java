package view;


import controller.Controller;
import model.Mundo;

import processing.core.PApplet;

public class Main extends PApplet {

	public static void main(String[] args) {
		PApplet.main("view.Main");
		//PApplet.main(Main.class.getName());
	}
	
    Controller controller;
	
	@Override
	public void settings() {
		size(500,500);	
	}
	

	@Override
	public void setup() {
			
	}
	

	@Override
	public void draw() {
		background(239,221,212);
		controller.draw();
		
	}

}
