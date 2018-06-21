package axa.jpa.h2.axa_h2_jpa.dumm;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.hateoas.Link;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import axa.jpa.h2.axa_h2_jpa.entitiess.ChildernEnty;
import axa.jpa.h2.axa_h2_jpa.entitiess.EmployeeEntety;
import axa.jpa.h2.axa_h2_jpa.entitiess.QEmployeeEntety;
import axa.jpa.h2.axa_h2_jpa.reposs.EmpRepo;

import com.querydsl.core.types.Predicate;





@RestController
public class SeeController  {
	
	@Autowired	
    EmpRepo repo;
	
	
	@GetMapping("/employees")
	public List<EmployeeEntety> getAllEmployees()
	{
		List<EmployeeEntety> ls=null;
		
		try{
			
	ls	= repo.findAll();
	
	System.out.println(ls.size());
	System.out.println(ls.get(0).getChildList().size());
	
	// child address count
	System.out.println("start");
	//System.out.println(ls.get(0).getChildList().get(0).getChildAddressList().size());
	//System.out.println(ls.get(0).getChildList().get(0).getChildAddressList().get(0).getAddress1());
	//end
	/*if(ls.size()==1)
		System.out.println(ls.get(0).getId()+"---"+ls.get(0).getName()+"----"+ls.get(0).getChildList().get(0).getId());
	System.out.println(ls.size());*/
	/*
	 e=new EmployeeEntety();
	e.setId(ls.get(0).getId());
	e.setName(ls.get(0).getName());
		e.setChildList(ls.get(0).getChildList());*/
/*
		System.out.println(ls.get(0).getChildList().get(0).getId());
		System.out.println(ls.get(0).getChildList().get(0).getName());*/
		}
		catch(Exception err){
		System.out.println(err.getMessage());
		}
		//System.out.println(ls);
		//System.out.println(((List<EmployeeEntety>) ls).get(0).getChildList().size());
		return ls;			
	}
	@GetMapping("/employee/{name}")
	public List<EmployeeEntety> getEmployeeByName(@PathVariable String name)
	{		
		return repo.findByName(name);

	}
	
	@PostMapping("/employee")
	public EmployeeEntety saveemloyee(@RequestBody EmployeeEntety emp)
	{
	/*List<ChildernEnty> list=new ArrayList<ChildernEnty>();
		
		ChildernEnty ent=new ChildernEnty();
		ent.setName("bhvchildinside22");
		list.add(ent);
		emp.setChildList(list);*/		
		
		System.out.println(emp.getChildList().size());
		//System.out.println(emp.getChildList().get(0).getName());
		EmployeeEntety e=null;
	      e=	repo.save(emp);
		//return repo.saveAndFlush(emp);
	return e;
		
	}
	@PutMapping("/employee/{name}")
	public String updateEmloyee( @PathVariable String name,@RequestBody EmployeeEntety emp)
	{
		String s="Not found";
		List<EmployeeEntety> service=null;//repo.findByName(name);
		if(service.size()!=0)
		
		{
			for( EmployeeEntety e:service)
			{
				e.setName(emp.getName());
			//repo.saveAndFlush(e);
			}
			s="Updated";
		}
		
		return s;
		
	}
	
	@DeleteMapping("/employee/{name}")
	public String deleteEmloyee(@PathVariable String name)
	{
		String s="Not found";
		List<EmployeeEntety> service=null;//repo.findByName(name);
		if(service.size()!=0)		
		{
			for( EmployeeEntety e:service)
			repo.delete(e);
			s="deleted";
		}
		
		
		return s;
		
	}
	
	@Autowired
	@PersistenceContext
    private  EntityManager entityManager;
	
	@GetMapping("axa/entgrp")
	public List<EmployeeEntety> getAllEmpUsingEntityGraph()
	{
		
//		EntityGraph graph = entityManager.getEntityGraph("empEntityGraph");
		
		// return entityManager.createNamedQuery("empFindAll",EmployeeEntety.class)
             //   .setHint("javax.persistence.fetchgraph", entityManager.getEntityGraph("empEntityGraph"))
               //  .getResultList();
		List<EmployeeEntety> list=	entityManager.createNamedQuery("empFindAll",EmployeeEntety.class)
          .setHint("javax.persistence.fetchgraph", entityManager.getEntityGraph("empEntityGraph"))
            .getResultList();
		
		
		System.out.println("==============");
		System.out.println(list.get(0).getChildList().size());		
		//System.out.println(list.get(0).getChildList().get(1).getEmp().empId);
		//System.out.println(list.get(1).getChildList().get(0).getEmp().empId);
		//System.out.println(list.get(1).getChildList().get(0).getChildAddressList().get(0).getAddress1());
		System.out.println("===========end=============");
		System.out.println(list.size());
		return list;
	}
	
	@GetMapping("axa/entgrp/child")
	public List<ChildernEnty> getAllChildsUsingEntityGraph()
	{
		
		List<ChildernEnty> list= entityManager.createNamedQuery("getchildAll",ChildernEnty.class)
		          .setHint("javax.persistence.fetchgraph", entityManager.getEntityGraph("empEntityGraphchild"))
		            .getResultList();
		return list;
	}
	
	
	
	/*//Querydsl==============================
	@Autowired
	private EntityManager entityManager;
	
	@GetMapping("/querydsl")
	public List<EmployeeEntety> getQueryds()
	{
		QEmployeeEntety emp=QEmployeeEntety.employeeEntety;
		QChildernEnty child=QChildernEnty.childernEnty;
		JPAQuery query = new JPAQuery(entityManager);
	long l=query.from(emp).where(emp.name.eq("emp2")).count();
		List<EmployeeEntety> list=query.from(emp).leftJoin(emp.childList,child).where(emp.empId.eq(child.emp.empId)).list(emp);
		
		return list;
	}
	
	@PostMapping("/querydsl")
	public String setdataQuerydsl(@RequestBody EmployeeEntety emp)
	{
		QEmployeeEntety qemp=QEmployeeEntety.employeeEntety;
		JPAQuery query = new JPAQuery(entityManager);
		
		//query.set(arg0, arg1)
		
		return "";
	}	
	*/
	
	
	@GetMapping("/querydslpredicate")
	public List<EmployeeEntety>  getQuerydslPredicate(@QuerydslPredicate(root=EmployeeEntety.class) Predicate predicate)
	{
		return (List<EmployeeEntety>) repo.findAll(predicate);
		
	}
	
	
	
	//Predicate and pageable
	@GetMapping("/predicatepageable")
	public Page<EmployeeEntety>  getQuerydslPredicateAndpageable(Predicate predicate,Pageable pageable)
	{
		System.out.println();
		return  repo.findAll(predicate,pageable);
		
	}
	
	
	
	
	
	
	
	//Querdsl com.dsl
	
	@GetMapping("/querydsl")
	public List<EmployeeEntety> getQuerydslcom(@QuerydslPredicate(root = EmployeeEntety.class) Predicate predicate)
	{
		
	 predicate=	QEmployeeEntety.employeeEntety.name.eq("emp2").and(QEmployeeEntety.employeeEntety.empId.eq(1));
     Iterable<EmployeeEntety>    ittr=	repo.findAll(predicate);       
     List<EmployeeEntety> list =new  ArrayList<EmployeeEntety>();
     for(EmployeeEntety em : ittr)
     {
    	 list.add(em);
     }
     //System.out.println(repo.findByGivenName().size());
		return list;
	}
	
	@GetMapping("/querydsl/{name}")
	public List<EmployeeEntety> getEmployeeByNameQuerydsl(@QuerydslPredicate(root = EmployeeEntety.class) Predicate predicate,@PathVariable String name)
	{		
		
		//return repo.findByName(name);
		return null;
	}
	
	
	//HATEOAS (Hypertext as the Engine of Application State).
	
	/*@GetMapping("/hateoas/{name}")
	public Resource<EmployeeEntety> getAllByHateoas(@PathVariable String name)
	{
		List<EmployeeEntety> list=repo.findByName(name);
		System.out.println(list.size());
		Resource<EmployeeEntety> resource=new Resource<EmployeeEntety>(list.get(0));
		EmployeeEntety e=new EmployeeEntety();
	      //e.add(linkTo(methodOn(SeeController.class)).withSelfRel());
		//List<EmployeeEntety> methodLinkBuilder=methodOn(SeeController.class).getAllByHateoas(name);
		resource.add(linkTo(methodOn(SeeController.class).getEmployeeByName(name)).withSelfRel());
		return resource;
	}*///NP
	
	@GetMapping("/hateoas/{name}")
	public List<EmployeeEntety> getAllByHateoas(@PathVariable String name)
	{
		List<EmployeeEntety> list=null;//repo.findByName(name);
		Link link=linkTo(SeeController.class).slash(list.get(0).getEmpId()).withSelfRel();
		
		EmployeeEntety e=list.get(0);
		e.add(link);
		
		return list;
	}

	@GetMapping("/hateoas/all")
	public List<EmployeeEntety> getAllByHateoasLoop()
	{
		List<EmployeeEntety> list=repo.findAll();
		
		for(EmployeeEntety e : list)
		{
		Link link=linkTo(SeeController.class).slash(e.getEmpId()).withSelfRel();			
		e.add(link);
		}
		return list;
	}
	@GetMapping("/hateoas/all/method")
	public List<EmployeeEntety> getAllByHateoasLoopByMethod()
	{
		List<EmployeeEntety> list=repo.findAll();
	
		for(EmployeeEntety e : list)
		{
			/*Link link=linkTo(SeeController.class).slash(e.getEmpId()).withSelfRel();	*/
			//Link link=linkTo(methodOn(SeeController.class).getAllByHateoasLoopByMethod()).withRel("rel");	
			Link link=linkTo(methodOn(SeeController.class).getEmployeeByName(e.getName())).withRel("rel");
			Link childlink=linkTo(methodOn(ChildrenController.class).getChildsByParentID(e.getEmpId())).withRel("getAllChildsByClickingLink");
			e.add(link);
			e.add(childlink);
			/*Link link2=linkTo(methodOn(SeeController.class).getAllEmpUsingEntityGraph()).withRel("rell");
			e.add(link2);*/
		}
		
		
		return list;	
	}
	
	
	///Pageable sample with inputs page=0&size=3&sort=name
	
	@GetMapping("/pageablesample")
	public Page<EmployeeEntety>  getByPageable(Pageable pageable)
	{
		Page<EmployeeEntety> pages= repo.findAll(pageable);
	
		System.out.println(pages.getTotalPages());
		return pages;
	}
	

	@PostMapping("/multipartfile")
	public  String uploadFileHandler(@RequestParam("file") MultipartFile file,@RequestPart("emp") EmployeeEntety e ) { 
	   
		if(file.getSize()!=0)
		{	
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++"+file.getName());
		System.out.println(file.getContentType());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getSize());
		}
		return "";
	}
	
	
	@GetMapping("/findallbycustom")
	public List<EmployeeEntety> findAllByCustomRepo()
	{
		List<EmployeeEntety> ls=null;		
		
		ls= repo.findByNameAndSalary("emp2",25.32);
	
	return ls;
	
	}
	
}