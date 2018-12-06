package lab10.labSpring;

import java.util.List;
import java.util.ArrayList;

public class Employee {
	private String empName;
	private int empID;
	private List empDeps = new ArrayList();
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public List getEmpDeps() {
		return empDeps;
	}
	public void setEmpDeps(List empDeps) {
		this.empDeps = empDeps;
	}
	public void empData(){
		System.out.println("Employee of name: " + getEmpName() + " with ID: " + getEmpID() + " is present in department: " + getEmpDeps().get(0));
	}

}
