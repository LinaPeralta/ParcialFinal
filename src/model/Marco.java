package model;

import processing.core.PApplet;

public class Marco {
	
	
	private int x,y;
	private int tam = 50;
	private PApplet app;
	
	
	public Marco(int x,int y,int tam) {
		this.x = x;
		this.y = y;
		this.app = app;
	}
	
	public void pintar() {
		app.fill(190,78,50);
		app.ellipse(x, y, tam, tam);
		
	}
}
