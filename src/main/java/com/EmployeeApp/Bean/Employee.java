package com.EmployeeApp.Bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("emp")
@Scope("prototype")
public class Employee {
	@Value("${Employee.eId}")
  private int eId;
    @Value("${Employee.eName}")
  private String eName;
  private Departments eDep;
  

  public Employee(int eId, String eName) {
	super();
	this.eId = eId;
	this.eName = eName;
}
@Autowired
  public Employee(Departments dep) {
		super();
		this.eDep = dep;
	}


public int geteId() {
	return eId;
}
public void seteId(int eId) {
	this.eId = eId;
}
public String geteName() {
	return eName;
}
public void seteName(String eName) {
	this.eName = eName;
}
public Departments geteDep() {
	return eDep;
}
public void seteDep(Departments eDep) {
	this.eDep = eDep;
}
@Override
public String toString() {
	return "Employee [eId=" + eId + ", eName=" + eName + ", eDep=" + eDep.depInfo() + "]";
}
  
}
