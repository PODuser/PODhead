package com.example.podhead;

import java.io.Serializable;

public class Detunepresets implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean detuneon=true;
	private int lvl=25;
	private int bal=0;
	private int dtna=10;
	private int dtnb=10;	
	private int dtnc=10;	
	private int dtnd=10;	
	private int outa=50;	
	private int outb=50;	
	private int outc=50;	
	private int outd=50;	
	private int spread=1;
	
	public Detunepresets() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean getDetuneon() {
		return detuneon;
	}

	public void setDetuneon(boolean detuneon) {
		this.detuneon = detuneon;
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

	public int getDtna() {
		return dtna;
	}

	public void setDtna(int dtna) {
		this.dtna = dtna;
	}

	public int getDtnb() {
		return dtnb;
	}

	public void setDtnb(int dtnb) {
		this.dtnb = dtnb;
	}

	public int getDtnc() {
		return dtnc;
	}

	public void setDtnc(int dtnc) {
		this.dtnc = dtnc;
	}

	public int getDtnd() {
		return dtnd;
	}

	public void setDtnd(int dtnd) {
		this.dtnd = dtnd;
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

	public int getOutc() {
		return outc;
	}

	public void setOutc(int outc) {
		this.outc = outc;
	}

	public int getOutd() {
		return outd;
	}

	public void setOutd(int outd) {
		this.outd = outd;
	}

	public int getSpread() {
		return spread;
	}

	public void setSpread(int spread) {
		this.spread = spread;
	}

}
