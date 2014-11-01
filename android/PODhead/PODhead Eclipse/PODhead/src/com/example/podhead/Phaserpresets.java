package com.example.podhead;

import java.io.Serializable;

public class Phaserpresets implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean phaseron=true;
	private int fx=25;
	private int lvl=25;
	private int bal=0;
	private float speed=.1f;
	private int fdback=50;
	private int outa=50;
	private int outb=50;
	private int pana=0;
	private int panb=0;
	private int outl=10;
	private int outr=10;
	
	
	public Phaserpresets() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean getPhaseron() {
		return phaseron;
	}

	public void setPhaseron(boolean phaseron) {
		this.phaseron = phaseron;
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

	public int getBal() {
		return bal;
	}

	public void setBal(int bal) {
		this.bal = bal;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	public int getFdback() {
		return fdback;
	}

	public void setFdback(int fdback) {
		this.fdback = fdback;
	}

	public int getOuta() {
		return outa;
	}

	public void setOuta(int outa) {
		this.outa = outa;
	}

	public int getOutb() {
		return outb;
	}

	public void setOutb(int outb) {
		this.outb = outb;
	}

	public int getPana() {
		return pana;
	}

	public void setPana(int pana) {
		this.pana = pana;
	}

	public int getPanb() {
		return panb;
	}

	public void setPanb(int panb) {
		this.panb = panb;
	}

	public int getOutl() {
		return outl;
	}

	public void setOutl(int outl) {
		this.outl = outl;
	}

	public int getOutr() {
		return outr;
	}

	public void setOutr(int outr) {
		this.outr = outr;
	}

}
