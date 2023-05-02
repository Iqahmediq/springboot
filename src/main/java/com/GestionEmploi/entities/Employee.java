package com.GestionEmploi.entities;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "Employee")
public class Employee implements Serializable{
@Id
@GeneratedValue( strategy = GenerationType.IDENTITY)
private Long id;
private String employeeFirstName;
private String employeeLasttName;
private String employeePhone;
public Long getId() {
return id;
}
public void setId(Long id) {
this.id = id;
}
public String getEmployeeFirstName() {
return employeeFirstName;
}
public void setEmployeeFirstName(String employeeFirstName) {
this.employeeFirstName = employeeFirstName;
}
public String getEmployeeLasttName() {
return employeeLasttName;
}
public void setEmployeeLasttName(String employeeLasttName) {
this.employeeLasttName = employeeLasttName;
}
public String getEmployeePhone() {
return employeePhone;
}
public void setEmployeePhone(String employeePhone) {
this.employeePhone = employeePhone;
}
public Department getDepartment() {
return department;
}
public void setDepartment(Department department) {
this.department = department;
}
@ManyToOne
Department department;
}