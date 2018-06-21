package axa.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
@Table(name="employee_table",schema="employee",catalog="my_h2_db")
public class Employee {
	@Id
	@GeneratedValue
	@Column(name="column_id")
	private int id;
	@Column(name="column_name")
	private String name;
	@Column(name="column_salary")
	private double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
}
