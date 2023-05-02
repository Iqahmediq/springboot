package com.GestionEmploi.models;
public class EmployeeModel {
private String EmployeeFirstName;
private String EmployeeLastName;
private String EmployeePhoneNumber;
private long departmentId;
public long getDepartmentId() {
return departmentId;
}
public void setDepartmentId(long departmentId) {
this.departmentId = departmentId;
}
public String getEmployeeFirstName() {
return EmployeeFirstName;
}
public void setEmployeeFirstName(String employeeFirstName) {
EmployeeFirstName = employeeFirstName;
}
public String getEmployeeLastName() {
return EmployeeLastName;
}
public void setEmployeeLastName(String employeeLastName) {
EmployeeLastName = employeeLastName;
}
public String getEmployeePhoneNumber() {
return EmployeePhoneNumber;
}
public void setEmployeePhoneNumber(String employeePhoneNumber) {
EmployeePhoneNumber = employeePhoneNumber;
}}
