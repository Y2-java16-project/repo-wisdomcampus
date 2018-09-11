package com.example.demo.pojo.pby;

public class Attendance {
	private Integer attendanceId;
	private Integer uId;
	private String typeattendance;
	private String maxtime;
	private String mintime;
	private String attendancetime;
	private String remarks;
	public Integer getAttendanceId() {
		return attendanceId;
	}
	public void setAttendanceId(Integer attendanceId) {
		this.attendanceId = attendanceId;
	}
	public Integer getuId() {
		return uId;
	}
	public void setuId(Integer uId) {
		this.uId = uId;
	}
	public String getTypeattendance() {
		return typeattendance;
	}
	public void setTypeattendance(String typeattendance) {
		this.typeattendance = typeattendance;
	}
	public String getMaxtime() {
		return maxtime;
	}
	public void setMaxtime(String maxtime) {
		this.maxtime = maxtime;
	}
	public String getMintime() {
		return mintime;
	}
	public void setMintime(String mintime) {
		this.mintime = mintime;
	}
	public String getAttendancetime() {
		return attendancetime;
	}
	public void setAttendancetime(String attendancetime) {
		this.attendancetime = attendancetime;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@Override
	public String toString() {
		return "Attendance [attendanceId=" + attendanceId + ", uId=" + uId
				+ ", typeattendance=" + typeattendance + ", maxtime=" + maxtime
				+ ", mintime=" + mintime + ", attendancetime=" + attendancetime
				+ ", remarks=" + remarks + "]";
	}
}
