package axa.jpa.h2.axa_h2_jpa.reposs;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;

import axa.jpa.h2.axa_h2_jpa.entitiess.ChildernEnty;
import axa.jpa.h2.axa_h2_jpa.entitiess.EmployeeEntety;
import axa.jpa.h2.axa_h2_jpa.entitiess.QChildernEnty;
import axa.jpa.h2.axa_h2_jpa.entitiess.QEmployeeEntety;


public interface ChildrenRepos extends JpaRepository<ChildernEnty, Long>,QuerydslPredicateExecutor<ChildernEnty>,QuerydslBinderCustomizer<QChildernEnty>{
	
	public List<ChildernEnty> findByName(String name);
	
	
	 default public void customize(QuerydslBindings bindings, QChildernEnty qchild) {
	 
	 }
}
