package pl.codeme.oop;

import java.io.Serializable;

public class Point implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private char mark;
	
	public Point() {
		this.mark = '.'; 
	}

	public char getMark() {
		return mark;
	}

	public void setMark(char mark) {
		this.mark = mark;
	}
}
