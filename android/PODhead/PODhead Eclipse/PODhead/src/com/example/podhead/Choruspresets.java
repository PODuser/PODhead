package com.example.podhead;

import java.io.Serializable;

public class Choruspresets implements Serializable  { /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean choruson=true;
	private int fx=40;
	private int lvl=70;
	private float speed=.3f;
	private float depth=4f;
	private float delay=40f;

	public Choruspresets(){ 
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean getChoruson() {
		return choruson;
	}

	public void setChoruson(boolean choruson) {
		this.choruson = choruson;
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

	public float getDelay() {
		return delay;
	}

	public void setDelay(float delay) {
		this.delay = delay;
	}

}
