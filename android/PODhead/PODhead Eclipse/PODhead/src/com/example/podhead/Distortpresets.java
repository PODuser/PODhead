package com.example.podhead;

import java.io.Serializable;

public class Distortpresets implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean distorton = true;
	private float again=3f;
	private float alvl=10;
	private float bgain=8.5f;
	private float blvl=10;
	private float atreble=5f;
	private float amid=5f;
	private float abass=5f;
	private float btreble=5f;
	private float bmid=5f;
	private float bbass=5f;
	private int diga=50;
	private int digb=50;
	
	public Distortpresets() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean getDistorton() {
		return distorton;
	}

	public void setDistorton(boolean distorton) {
		this.distorton = distorton;
	}

	public float getAgain() {
		return again;
	}

	public void setAgain(float again) {
		this.again = again;
	}

	public float getAlvl() {
		return alvl;
	}

	public void setAlvl(float alvl) {
		this.alvl = alvl;
	}

	public float getBgain() {
		return bgain;
	}

	public void setBgain(float bgain) {
		this.bgain = bgain;
	}

	public float getBlvl() {
		return blvl;
	}

	public void setBlvl(float blvl) {
		this.blvl = blvl;
	}

	public float getAtreble() {
		return atreble;
	}

	public void setAtreble(float atreble) {
		this.atreble = atreble;
	}

	public float getAmid() {
		return amid;
	}

	public void setAmid(float amid) {
		this.amid = amid;
	}

	public float getAbass() {
		return abass;
	}

	public void setAbass(float abass) {
		this.abass = abass;
	}

	public float getBtreble() {
		return btreble;
	}

	public void setBtreble(float btreble) {
		this.btreble = btreble;
	}

	public float getBmid() {
		return bmid;
	}

	public void setBmid(float bmid) {
		this.bmid = bmid;
	}

	public float getBbass() {
		return bbass;
	}

	public void setBbass(float bbass) {
		this.bbass = bbass;
	}

	public int getDiga() {
		return diga;
	}

	public void setDiga(int diga) {
		this.diga = diga;
	}

	public int getDigb() {
		return digb;
	}

	public void setDigb(int digb) {
		this.digb = digb;
	}

}
