package com.zhou.bean;

public class StudentScoreBi {
	
	private String stuNum;
	private String ctcid;
	private int score;
	private int term;
	public String getStuNum() {
		return stuNum;
	}
	public void setStuNum(String stuNum) {
		this.stuNum = stuNum;
	}
	public String getCtcid() {
		return ctcid;
	}
	public void setCtcid(String ctcid) {
		this.ctcid = ctcid;
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
	@Override
	public String toString() {
		return "StudentScoreBi [stuNum=" + stuNum + ", ctcid=" + ctcid
				+ ", score=" + score + ", term=" + term + "]";
	}
	public StudentScoreBi(String stuNum, String ctcid, int score, int term) {
		super();
		this.stuNum = stuNum;
		this.ctcid = ctcid;
		this.score = score;
		this.term = term;
	}
	public StudentScoreBi() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
