package axa.jpa.h2.axa_h2_jpa.dumm;

import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import axa.jpa.h2.axa_h2_jpa.entitiess.ChildernEnty;
import axa.jpa.h2.axa_h2_jpa.reposs.ChildrenRepos;


@RestController
public class ChildrenController {
	@Autowired	
    ChildrenRepos repo;

	
	@GetMapping("/childrens")
	public List<ChildernEnty> getAllChildrens()
	{
		return repo.findAll();
		
		
	}
	@GetMapping("/children/{name}")
	public List<ChildernEnty> getEmployeeByName(@PathVariable String name)
	{		
		return repo.findByName(name);
		
	}
	
	@PostMapping("/children")
	public ChildernEnty saveemloyee(@RequestBody ChildernEnty emp)
	{
		//return repo.save(emp);
		return repo.saveAndFlush(emp);
		
	}
	@PutMapping("/children/{name}")
	public String updateEmloyee( @PathVariable String name)
	{
		String s="Not found";
		List<ChildernEnty> service=repo.findByName(name);
		if(service.size()!=0)
		
		{
			for( ChildernEnty e:service)
			repo.saveAndFlush(e);
			
			s="Updated";
		}
		
		
		return s;
		
	}
	
	@DeleteMapping("/children/{name}")
	public String deleteEmloyee(@PathVariable String name)
	{
		String s="Not found";
		List<ChildernEnty> service=repo.findByName(name);
		if(service.size()!=0)		
		{
			for( ChildernEnty e:service)
			repo.delete(e);
			s="deleted";
		}
		
		
		return s;
		
	}
	
	@Autowired
	@PersistenceContext
    private  EntityManager entityManager;
	
	@GetMapping("childsbyparentid/{id}")
	public List<ChildernEnty> getChildsByParentID(@PathVariable int id)
	{
		return entityManager.createNamedQuery("getAllChildsByParentId", ChildernEnty.class).setParameter("parentId", id).getResultList();
		
		
		//return null;
	}
}
