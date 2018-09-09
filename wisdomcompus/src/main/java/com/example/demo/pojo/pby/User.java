package com.example.demo.pojo.pby;

import java.sql.Date;
import java.util.List;

public class User {
	private String userId;
	private String userName;
	private String password;
	private int userType;
	private int classId;
	private int roleId;
	private String sex;
	private String identityCard;
	private String phone;
	private String address;
	private Date inDate;
	private Date outDate;
	private String description;
	private String pic;
	private int userState;
	private String img;
	private List<Studentexam> Studentexams;
	
	public List<Studentexam> getStudentexams() {
		return Studentexams;
	}
	public void setStudentexams(List<Studentexam> studentexams) {
		Studentexams = studentexams;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getUserType() {
		return userType;
	}
	public void setUserType(int userType) {
		this.userType = userType;
	}
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getIdentityCard() {
		return identityCard;
	}
	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getInDate() {
		return inDate;
	}
	public void setInDate(Date inDate) {
		this.inDate = inDate;
	}
	public Date getOutDate() {
		return outDate;
	}
	public void setOutDate(Date outDate) {
		this.outDate = outDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public int getUserState() {
		return userState;
	}
	public void setUserState(int userState) {
		this.userState = userState;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", userType=" + userType
				+ ", classId=" + classId + ", roleId=" + roleId + ", sex=" + sex + ", identityCard=" + identityCard
				+ ", phone=" + phone + ", address=" + address + ", inDate=" + inDate + ", outDate=" + outDate
				+ ", description=" + description + ", pic=" + pic + ", userState=" + userState + "]";
	}
}
