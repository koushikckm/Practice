package org.koushik.hibernate.dto;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
@NamedQuery(name="EmployeeDetails.byId" , query="from EmployeeDetails where employeeId>?")
@NamedNativeQuery(name="EmployeeDetails.byName" , query="select * from EMPLOYEE_DETAILS  "
				+ "where EMPLOYEE_NAME=?", resultClass=EmployeeDetails.class)
@Table(name="EMPLOYEE_DETAILS")
public class EmployeeDetails {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="EMPLOYEE_ID")
	private int employeeId;
	
	@Column(name="EMPLOYEE_NAME")
	private String employeeName;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	
}
