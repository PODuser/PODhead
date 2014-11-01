package com.example.podhead;

import java.io.Serializable;

public class Noisegatepresets implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean noisegateon=true;
	private int thld=-3;
	private int atten=2;
	private int attack=5;
	private int release=2;
	
	
	public Noisegatepresets() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean getNoisegateon() {
		return noisegateon;
	}

	public void setNoisegateon(boolean noisegateon) {
		this.noisegateon = noisegateon;
	}

	public int getThld() {
		return thld;
	}

	public void setThld(int thld) {
		this.thld = thld;
	}

	public int getAtten() {
		return atten;
	}

	public void setAtten(int atten) {
		this.atten = atten;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getRelease() {
		return release;
	}

	public void setRelease(int release) {
		this.release = release;
	}

}
