package lab10.labSpring;

import java.util.Date;

public class EmployeeSchool {
	private String empSchoolName;
	private int schoolID;
	private Date doc;
	public String getEmpSchoolName() {
		return empSchoolName;
	}
	public void setEmpSchoolName(String empSchoolName) {
		this.empSchoolName = empSchoolName;
	}
	public int getSchoolID() {
		return schoolID;
	}
	public void setSchoolID(int schoolID) {
		this.schoolID = schoolID;
	}
	public Date getdoc() {
		return doc;
	}
	public void setdoc(Date doc) {
		this.doc = doc;
	}
	public void spawnSchool(){
		System.out.println("Employee School: " + getEmpSchoolName() + " with School ID: " + getSchoolID() + " was created on date: " + getdoc());
	}
}
