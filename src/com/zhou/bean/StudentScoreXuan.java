package com.zhou.bean;

public class StudentScoreXuan {
	
	private String ctsid;
	private int score;
	private int term;
	public String getCtsid() {
		return ctsid;
	}
	public void setCtsid(String ctsid) {
		this.ctsid = ctsid;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getTerm() {
		return term;
	}
	public void setTerm(int term) {
		this.term = term;
	}
	public StudentScoreXuan(String ctsid, int score, int term) {
		super();
		this.ctsid = ctsid;
		this.score = score;
		this.term = term;
	}
	public StudentScoreXuan() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "StudentScoreXuan [ctsid=" + ctsid + ", score=" + score
				+ ", term=" + term + "]";
	}
	
}
