package axa.jpa.h2.axa_h2_jpa.entitiess;

import java.io.Serializable;
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
import javax.persistence.ManyToOne;
import javax.persistence.NamedAttributeNode;
import javax.persistence.NamedEntityGraph;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


@Entity
@Table(name="AXA_CHILD_SAM2",schema="own_schema",catalog="my_db")
@NamedEntityGraph(name="empEntityGraphchild",attributeNodes={@NamedAttributeNode("emp")})
//@NamedQuery(name="getchildAll",query="select q from ChildernEnty q")
@NamedQuery(name="getAllChildsByParentId",query="select q from ChildernEnty q where q.emp.empId=:parentId")
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "childId")
public class ChildernEnty implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="child_id")
	private int childId;
	
	public ChildernEnty() {
		
	}

	public int getId() {
		return childId;
	}

	public void setId(int id) {
		this.childId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public EmployeeEntety getEmp() {
		return emp;
	}

	
	public void setEmp(EmployeeEntety emp) {
		this.emp = emp;
	}

	@Column(name="child_name")
	private String name;
	
	
	@ManyToOne(fetch = FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name="empId")
	//@JsonManagedReference
	@JsonBackReference //working
	private EmployeeEntety emp;
	
	/*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ChildernEnty )) return false;
        return (childId != 0 && childId!=((ChildernEnty)o).childId);
    }
    @Override
    public int hashCode() {
        return 31;
    }
	*/
	
	
	@OneToMany(mappedBy="childernEntity",cascade = CascadeType.ALL,orphanRemoval = true)
	@JsonIgnore	
	@JsonManagedReference
	private Set<ChildAddresses> childAddressList;

	public Set<ChildAddresses> getChildAddressList() {
		return childAddressList;
	}

	public void setChildAddressList(Set<ChildAddresses> childAddressList) {
		//this.childAddressList = childAddressList;
		
		for(ChildAddresses child : childAddressList)
		{
			child.setChildernEntity(this);
		}
		this.childAddressList = childAddressList;
	}
	
	/*public void addChildAddresses(ChildAddresses child)
	{
		child.setChildernEntity(this);
		//this.childAddressList.add(child);
		
	}*/
	
	
}
