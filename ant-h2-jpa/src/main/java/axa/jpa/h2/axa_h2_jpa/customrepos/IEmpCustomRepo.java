package axa.jpa.h2.axa_h2_jpa.customrepos;

import java.util.List;



import axa.jpa.h2.axa_h2_jpa.entitiess.EmployeeEntety;

public interface IEmpCustomRepo {
	
	public List<EmployeeEntety> findByNameAndSalary(String name,double salary);
	
}
