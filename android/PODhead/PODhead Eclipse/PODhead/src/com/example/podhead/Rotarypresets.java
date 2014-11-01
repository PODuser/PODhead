package com.example.podhead;

import java.io.Serializable;

public class Rotarypresets implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean rotaryon=true;
	private int fx=25;
	private int lvl=25;
	private int bal=0;
	private int spread=10;
	private int phorn=10;
	private int protor=10;
	private int hlvl=10;
	private int rlvl=10;
	private float hspeed=.1f;
	private float rspeed=.1f;
	private int hdoppler=1;
	private int rdoppler=1;
	private int hdepth=20;
	private int rdepth=20;
	private int xover=10000;
	private int hacc=1;
	private int racc=1;
	
	public Rotarypresets() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean getRotaryon() {
		return rotaryon;
	}

	public void setRotaryon(boolean rotaryon) {
		this.rotaryon = rotaryon;
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

	public int getSpread() {
		return spread;
	}

	public void setSpread(int spread) {
		this.spread = spread;
	}

	public int getPhorn() {
		return phorn;
	}

	public void setPhorn(int phorn) {
		this.phorn = phorn;
	}

	public int getProtor() {
		return protor;
	}

	public void setProtor(int protor) {
		this.protor = protor;
	}

	public int getHlvl() {
		return hlvl;
	}

	public void setHlvl(int hlvl) {
		this.hlvl = hlvl;
	}

	public int getRlvl() {
		return rlvl;
	}

	public void setRlvl(int rlvl) {
		this.rlvl = rlvl;
	}

	public float getHspeed() {
		return hspeed;
	}

	public void setHspeed(float hspeed) {
		this.hspeed = hspeed;
	}

	public float getRspeed() {
		return rspeed;
	}

	public void setRspeed(float rspeed) {
		this.rspeed = rspeed;
	}

	public int getHdoppler() {
		return hdoppler;
	}

	public void setHdoppler(int hdoppler) {
		this.hdoppler = hdoppler;
	}

	public int getRdoppler() {
		return rdoppler;
	}

	public void setRdoppler(int rdoppler) {
		this.rdoppler = rdoppler;
	}

	public int getHdepth() {
		return hdepth;
	}

	public void setHdepth(int hdepth) {
		this.hdepth = hdepth;
	}

	public int getRdepth() {
		return rdepth;
	}

	public void setRdepth(int rdepth) {
		this.rdepth = rdepth;
	}

	public int getXover() {
		return xover;
	}

	public void setXover(int xover) {
		this.xover = xover;
	}

	public int getHacc() {
		return hacc;
	}

	public void setHacc(int hacc) {
		this.hacc = hacc;
	}

	public int getRacc() {
		return racc;
	}

	public void setRacc(int racc) {
		this.racc = racc;
	}

}
