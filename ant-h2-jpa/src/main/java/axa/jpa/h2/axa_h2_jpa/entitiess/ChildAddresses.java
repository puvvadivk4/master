package axa.jpa.h2.axa_h2_jpa.entitiess;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedAttributeNode;
import javax.persistence.NamedEntityGraph;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
@Table(name="AXA_CHILD_Addresses",schema="own_schema",catalog="my_db")
public class ChildAddresses {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="childAddressId")
	private int ChildAddressId;
	
	public ChildernEnty getChildernEntity() {
		return childernEntity;
	}
	public void setChildernEntity(ChildernEnty childernEntity) {
		this.childernEntity = childernEntity;
	}
	@Column(name="Address1")
	private String Address1;
	
	@Column(name="Address2")
	private String Address2;
	
	@ManyToOne(fetch = FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinColumn(name="childId")	
	@JsonBackReference
	private ChildernEnty childernEntity;
	
	public int getChildAddressId() {
		return ChildAddressId;
	}
	public void setChildAddressId(int childAddressId) {
		ChildAddressId = childAddressId;
	}
	public String getAddress1() {
		return Address1;
	}
	public void setAddress1(String address1) {
		Address1 = address1;
	}
	public String getAddress2() {
		return Address2;
	}
	public void setAddress2(String address2) {
		Address2 = address2;
	}
	
	@OneToMany(mappedBy="childernAddressEntity",cascade = CascadeType.ALL,orphanRemoval = true)
	@JsonIgnore	
	@JsonManagedReference
	private Set<ChildLastFour> childFourList;

	public Set<ChildLastFour> getChildAddressList() {
		return childFourList;
	}
}
