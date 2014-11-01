package com.example.podhead;

import java.io.Serializable;

public class Flangepresets implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean flangeon=true;
	private int fx=25;
	private float lvl=10;
	private int balance=0;
	private float speed=.3f;
	private float depth=30f;
	private int fdback=50;

	
	public Flangepresets() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean getFlangeon() {
		return flangeon;
	}

	public void setFlangeon(boolean flangeon) {
		this.flangeon = flangeon;
	}

	public int getFx() {
		return fx;
	}

	public void setFx(int fx) {
		this.fx = fx;
	}

	public float getLvl() {
		return lvl;
	}

	public void setLvl(float lvl) {
		this.lvl = lvl;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	public float getDepth() {
		return depth;
	}

	public void setDepth(float depth) {
		this.depth = depth;
	}

	public int getFdback() {
		return fdback;
	}

	public void setFdback(int fdback) {
		this.fdback = fdback;
	}

}
