package com.example.podhead;

import java.io.Serializable;

public class Compressorpresets implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean compressoron=true;
	private int lvl=25;
	private int thld=-5;
	private int ratio=2;
	private int gain=50;
	private int attack=10;
	private int release=5;
	
	
	public Compressorpresets() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean getCompressoron() {
		return compressoron;
	}

	public void setCompressoron(boolean compressoron) {
		this.compressoron = compressoron;
	}

	public int getLvl() {
		return lvl;
	}

	public void setLvl(int lvl) {
		this.lvl = lvl;
	}

	public int getThld() {
		return thld;
	}

	public void setThld(int thld) {
		this.thld = thld;
	}

	public int getRatio() {
		return ratio;
	}

	public void setRatio(int ratio) {
		this.ratio = ratio;
	}

	public int getGain() {
		return gain;
	}

	public void setGain(int gain) {
		this.gain = gain;
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
