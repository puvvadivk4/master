package axa.jpa.h2.axa_h2_jpa.customrepos;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import com.querydsl.core.types.Predicate;
import com.querydsl.jpa.impl.JPAQuery;

import axa.jpa.h2.axa_h2_jpa.entitiess.EmployeeEntety;
import axa.jpa.h2.axa_h2_jpa.entitiess.QEmployeeEntety;

public class EmpCustomRepo extends QuerydslRepositorySupport implements IEmpCustomRepo{

	public EmpCustomRepo() {
		super(EmployeeEntety.class);

	}
	@Autowired
	private EntityManager entityManager;
	@Override
	public List<EmployeeEntety> findByNameAndSalary(String name, double salary) {
		QEmployeeEntety emp=QEmployeeEntety.employeeEntety;
		System.out.println("============================================================");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	//return 	from(emp).where(emp.name.eq(name).and(emp.salary.eq(salary))).fetch();
		return null;
	}
	
	/*public List<EmployeeEntety> findByName(String name)
	{
		QEmployeeEntety emp=QEmployeeEntety.employeeEntety;
		//QChildernEnty child=QChildernEnty.childernEnty;
		JPAQuery query = new JPAQuery(entityManager);
		System.out.println("============================================================");
		List<EmployeeEntety> list=(List<EmployeeEntety>) query.from(emp).where(emp.name.eq(name));
		//List<EmployeeEntety> list=query.from(emp).leftJoin(emp.childList,child).where(emp.empId.eq(child.emp.empId)).list(emp);		
		return list;
	}*/
	
	/*@Override
    public List<EmployeeEntety> findAllEmployeeEntety() {

       // QUser user = QUser.user;
        QEmployeeEntety emp=QEmployeeEntety.employeeEntety;

        //@formatter:off
        System.out.println("============================================================");
      return   from(emp).fetch();
        //@formatter:on
    }
*/
	
	

}
