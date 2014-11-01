package com.example.podhead;

import java.io.Serializable;

public class Reverbpresets implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean reverbon=true;
	private String type="Concert";
	private int fx=25;
	private int dlvl=100;
	private int bal=0;
	private int density=80;
	private int diff=30;
	private int dis=7;
	private int xover=300;
	private int freq=20000;
	private int damp=2;
	private float delay=2.54f;
	private int size=3;
	private int reflect=8;
	private int outl=25;
	private int outr=25;
	private int poutl=25;
	private int poutr=25;
				
	
	public Reverbpresets() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean getReverbon() {
		return reverbon;
	}

	public void setReverbon(boolean reverbon) {
		this.reverbon = reverbon;
	}

	public int getFx() {
		return fx;
	}

	public void setFx(int fx) {
		this.fx = fx;
	}

	public int getDlvl() {
		return dlvl;
	}

	public void setDlvl(int dlvl) {
		this.dlvl = dlvl;
	}

	public int getBal() {
		return bal;
	}

	public void setBal(int bal) {
		this.bal = bal;
	}

	public int getDensity() {
		return density;
	}

	public void setDensity(int density) {
		this.density = density;
	}

	public int getDiff() {
		return diff;
	}

	public void setDiff(int diff) {
		this.diff = diff;
	}

	public int getDis() {
		return dis;
	}

	public void setDis(int dis) {
		this.dis = dis;
	}

	public int getXover() {
		return xover;
	}

	public void setXover(int xover) {
		this.xover = xover;
	}

	public int getFreq() {
		return freq;
	}

	public void setFreq(int freq) {
		this.freq = freq;
	}

	public int getDamp() {
		return damp;
	}

	public void setDamp(int damp) {
		this.damp = damp;
	}

	public float getDelay() {
		return delay;
	}

	public void setDelay(float delay) {
		this.delay = delay;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getReflect() {
		return reflect;
	}

	public void setReflect(int reflect) {
		this.reflect = reflect;
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

	public int getPoutl() {
		return poutl;
	}

	public void setPoutl(int poutl) {
		this.poutl = poutl;
	}

	public int getPoutr() {
		return poutr;
	}

	public void setPoutr(int poutr) {
		this.poutr = poutr;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
