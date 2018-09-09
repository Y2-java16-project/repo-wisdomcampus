package com.example.demo.pojo.pby;

public class MyClass {
	private Integer classId;
	private String classNo;
	private String className;
	private Integer semesterId;
	private Integer bzrId;
	private Integer jyId;
	private String openTime;
	private String closeTime;
	private Integer classState;
	private String userId;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Integer getClassId() {
		return classId;
	}
	public void setClassId(Integer classId) {
		this.classId = classId;
	}
	public String getClassNo() {
		return classNo;
	}
	public void setClassNo(String classNo) {
		this.classNo = classNo;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public Integer getSemesterId() {
		return semesterId;
	}
	public void setSemesterId(Integer semesterId) {
		this.semesterId = semesterId;
	}
	public Integer getBzrId() {
		return bzrId;
	}
	public void setBzrId(Integer bzrId) {
		this.bzrId = bzrId;
	}
	public Integer getJyId() {
		return jyId;
	}
	public void setJyId(Integer jyId) {
		this.jyId = jyId;
	}
	public String getOpenTime() {
		return openTime;
	}
	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}
	public String getCloseTime() {
		return closeTime;
	}
	public void setCloseTime(String closeTime) {
		this.closeTime = closeTime;
	}
	public Integer getClassState() {
		return classState;
	}
	public void setClassState(Integer classState) {
		this.classState = classState;
	}
	@Override
	public String toString() {
		return "Class [classId=" + classId + ", classNo=" + classNo + ", className=" + className + ", semesterId="
				+ semesterId + ", bzrId=" + bzrId + ", jyId=" + jyId + ", openTime=" + openTime + ", closeTime="
				+ closeTime + ", classState=" + classState + ", userId=" + userId + "]";
	}
	
}
