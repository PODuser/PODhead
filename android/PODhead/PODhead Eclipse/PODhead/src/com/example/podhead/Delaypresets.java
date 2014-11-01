package com.example.podhead;

import java.io.Serializable;

public class Delaypresets implements Serializable {

	private static final long serialVersionUID = 1L;
	private Boolean delayon=true;
	private int fx=25;
	private int dlvl=25;
	private int bal=0;
	private int time=333;
	private int fdbck=25;
	private int tapit=0;
	private int smear=0;
	private int lpf=0;
	private int freq=10000;
	
	
	public Delaypresets() {
		// TODO Auto-generated constructor stub
		setDelayon(false);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Boolean getDelayon() {
		return delayon;
	}

	public void setDelayon(Boolean delayon) {
		this.delayon = delayon;
	}

	public int getfx() {
		return fx;
	}

	public void setfx(int fx) {
		this.fx = fx;
	}

	public int getdlvl() {
		return dlvl;
	}

	public void setdlvl(int dlvl) {
		this.dlvl = dlvl;
	}

	public int getbal() {
		return bal;
	}

	public void setbal(int bal) {
		this.bal = bal;
	}

	public int gettime() {
		return time;
	}

	public void settime(int time) {
		this.time = time;
	}

	public int getfdbck() {
		return fdbck;
	}

	public void setfdbck(int fdbck) {
		this.fdbck = fdbck;
	}

	public int gettapit() {
		return tapit;
	}

	public void settapit(int tapit) {
		this.tapit = tapit;
	}

	public int getsmear() {
		return smear;
	}

	public void setsmear(int smear) {
		this.smear = smear;
	}

	public int getlpf() {
		return lpf;
	}

	public void setD_lpf(int lpf) {
		this.lpf = lpf;
	}

	public int getfreq() {
		return freq;
	}

	public void setfreq(int freq) {
		this.freq = freq;
	}

}
