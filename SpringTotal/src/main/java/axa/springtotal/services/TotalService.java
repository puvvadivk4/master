package axa.springtotal.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class TotalService {
	
public  List<TotalEntity> list=new ArrayList<TotalEntity>();	
	
	public TotalService()
	{
		list.add(new TotalEntity(1,"John"));
		list.add(new TotalEntity(2,"Lie"));
		list.add(new TotalEntity(3,"huai"));		
		
		
	}
	
	
	//get
	public List<TotalEntity> getAllTotalEntity()
	{
		return list;
	}
	
	//get id
	public TotalEntity getById(int id)
	{
		return list.stream().filter(m -> m.getId()==id).findAny().orElse(null);
	}
	
	//put
	public String updateTotal(TotalEntity e)
	{
		
	 list.parallelStream().filter(m -> m.getId()==e.getId()).map(h->{
	 h.setName(e.getName());	 
		 return h;
	 }			 
			 ).findFirst().get();
	 return "Update/PUT done";
	
	}	
	//post
	public String addTotal(TotalEntity e)
	{
	    list.add(e);
	    return "POST DONE";
	}
	
	//delete
	public String deleteTotal(int i)
	{
		list.removeIf(q->q.getId()==i);
	    return "delete DONE";
	}
}
