package com.example.podhead;

import java.io.Serializable;

public class Preset implements Serializable{

	private String pnum;
	private String pname;
	
	private static final long serialVersionUID = 1L;

	public Preset() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String getPnum() {
		return pnum;
	}

	public void setPnum(String pnum) {
		this.pnum = pnum;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

}
