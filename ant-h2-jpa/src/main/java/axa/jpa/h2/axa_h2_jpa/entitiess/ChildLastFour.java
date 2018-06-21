package axa.jpa.h2.axa_h2_jpa.entitiess;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="AXA_CHILD_FOUR",schema="own_schema",catalog="my_db")
public class ChildLastFour {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="childFourId")
	private int childFourId;
	
	@Column(name="childFourName")
	private String childFourName;
	
	@ManyToOne(fetch = FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinColumn(name="ChildAddressId")	
	@JsonBackReference
	private ChildAddresses childernAddressEntity;
}
