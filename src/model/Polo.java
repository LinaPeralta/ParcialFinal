package model;

import processing.core.PApplet;

public class Polo {
	
	private int x,y;
	private int tam = 50;
	private PApplet app;
	
	
	public Polo(int x,int y,int tam) {
		this.x = x;
		this.y = y;
		this.app = app;
	}
	
	public void pintar() {

		app.fill(10,88,144);
		app.ellipse(x, y, tam, tam);
		
	}

}
