package com.example.hrsh.demo.ents;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="personfinal")
public class Person {
	@Id
    @GeneratedValue
    @Column(name="column_id")
    private Long id;
	
	@Column(name="name")
    private String name;
	
	public Person(Long id, String name, int age, String emailId) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.emailId = emailId;
	}

	public Person() {
		super();
	}

	@Column(name="age")
    private int age;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Column(name="email")
    private String emailId;

}
