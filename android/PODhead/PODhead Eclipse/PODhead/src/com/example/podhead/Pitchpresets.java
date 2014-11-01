package com.example.podhead;

import java.io.Serializable;

public class Pitchpresets implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean pitchon=true; 
	private int fx=15;
	private int lvl=100;
	private int bal=0;
	private int shfta=4;
	private int dtna=10;
	private int shftb=4;
	private int dtnb=10;
	private int outa=100;
	private int outb=100;
	private int pana=30;
	private int panb=30;
	
	public Pitchpresets() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean getPitchon() {
		return pitchon;
	}

	public void setPitchon(boolean pitchon) {
		this.pitchon = pitchon;
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

	public int getShfta() {
		return shfta;
	}

	public void setShfta(int shfta) {
		this.shfta = shfta;
	}

	public int getDtna() {
		return dtna;
	}

	public void setDtna(int dtna) {
		this.dtna = dtna;
	}

	public int getShftb() {
		return shftb;
	}

	public void setShftb(int shftb) {
		this.shftb = shftb;
	}

	public int getDtnb() {
		return dtnb;
	}

	public void setDtnb(int dtnb) {
		this.dtnb = dtnb;
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

}
