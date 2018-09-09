package com.example.demo.pojo.pby;

import java.util.List;

public class Studentexam {

	private Integer studentexamid;
	private Integer examid;
	private String studentid;
	private String okdate;
	private double score;
	private List<Class> class1;
	private List<User> User;
	public Integer getStudentexamid() {
		return studentexamid;
	}
	public void setStudentexamid(Integer studentexamid) {
		this.studentexamid = studentexamid;
	}
	public Integer getExamid() {
		return examid;
	}
	public void setExamid(Integer examid) {
		this.examid = examid;
	}
	public String getStudentid() {
		return studentid;
	}
	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}
	public String getOkdate() {
		return okdate;
	}
	public void setOkdate(String okdate) {
		this.okdate = okdate;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	
	public List<Class> getClass1() {
		return class1;
	}
	public void setClass1(List<Class> class1) {
		this.class1 = class1;
	}
	public List<User> getUser() {
		return User;
	}
	public void setUser(List<User> user) {
		User = user;
	}
	@Override
	public String toString() {
		return "Studentexam [studentexamid=" + studentexamid + ", examid=" + examid + ", studentid=" + studentid
				+ ", okdate=" + okdate + ", score=" + score + "]";
	}
}
