package com.lk3;
/**
 * 图的边的属性类
 * @author mac1094
 *
 */

public class Vertex {
	private String value;
	boolean visited;     

	public Vertex(String value) {
		super();
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Vertex";
	}
	

}
