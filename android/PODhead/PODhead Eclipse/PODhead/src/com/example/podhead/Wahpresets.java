package com.example.podhead;

import java.io.Serializable;

public class Wahpresets implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean wahon=true;
	private String type="Flight";
	private int fx=25;
	private int lvl=25;
	private int dry=50;
	private int bal=0;
	private int tshft=75;
	private int mshft=75;
	private int bshft=75;
	private int mdtn=10;
	private int pedal=100;
	private int depth=5;
	private int out=100;
	private int rotary=10;
	
	public Wahpresets() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean getWahon() {
		return wahon;
	}

	public void setWahon(boolean wahon) {
		this.wahon = wahon;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getFx() {
		return fx;
	}

	public void setFx(int fx) {
		this.fx = fx;
	}

	public int getLvl() {
		return lvl;
	}

	public void setLvl(int lvl) {
		this.lvl = lvl;
	}

	public int getDry() {
		return dry;
	}

	public void setDry(int dry) {
		this.dry = dry;
	}

	public int getBal() {
		return bal;
	}

	public void setBal(int bal) {
		this.bal = bal;
	}

	public int getTshft() {
		return tshft;
	}

	public void setTshft(int tshft) {
		this.tshft = tshft;
	}

	public int getMshft() {
		return mshft;
	}

	public void setMshft(int mshft) {
		this.mshft = mshft;
	}

	public int getBshft() {
		return bshft;
	}

	public void setBshft(int bshft) {
		this.bshft = bshft;
	}

	public int getMdtn() {
		return mdtn;
	}

	public void setMdtn(int mdtn) {
		this.mdtn = mdtn;
	}

	public int getPedal() {
		return pedal;
	}

	public void setPedal(int pedal) {
		this.pedal = pedal;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public int getOut() {
		return out;
	}

	public void setOut(int out) {
		this.out = out;
	}

	public int getRotary() {
		return rotary;
	}

	public void setRotary(int rotary) {
		this.rotary = rotary;
	}

}
