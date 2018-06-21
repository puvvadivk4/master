package axa.jpa.h2.axa_h2_jpa.entitiess;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedAttributeNode;
import javax.persistence.NamedEntityGraph;
import javax.persistence.NamedQuery;
import javax.persistence.NamedSubgraph;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="AXA_EMPLOYEE_SAM2",schema="own_schema",catalog="my_db")
@NamedEntityGraph(name="empEntityGraph",
					attributeNodes={@NamedAttributeNode(value="childList",subgraph="ordersGraph")},
						subgraphs = {
									@NamedSubgraph(name = "ordersGraph",attributeNodes = {@NamedAttributeNode(value = "childAddressList")})}
				)

@NamedQuery(name = "empFindAll", query = "SELECT e FROM EmployeeEntety e")//,ChildernEnty c,ChildAddresses ca where e.empId=c.emp.empId and c.childId=ca.childernEntity.childId")
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "empId")
public class EmployeeEntety  extends ResourceSupport{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="emp_id")
	public int empId;

	@Column(name="emp_name")
	private String name;
	@Column(name="column_salary")
	private double salary;
	
	
	@OneToMany(mappedBy="emp",cascade = CascadeType.ALL,orphanRemoval = false)
	@JsonIgnore
	//@JsonBackReference
	@JsonManagedReference //working
/*	@OneToMany(cascade = CascadeType.ALL, 
	        orphanRemoval = true)*/
	/*@JoinColumn(name="childId")*/
	private Set<ChildernEnty> childList;
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int id) {
		this.empId = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public EmployeeEntety() {
		
	}
	
	
	public Set<ChildernEnty> getChildList() {
		return childList;
	}
	public void setChildList(Set<ChildernEnty> childList) {
		//this.childList = childList;
				for (ChildernEnty childentity : childList)
				{ 
					childentity.setEmp(this);
				} 
		this.childList = childList;
	}
	
	/*public void addChildernEnty(ChildernEnty child)
	{
		
		child.setEmp(this);
		//this.childList.add(child);
	}*/
	

}
