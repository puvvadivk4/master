package axa.jpa.h2.axa_h2_jpa.reposs;

import java.util.List;

import javax.persistence.NamedEntityGraph;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.EntityGraph.EntityGraphType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.dsl.StringPath;

import axa.axa.jpa.h2.axa_h2_jpa.projectioninterfaces.NoChilds;
import axa.jpa.h2.axa_h2_jpa.customrepos.IEmpCustomRepo;
import axa.jpa.h2.axa_h2_jpa.entitiess.EmployeeEntety;
import axa.jpa.h2.axa_h2_jpa.entitiess.QEmployeeEntety;


@RepositoryRestResource(collectionResourceRel = "employeeentity",path = "employeeentity")
public interface EmpRepo extends JpaRepository<EmployeeEntety,Long>,QuerydslPredicateExecutor<EmployeeEntety>,QuerydslBinderCustomizer<QEmployeeEntety>,IEmpCustomRepo{

	//public List<EmployeeEntety> findByName(String name);
	//public List<EmployeeEntety> findByName(String name,Predicate predicate);
	
	 public List<EmployeeEntety> findByName(String name);
	
	 @Override
	    default public void customize(QuerydslBindings bindings, QEmployeeEntety qemp) {
	 //bindings.bind(qemp.name).first((StringPath path, String value) -> path.equalsIgnoreCase(value));
		// bindings.bind(String.class).first((StringPath path, String value) -> path.equalsIgnoreCase(value));
		 bindings.bind(String.class).first((StringPath path, String value) -> path.containsIgnoreCase(value));
		 bindings.bind(qemp.empId).as("empIdValue").withDefaultBinding();		 
		
	    }
	
	// public List<EmployeeEntety> findByGivenName();
	 
	 
	 @Override	 
	@EntityGraph(value="XMLempEntityGraph",type=EntityGraphType.FETCH)	 
	 public List<EmployeeEntety> findAll();
	 

/*	 @Override	 
		@EntityGraph(value="XMLempEntityGraph",type=EntityGraphType.FETCH)	 
	 public Page<EmployeeEntety> findAll(Pageable pageable);*/
	 

	 @Override	 
		@EntityGraph(value="XMLempEntityGraph",type=EntityGraphType.FETCH)	 
	 Iterable<EmployeeEntety> findAll(Predicate predicate);

	 @Override	 
		@EntityGraph(value="XMLempEntityGraph",type=EntityGraphType.FETCH)	 
	 public Page<EmployeeEntety> findAll(Predicate predicate,Pageable pageable);
		 
	                            
	
}
