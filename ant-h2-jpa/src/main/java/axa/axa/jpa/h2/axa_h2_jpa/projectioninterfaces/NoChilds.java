package axa.axa.jpa.h2.axa_h2_jpa.projectioninterfaces;

import java.util.Set;

import org.springframework.data.rest.core.config.Projection;

import axa.jpa.h2.axa_h2_jpa.entitiess.ChildernEnty;
import axa.jpa.h2.axa_h2_jpa.entitiess.EmployeeEntety;

@Projection(name = "NoChildList", types =EmployeeEntety.class )
public interface NoChilds {
	
	public String getName();
	public double getSalary();
	public Set<ChildernEnty> getChildList();
}
